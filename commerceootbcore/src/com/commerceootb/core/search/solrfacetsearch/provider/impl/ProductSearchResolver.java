package com.commerceootb.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.impl.ModelAttributesValueResolver;

public class ProductSearchResolver extends ModelAttributesValueResolver<ProductModel> {
    @Override
    protected Object getAttributeValue(IndexedProperty indexedProperty, ProductModel model, String attributeName) throws FieldValueProviderException {
        return super.getAttributeValue(indexedProperty, model, attributeName);
    }
}
