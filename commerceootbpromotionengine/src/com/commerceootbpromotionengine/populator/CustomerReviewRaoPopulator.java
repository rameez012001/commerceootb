package com.commerceootbpromotionengine.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.promotionenginetrail.rao.CustomerReviewRAO;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class CustomerReviewRaoPopulator implements Populator<CustomerReviewModel, CustomerReviewRAO> {
    @Override
    public void populate(CustomerReviewModel source, CustomerReviewRAO target) throws ConversionException {
        target.setProductCode(source.getProduct().getCode());
    }
}
