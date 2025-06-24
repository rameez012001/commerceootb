package com.commerceootbpromotionengine.rule;

import com.commerceootbpromotionengine.calculation.CustomRuleEngineCalculationService;
import de.hybris.platform.ruleengineservices.rao.*;
import de.hybris.platform.ruleengineservices.rule.evaluation.RuleActionContext;
import de.hybris.platform.ruleengineservices.rule.evaluation.actions.AbstractRuleExecutableSupport;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Predicate;


public class DeliveryMethodDiscountRaoAction extends AbstractRuleExecutableSupport {
    private static final Logger LOG = LoggerFactory.getLogger(DeliveryMethodDiscountRaoAction.class);
    private CustomRuleEngineCalculationService customRuleEngineCalculationService;

    @Override
    public boolean performActionInternal(final RuleActionContext context) {
        return extractAmountForCurrency(context, context.getParameter("value")).map(a -> Boolean.valueOf(performAction(context, a)))
                .orElseGet(() -> {
                    LOG.error("no matching discount amount specified for rule {}, cannot apply rule action.", getRuleCode(context));
                    return Boolean.valueOf(false);
                }).booleanValue();
    }

    protected boolean performAction(RuleActionContext context, BigDecimal amount) {
        CartRAO cartRao = context.getCartRao();
        boolean isPerformed = false;
        if (StringUtils.isNotBlank(cartRao.getDeliveryModeCode())) {
            final RuleEngineResultRAO result = context.getRuleEngineResultRao();
            final Optional<DeliveryModeRAO> deliveryMode = getRaoLookupService().lookupRAOByType(DeliveryModeRAO.class, context, new Predicate[]{getDeliveryModeRAOFilter(cartRao.getDeliveryModeCode())});
            if (deliveryMode.isPresent()) {
                isPerformed = true;
                deliveryMode.get().setCost(cartRao.getDeliveryCost());
                changeDeliveryModeCost(cartRao, deliveryMode.get(), result, context, amount);
            }
        }
        return isPerformed;
    }

    private void changeDeliveryModeCost(final CartRAO cartRao, final DeliveryModeRAO mode, final RuleEngineResultRAO result,
                                        final RuleActionContext context, final BigDecimal amount) {
        validateRule(context);
        final ShipmentRAO shipment = getCustomRuleEngineCalculationService().changeDeliveryModeCost(cartRao, mode, amount);
        result.getActions().add(shipment);
        setRAOMetaData(context, new AbstractRuleActionRAO[]{shipment});
        context.scheduleForUpdate(new Object[]{cartRao, result});
        context.insertFacts(new Object[]{shipment});
    }

    protected Predicate<DeliveryModeRAO> getDeliveryModeRAOFilter(final String deliveryModeCode) {
        return o -> isFactDeliveryAndHasCode(o, deliveryModeCode);
    }

    protected boolean isFactDeliveryAndHasCode(final Object fact, final String deliveryModeCode) {
        return (fact instanceof DeliveryModeRAO && deliveryModeCode.equals(((DeliveryModeRAO) fact).getCode()));
    }

    public CustomRuleEngineCalculationService getCustomRuleEngineCalculationService() {
        return customRuleEngineCalculationService;
    }

    public void setCustomRuleEngineCalculationService(CustomRuleEngineCalculationService customRuleEngineCalculationService) {
        this.customRuleEngineCalculationService = customRuleEngineCalculationService;
    }
}
