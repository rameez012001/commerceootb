package com.commerceootb.core.custom.serviceImpl;

import com.commerceootb.core.custom.service.OrderSearchService;
import de.hybris.platform.commerceservices.enums.SearchQueryContext;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;

public class DefaultSolrOrderSearchService implements OrderSearchService {
    @Override
    public OrderSearchPageData textSearch(String text, SearchQueryContext searchQueryContext, PageableData pageableData) {
        return null;
    }
}
