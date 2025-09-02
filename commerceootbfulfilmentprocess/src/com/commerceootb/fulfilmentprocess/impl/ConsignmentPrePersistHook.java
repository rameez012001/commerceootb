package com.commerceootb.fulfilmentprocess.impl;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.inboundservices.persistence.PersistenceContext;
import de.hybris.platform.inboundservices.persistence.hook.PrePersistHook;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;

import java.util.Optional;

public class ConsignmentPrePersistHook implements PrePersistHook {
    @Override
    public Optional<ItemModel> execute(ItemModel item, PersistenceContext context) {
        if(item instanceof ConsignmentModel){
            ConsignmentModel consignmentModel = (ConsignmentModel) item;
            OrderModel orderModel = (OrderModel) consignmentModel.getOrder();
            AddressModel shippingAddress = orderModel.getDeliveryAddress();
            consignmentModel.setShippingAddress(shippingAddress);
            return Optional.of(consignmentModel);
        }
        return Optional.empty();
    }
}
