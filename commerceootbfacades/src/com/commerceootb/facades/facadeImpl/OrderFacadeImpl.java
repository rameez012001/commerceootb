package com.commerceootb.facades.facadeImpl;

import com.commerceootb.core.custom.service.OrderSearchService;
import com.commerceootb.facades.facadeService.OrderSolrFacade;
import de.hybris.platform.cms2.data.PageableData;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.data.SearchQueryData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.enums.SearchQueryContext;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commerceservices.search.facetdata.ProductSearchPageData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.SolrSearchQueryData;
import de.hybris.platform.commerceservices.threadcontext.ThreadContextService;
import de.hybris.platform.servicelayer.session.SessionService;
import org.springframework.util.Assert;

public class OrderFacadeImpl {
//    private SessionService sessionService;
//    private ThreadContextService threadContextService;
//    private OrderSearchService orderSearchService;
//    @Override
//    public OrderSearchPageData<SearchStateData, OrderData> getAllOrders(String code, String indexedType) {
//        getSessionService().setAttribute("indexedType",indexedType);
//
//        final SearchQueryContext searchQueryContext = SearchQueryContext.DEFAULT;
//        final SolrSearchQueryData searchQueryData = new SolrSearchQueryData();
//
//        searchQueryData.setFreeTextSearch(code);
//        searchQueryData.setSearchQueryContext(searchQueryContext);
//        searchQueryData.setFilterQueries(null);
//        searchQueryData.setSort(null);
//        searchQueryData.setCategoryCode(null);
//        searchQueryData.setFilterTerms(null);
//
//
//
//        PageableData pageableData = new PageableData();
//        pageableData.setCurrentPage(0);
//        pageableData.setSort(null);
//        pageableData.setPageSize(20);
//
//
//
//        return this.textSearch(searchQueryData,pageableData);
//    }
//
////    @Override
//    public OrderSearchPageData<SearchStateData, OrderData> textSearch(final SolrSearchQueryData searchQueryData,
//                                                                   final PageableData pageableData)
//    {
//        Assert.notNull(searchQueryData, "SearchStateData must not be null.");
//
//        return getThreadContextService().executeInContext(
//                (ThreadContextService.Executor<OrderSearchPageData<SearchStateData, SearchResultValueData>, ThreadContextService.Nothing>) () -> getProductCategorySearchPageConverter()
//                        .convert(getOrderSearchService().search(searchQueryData, pageableData)));
//    }
//
//    public SessionService getSessionService() {
//        return sessionService;
//    }
//
//    public void setSessionService(SessionService sessionService) {
//        this.sessionService = sessionService;
//    }
//
//    public ThreadContextService getThreadContextService() {
//        return threadContextService;
//    }
//
//    public void setThreadContextService(ThreadContextService threadContextService) {
//        this.threadContextService = threadContextService;
//    }
//
//    public OrderSearchService getOrderSearchService() {
//        return orderSearchService;
//    }
//
//    public void setOrderSearchService(OrderSearchService orderSearchService) {
//        this.orderSearchService = orderSearchService;
//    }
}
