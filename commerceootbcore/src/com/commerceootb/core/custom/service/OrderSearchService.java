package com.commerceootb.core.custom.service;

import de.hybris.platform.commerceservices.enums.SearchQueryContext;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;

public interface OrderSearchService<STATE, ITEM, RESULT extends OrderSearchPageData<STATE, ITEM>> {
    RESULT textSearch(String text, SearchQueryContext searchQueryContext, PageableData pageableData);
}
