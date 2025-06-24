package com.commerceootb.core.custom.serviceImpl;

import com.commerceootb.core.custom.service.OrderSearchService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SearchQueryPageableData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchRequest;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchResponse;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.config.IndexedTypeSort;
import de.hybris.platform.solrfacetsearch.search.SearchQuery;

import java.util.Objects;

public class DefaultSolrOrderSearchService implements OrderSearchService {
    private Converter<SearchQueryPageableData<SolrSearchQueryData>,SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort>> orderSearchQueryConverter;
    private Converter<SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort>,SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort,SearchResultValueData>> orderSearchResponseConverter;
    private Converter<SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort,SearchResultValueData>, OrderSearchPageData<SearchStateData,SearchResultValueData>> orderSearchPageDataConverter;

    @Override
    public OrderSearchPageData<SearchStateData, SearchResultValueData> search(SolrSearchQueryData solrSearchQueryData, PageableData pageableData) {
        SearchQueryPageableData<SolrSearchQueryData> searchQueryPageableData = new SearchQueryPageableData<>();
        searchQueryPageableData.setSearchQueryData(solrSearchQueryData);
        searchQueryPageableData.setPageableData(pageableData);

        final SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort> solrSearchRequest = getOrderSearchQueryConverter().convert(searchQueryPageableData);
        final SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort,SearchResultValueData> solrSearchResponse = getOrderSearchResponseConverter().convert(solrSearchRequest);
        return getOrderSearchPageDataConverter().convert(Objects.requireNonNull(solrSearchResponse));

    }

    public Converter<SearchQueryPageableData<SolrSearchQueryData>, SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort>> getOrderSearchQueryConverter() {
        return orderSearchQueryConverter;
    }

    public void setOrderSearchQueryConverter(Converter<SearchQueryPageableData<SolrSearchQueryData>, SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort>> orderSearchQueryConverter) {
        this.orderSearchQueryConverter = orderSearchQueryConverter;
    }

    public Converter<SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort>, SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort, SearchResultValueData>> getOrderSearchResponseConverter() {
        return orderSearchResponseConverter;
    }

    public void setOrderSearchResponseConverter(Converter<SolrSearchRequest<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort>, SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort, SearchResultValueData>> orderSearchResponseConverter) {
        this.orderSearchResponseConverter = orderSearchResponseConverter;
    }

    public Converter<SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort, SearchResultValueData>, OrderSearchPageData<SearchStateData, SearchResultValueData>> getOrderSearchPageDataConverter() {
        return orderSearchPageDataConverter;
    }

    public void setOrderSearchPageDataConverter(Converter<SolrSearchResponse<FacetSearchConfig, IndexedType, IndexedProperty, SearchQuery, IndexedTypeSort, SearchResultValueData>, OrderSearchPageData<SearchStateData, SearchResultValueData>> orderSearchPageDataConverter) {
        this.orderSearchPageDataConverter = orderSearchPageDataConverter;
    }
}
