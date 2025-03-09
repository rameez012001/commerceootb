package com.commerceootb.facades.facadeService;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.enums.SearchQueryContext;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;

public interface OrderSearchFacade<ITEM extends OrderData> {
    OrderSearchPageData<SearchStateData, ITEM> textSearch(SearchStateData searchState, PageableData pageableData);
}
