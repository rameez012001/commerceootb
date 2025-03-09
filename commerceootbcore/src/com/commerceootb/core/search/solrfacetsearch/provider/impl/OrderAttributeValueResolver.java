package com.commerceootb.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.impl.ModelAttributesValueResolver;

public class OrderAttributeValueResolver extends ModelAttributesValueResolver<OrderModel> {
    @Override
    protected String getAttributeValue(IndexedProperty indexedProperty, OrderModel orderModel, String attributeName) throws FieldValueProviderException {
        if(orderModel==null || orderModel.getUser()==null){
            throw  new FieldValueProviderException("No User Found");
        }
        UserModel user = orderModel.getUser();
        return user.getUid();
    }
}
