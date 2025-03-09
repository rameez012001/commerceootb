package com.commerceootb.facades.populators;

import com.commerceootb.facades.product.data.BundledProductData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductRefPopulator extends SearchResultProductPopulator {
    @Override
    public void populate(SearchResultValueData source, ProductData target) throws ConversionException {
        super.populate(source,target);
        List<String> productRefImgList = getValue(source, "productImage");
        List<String> productRefPriceList = getValue(source, "productRefPrice");
        List<String> productRefUrlList = getValue(source, "productRefUrl");
        List<String> productRefRating = getValue(source, "productRefRating");
        List<String> productRefDescList = getValue(source, "productDescription");
        if (CollectionUtils.isNotEmpty(productRefImgList) && CollectionUtils.isNotEmpty(productRefDescList)){
            List<BundledProductData> bundledProductDataList = new ArrayList<>();
            for (int i = 0; i < Math.min(productRefDescList.size(), productRefImgList.size()); i++) {
                BundledProductData bundledProductData = new BundledProductData();
                bundledProductData.setProductRefImg(productRefImgList.get(i));
                bundledProductData.setProductPrice(productRefPriceList.get(i));
                bundledProductData.setProductUrl(productRefUrlList.get(i));
                bundledProductData.setProductRefDesc(productRefDescList.get(i));
                bundledProductData.setProductRating(productRefRating.get(i));
                bundledProductDataList.add(bundledProductData);
            }
            target.setBundledProduct(bundledProductDataList);
        }

    }
}
