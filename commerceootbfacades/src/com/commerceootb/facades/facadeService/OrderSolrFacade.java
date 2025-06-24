package com.commerceootb.facades.facadeService;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;

public interface OrderSolrFacade {
    OrderSearchPageData<SearchStateData, OrderData> getAllOrders(String code, String indexedType);
}
