package com.commerceootb.core.custom.service;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;

public interface OrderSearchService{
    OrderSearchPageData<SearchStateData, SearchResultValueData> search(SolrSearchQueryData solrSearchQueryData, PageableData pageableData);
}