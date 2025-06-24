package com.commerceootbpromotionengine.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.ruleengineservices.rao.CartRAO;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class CustomDeliveryModeCodePopulator implements Populator<AbstractOrderModel, CartRAO> {
    @Override
    public void populate(AbstractOrderModel source, CartRAO target) throws ConversionException {
        if (null != source.getDeliveryMode()) {
            target.setDeliveryModeCode(source.getDeliveryMode().getCode());
        }
    }
}
