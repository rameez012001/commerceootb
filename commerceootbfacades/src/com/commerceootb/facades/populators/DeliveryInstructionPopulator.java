package com.commerceootb.facades.populators;

import com.commerceootb.core.model.DeliveryInstructionModel;
import com.commerceootb.core.model.DeliveryPeriodModel;
import com.commerceootb.facades.product.data.DeliveryInstructionData;
import com.commerceootb.facades.product.data.DeliveryPeriodData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DeliveryInstructionPopulator implements Populator<DeliveryInstructionModel, DeliveryInstructionData> {
    @Override
    public void populate(DeliveryInstructionModel source, DeliveryInstructionData target) throws ConversionException {
        target.setInstruction(source.getInstruction());
        target.setDeliveryPeriod(String.valueOf(source.getDeliveryPeriod()));
    }
}
