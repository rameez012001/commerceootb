package com.commerceootb.facades.populators;


import de.hybris.platform.commercefacades.user.converters.populator.AddressPopulator;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.AddressModel;

public class CustomAddressPopulator extends AddressPopulator {
    @Override
    protected void populateAddressFields(final AddressModel source, final AddressData target) {
        super.populateAddressFields(source, target);
//        if (source.getAddressId() != null && !source.getAddressId().isEmpty()) {
//            target.setAddressId(source.getAddressId());
//        }
        if (source.getOwner() != null && source.getOwner() instanceof OrderModel) {
            OrderModel orderModel = (OrderModel) source.getOwner();
            target.setAddressId(orderModel.getCode());
        }
    }
}