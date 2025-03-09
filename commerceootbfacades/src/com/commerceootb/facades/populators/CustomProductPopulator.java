package com.commerceootb.facades.populators;

import com.commerceootb.core.model.CustomLinkModel;
import com.commerceootb.facades.product.data.CustomLinkData;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;


public class CustomProductPopulator implements Populator<ProductModel,ProductData> {
    private Converter<CustomLinkModel, CustomLinkData> customLinkConverter;
    private Converter<CategoryModel, CategoryData> categoryConverter;

    @Override
    public void populate(ProductModel source, ProductData target) {

        target.setBindingFormat(source.getBindingFormat());
        target.setAvailableDate(source.getAvailableDate());
        target.setMarketingImprintName(source.getMarketingImprintName());
        if (source.getAdditionalResources() != null) {
            CustomLinkModel additionalResource = source.getAdditionalResources();
            if (additionalResource != null) {
                CustomLinkData customLinkData = getCustomLinkConverter().convert(additionalResource);
                target.setAdditionalResources(customLinkData);
            }
        }
        if(source.getNonEComCatSection()!=null) {
            target.setNonEComCatSection(getCategoryConverter().convertAll(source.getNonEComCatSection()));
        }

    }

    public Converter<CustomLinkModel, CustomLinkData> getCustomLinkConverter() {
        return customLinkConverter;
    }

    public void setCustomLinkConverter(Converter<CustomLinkModel, CustomLinkData> customLinkConverter) {
        this.customLinkConverter = customLinkConverter;
    }

    public Converter<CategoryModel, CategoryData> getCategoryConverter() {
        return categoryConverter;
    }

    public void setCategoryConverter(Converter<CategoryModel, CategoryData> categoryConverter) {
        this.categoryConverter = categoryConverter;
    }
}