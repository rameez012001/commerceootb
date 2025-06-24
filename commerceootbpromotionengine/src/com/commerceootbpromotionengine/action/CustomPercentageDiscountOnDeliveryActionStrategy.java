package com.commerceootbpromotionengine.action;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.order.daos.DeliveryModeDao;
import de.hybris.platform.promotionengineservices.action.impl.AbstractRuleActionStrategy;
import de.hybris.platform.promotionengineservices.model.AbstractRuleBasedPromotionActionModel;
import de.hybris.platform.promotionengineservices.model.RuleBasedPercentageDiscountOnDeliveryModeActionModel;
import de.hybris.platform.promotions.model.PromotionResultModel;
import de.hybris.platform.ruleengineservices.rao.AbstractRuleActionRAO;
import de.hybris.platform.ruleengineservices.rao.ShipmentRAO;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CustomPercentageDiscountOnDeliveryActionStrategy extends AbstractRuleActionStrategy<RuleBasedPercentageDiscountOnDeliveryModeActionModel> {
    private DeliveryModeDao deliveryModeDao;
    private static final Logger LOG = LoggerFactory.getLogger(CustomPercentageDiscountOnDeliveryActionStrategy.class);
    @Override
    public List<PromotionResultModel> apply(final AbstractRuleActionRAO action)
    {
        if (!(action instanceof ShipmentRAO))
        {

            LOG.error("cannot apply {}, action is not of type ShipmentRAO, but {}", getClass().getSimpleName(), action);
            return Collections.emptyList();
        }
        final ShipmentRAO changeDeliveryMethodAction = (ShipmentRAO) action;
        if (!(changeDeliveryMethodAction.getAppliedToObject() instanceof de.hybris.platform.ruleengineservices.rao.CartRAO))
        {

            LOG.error("cannot apply {}, appliedToObject is not of type CartRAO, but {}", getClass().getSimpleName(),
                    action.getAppliedToObject());
            return Collections.emptyList();
        }

        final PromotionResultModel promoResult = getPromotionActionService().createPromotionResult(action);
        if (promoResult == null)
        {

            LOG.error("cannot apply {}, promotionResult could not be created.", getClass().getSimpleName());
            return Collections.emptyList();
        }
        final AbstractOrderModel order = getPromotionResultUtils().getOrder(promoResult);
        if (Objects.isNull(order))
        {

            LOG.error("cannot apply {}, order or cart not found: {}", getClass().getSimpleName(), order);

            if (getModelService().isNew(promoResult))
            {
                getModelService().detach(promoResult);
            }
            return Collections.emptyList();
        }

        final ShipmentRAO shipmentRAO = (ShipmentRAO) action;
        final DeliveryModeModel shipmentModel = getDeliveryModeForCode(shipmentRAO.getMode().getCode());
        if (shipmentModel == null)
        {

            LOG.error("Delivery Mode for code {} not found!", shipmentRAO.getMode());
            return Collections.emptyList();
        }
        final DeliveryModeModel shipmentModelToReplace = order.getDeliveryMode();
        order.setDeliveryMode(shipmentModel);

        final Double deliveryCostToReplace = order.getDeliveryCost();
        order.setDeliveryCost(Double.valueOf(shipmentRAO.getMode().getCost().doubleValue()));

        final RuleBasedPercentageDiscountOnDeliveryModeActionModel actionModel = createPromotionAction(promoResult, action);
        handleActionMetadata(action, actionModel);
        actionModel.setDeliveryMode(shipmentModel);
        actionModel.setDeliveryCost(shipmentRAO.getMode().getCost());
        actionModel.setReplacedDeliveryMode(shipmentModelToReplace);
        actionModel.setReplacedDeliveryCost(BigDecimal.valueOf(deliveryCostToReplace.doubleValue()));
        getModelService().saveAll(new Object[]
                { promoResult, actionModel, order });
        return Collections.singletonList(promoResult);
    }

    @Override
    public void undo(final ItemModel item)
    {
        if (item instanceof RuleBasedPercentageDiscountOnDeliveryModeActionModel)
        {

            handleUndoActionMetadata((AbstractRuleBasedPromotionActionModel) item);
            final RuleBasedPercentageDiscountOnDeliveryModeActionModel action = (RuleBasedPercentageDiscountOnDeliveryModeActionModel) item;
            final AbstractOrderModel order = getPromotionResultUtils().getOrder(action.getPromotionResult());
            order.setDeliveryMode(action.getReplacedDeliveryMode());
            order.setDeliveryCost(Double.valueOf(action.getReplacedDeliveryCost().doubleValue()));
            undoInternal(action);
            getModelService().save(order);
        }

    }


    protected DeliveryModeModel getDeliveryModeForCode(final String code)
    {
        ServicesUtil.validateParameterNotNull(code, "Parameter code cannot be null");

        final List<DeliveryModeModel> deliveryModes = getDeliveryModeDao().findDeliveryModesByCode(code);

        return CollectionUtils.isNotEmpty(deliveryModes) ? deliveryModes.get(0) : null;
    }


    protected DeliveryModeDao getDeliveryModeDao()
    {
        return this.deliveryModeDao;
    }

    /**
     * @param deliveryModeDao the deliveryModeDao to set
     */
    public void setDeliveryModeDao(final DeliveryModeDao deliveryModeDao)
    {
        this.deliveryModeDao = deliveryModeDao;
    }
}
