package com.commerceootb.facades.populators;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class OrderSearchPageDataPopulator implements Populator<OrderSearchPageData<SearchStateData, SearchResultValueData>,OrderSearchPageData<SearchStateData, OrderData>> {

    @Override
    public void populate(OrderSearchPageData<SearchStateData, SearchResultValueData> source, OrderSearchPageData<SearchStateData, OrderData> target) throws ConversionException {

    }
}