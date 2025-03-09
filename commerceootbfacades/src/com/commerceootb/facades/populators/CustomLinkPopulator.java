package com.commerceootb.facades.populators;

import com.commerceootb.core.model.CustomLinkModel;
import com.commerceootb.facades.product.data.CustomLinkData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class CustomLinkPopulator implements Populator<CustomLinkModel, CustomLinkData> {
    @Override
    public void populate(CustomLinkModel source, CustomLinkData target) throws ConversionException {
        if(source==null){
            return;
        }
        target.setTitle(source.getTitle());
        target.setUrl(source.getUrl());
    }
}

