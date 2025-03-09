package com.commerceootb.facades.facadeImpl;

import com.commerceootb.core.custom.service.OrderSearchService;
import com.commerceootb.facades.facadeService.OrderSearchFacade;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;
import de.hybris.platform.commercefacades.search.data.SearchQueryData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.enums.SearchQueryContext;
import de.hybris.platform.commerceservices.search.ProductSearchAutocompleteService;
import de.hybris.platform.commerceservices.search.ProductSearchService;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.facetdata.ProductCategorySearchPageData;
import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.AutocompleteSuggestion;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.commerceservices.threadcontext.ThreadContextService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.util.Assert;

public class DefaultSolrOrderSearchFacade<ITEM extends OrderData> implements OrderSearchFacade<ITEM> {

    private ThreadContextService threadContextService;
//    private OrderSearchService<SolrSearchQueryData, SearchResultValueData, OrderCategorySearchPageData<SolrSearchQueryData, SearchResultValueData, CategoryModel>> orderSearchService;
//    private Converter<OrderCategorySearchPageData<SolrSearchQueryData, SearchResultValueData, CategoryModel>, ProductCategorySearchPageData<SearchStateData, ITEM, CategoryData>> productCategorySearchPageConverter;
    private Converter<SearchQueryData, SolrSearchQueryData> searchQueryDecoder;
    private Converter<AutocompleteSuggestion, AutocompleteSuggestionData> autocompleteSuggestionConverter;
    private ProductSearchAutocompleteService<AutocompleteSuggestion> autocompleteService;



    @Override
    public OrderSearchPageData<SearchStateData, ITEM> textSearch(SearchStateData searchState, PageableData pageableData) {
//        Assert.notNull(searchState, "SearchStateData must not be null.");
//
//        return getThreadContextService().executeInContext(
//                new ThreadContextService.Executor<OrderSearchPageData<SearchStateData, ITEM>, ThreadContextService.Nothing>()
//                {
//                    @Override
//                    public OrderSearchPageData<SearchStateData, ITEM> execute()
//                    {
//                        return getProductCategorySearchPageConverter()
//                                .convert(getProductSearchService().searchAgain(decodeState(searchState, null), pageableData));
//                    }
//                });
        return null;
    }
}