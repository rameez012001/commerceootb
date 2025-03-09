package com.commerceootb.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.catalog.model.ProductReferenceModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.impl.ModelAttributesValueResolver;

import java.util.Collection;

public class ProductRefImgValueResolver extends ModelAttributesValueResolver<ProductModel> {
    @Override
    protected Object getAttributeValue(IndexedProperty indexedProperty, ProductModel model, String attributeName) throws FieldValueProviderException {
        Collection<ProductReferenceModel> productReferences = model.getProductReferences();
        return productReferences.stream().filter(ref->ref.getReferenceType().equals(ProductReferenceTypeEnum.BUNDLE)).map(ref->ref.getTarget().getPicture().getURL()).toList();
    }
}
