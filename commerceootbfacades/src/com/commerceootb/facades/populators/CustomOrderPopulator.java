package com.commerceootb.facades.populators;

import com.commerceootb.core.model.DeliveryInstructionModel;
import com.commerceootb.core.model.DeliveryPeriodModel;
import com.commerceootb.facades.product.data.DeliveryInstructionData;
import com.commerceootb.facades.product.data.DeliveryPeriodData;
import de.hybris.platform.commercefacades.order.converters.populator.OrderPopulator;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class CustomOrderPopulator extends OrderPopulator {
    private Converter<DeliveryInstructionModel, DeliveryInstructionData> deliveryInstructionConverter;

    @Override
    public void populate(OrderModel source, OrderData target) {
        super.populate(source, target);
        if (source.getDeliveryInstruction() != null) {
            target.setDeliveryPeriod(getDeliveryInstructionConverter().convert(source.getDeliveryInstruction()));
        }
    }


    public Converter<DeliveryInstructionModel, DeliveryInstructionData> getDeliveryInstructionConverter() {
        return deliveryInstructionConverter;
    }

    public void setDeliveryInstructionConverter(Converter<DeliveryInstructionModel, DeliveryInstructionData> deliveryInstructionConverter) {
        this.deliveryInstructionConverter = deliveryInstructionConverter;
    }
}