package com.commerceootbpromotionengine.calculation;

import de.hybris.order.calculation.domain.Order;
import de.hybris.order.calculation.domain.OrderCharge;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ruleengineservices.calculation.MinimumAmountValidationStrategy;
import de.hybris.platform.ruleengineservices.calculation.NumberedLineItemLookupStrategy;
import de.hybris.platform.ruleengineservices.calculation.impl.DefaultRuleEngineCalculationService;
import de.hybris.platform.ruleengineservices.rao.*;
import de.hybris.platform.ruleengineservices.rule.evaluation.actions.RAOConsumptionSupport;
import de.hybris.platform.ruleengineservices.util.CurrencyUtils;
import de.hybris.platform.ruleengineservices.util.OrderUtils;
import de.hybris.platform.ruleengineservices.util.RaoUtils;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.springframework.beans.factory.annotation.Required;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class CustomRuleEngineCalculationService extends DefaultRuleEngineCalculationService {
    private MinimumAmountValidationStrategy minimumAmountValidationStrategy;
    private OrderUtils orderUtils;
    private CurrencyUtils currencyUtils;
    private RaoUtils raoUtils;
    private RAOConsumptionSupport consumptionSupport;
    private NumberedLineItemLookupStrategy lineItemLookupStrategy;
    private Populator<ProductModel, OrderEntryRAO> orderEntryRaoProductPopulator;

    protected BigDecimal convertPercentageDiscountOnDeliveryCost(BigDecimal percentageAmount, CartRAO cart) {
        BigDecimal valueToDiscount = cart.getDeliveryCost();
        return valueToDiscount.multiply(percentageAmount).divide(BigDecimal.valueOf(100.0F), RoundingMode.DOWN);
    }


    public ShipmentRAO changeDeliveryModeCost(CartRAO cartRao, DeliveryModeRAO mode, BigDecimal amount) {
        ServicesUtil.validateParameterNotNull(cartRao, "cart rao must not be null");
        ServicesUtil.validateParameterNotNull(amount, "amount must not be null");
        Order cart =  this.getAbstractOrderRaoToOrderConverter().convert(cartRao);
        removeShippingCharges(cart);
        if (cartRao.getDeliveryCost().doubleValue()>0 && Objects.nonNull(cart)) {
            BigDecimal newDeliveryCharge = cartRao.getDeliveryCost().subtract(convertPercentageDiscountOnDeliveryCost(amount, cartRao));
            OrderCharge orderCharge = createShippingCharge(cart, false, newDeliveryCharge);
            cart.addCharge(orderCharge);
            cartRao.setDeliveryCost(newDeliveryCharge);
            mode.setCost(newDeliveryCharge);
        }
        recalculateTotals(cartRao,cart);
        ShipmentRAO shipmentRAO = this.createShipmentRAO(mode);
        this.getRaoUtils().addAction(cartRao, shipmentRAO);
        return shipmentRAO;
    }

//    @Override
//    protected OrderDiscount createOrderDiscount(Order cart, boolean absolute, BigDecimal amount) {
//        Currency currency = cart.getCurrency();
//        BigDecimal adjustedDiscountAmount = absolute ? amount : this.convertPercentageDiscountToAbsoluteDiscount(amount, cart);
//        BigDecimal adjustedDiscountOnDeliveryMode;
//        if (!absolute) {
//            removeShippingCharges(cart);
//
//        }
//        AbstractAmount discountAmount = new Money(adjustedDiscountAmount, currency);
//        OrderDiscount discount = new OrderDiscount(discountAmount);
//        if (this.getMinimumAmountValidationStrategy().isOrderLowerLimitValid(cart, discount)) {
//            cart.addDiscount(discount);
//            return discount;
//        } else {
//            AbstractAmount zeroDiscountAmount = new Money(BigDecimal.ZERO, currency);
//            OrderDiscount zeroDiscount = new OrderDiscount(zeroDiscountAmount);
//            cart.addDiscount(zeroDiscount);
//            return zeroDiscount;
//        }
//    }

    protected MinimumAmountValidationStrategy getMinimumAmountValidationStrategy() {
        return this.minimumAmountValidationStrategy;
    }

    @Required
    public void setMinimumAmountValidationStrategy(MinimumAmountValidationStrategy minimumAmountValidationStrategy) {
        this.minimumAmountValidationStrategy = minimumAmountValidationStrategy;
    }

    protected OrderUtils getOrderUtils() {
        return this.orderUtils;
    }

    @Required
    public void setOrderUtils(OrderUtils orderUtils) {
        this.orderUtils = orderUtils;
    }

    protected CurrencyUtils getCurrencyUtils() {
        return this.currencyUtils;
    }

    @Required
    public void setCurrencyUtils(CurrencyUtils currencyUtils) {
        this.currencyUtils = currencyUtils;
    }

    protected RaoUtils getRaoUtils() {
        return this.raoUtils;
    }

    @Required
    public void setRaoUtils(RaoUtils raoUtils) {
        this.raoUtils = raoUtils;
    }

    protected RAOConsumptionSupport getConsumptionSupport() {
        return this.consumptionSupport;
    }

    @Required
    public void setConsumptionSupport(RAOConsumptionSupport consumptionSupport) {
        this.consumptionSupport = consumptionSupport;
    }

    protected NumberedLineItemLookupStrategy getLineItemLookupStrategy() {
        return this.lineItemLookupStrategy;
    }

    @Required
    public void setLineItemLookupStrategy(NumberedLineItemLookupStrategy lineItemLookupStrategy) {
        this.lineItemLookupStrategy = lineItemLookupStrategy;
    }

    protected Populator<ProductModel, OrderEntryRAO> getOrderEntryRaoProductPopulator() {
        return this.orderEntryRaoProductPopulator;
    }

    @Required
    public void setOrderEntryRaoProductPopulator(Populator<ProductModel, OrderEntryRAO> orderEntryRaoProductPopulator) {
        this.orderEntryRaoProductPopulator = orderEntryRaoProductPopulator;
    }
}
