package com.commerceootbpromotionengine.populator;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.promotionenginetrail.rao.CustomerReviewRAO;
import de.hybris.platform.ruleengineservices.rao.UserRAO;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;

public class PromotionEngineUserRaoPopulator implements Populator<UserModel, UserRAO> {
    private Converter<CustomerReviewModel, CustomerReviewRAO> customerReviewConverter;
    @Override
    public void populate(UserModel userModel, UserRAO userRAO) throws ConversionException {
        Collection<CustomerReviewRAO> customerReviewRAOS = new ArrayList<>();
        userRAO.setCustomerReviews(new ArrayList<CustomerReviewRAO>(Converters.convertAll(userModel.getCustomerReviews(),getCustomerReviewConverter())));
    }

    public Converter<CustomerReviewModel, CustomerReviewRAO> getCustomerReviewConverter() {
        return customerReviewConverter;
    }

    public void setCustomerReviewConverter(Converter<CustomerReviewModel, CustomerReviewRAO> customerReviewConverter) {
        this.customerReviewConverter = customerReviewConverter;
    }
}
