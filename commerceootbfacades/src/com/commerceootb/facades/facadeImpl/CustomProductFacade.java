package com.commerceootb.facades.facadeImpl;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import java.util.Collection;

public class CustomProductFacade extends DefaultProductFacade {


    @Override
    public ProductData getProductForCodeAndOptions(String code, Collection collection) {
        super.getProductForCodeAndOptions(code, collection);
        return (ProductData) getProductConverter().convert(getProductService().getProductForCode(code));
    }

}