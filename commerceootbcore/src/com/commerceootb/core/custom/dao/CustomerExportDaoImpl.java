package com.commerceootb.core.custom.dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public class CustomerExportDaoImpl implements CustomerExportDao {

    private FlexibleSearchService flexibleSearchService;
    private static final String query = "SELECT {c.pk} FROM {Customer AS c}";

    @Override
    public List<CustomerModel> getAllCustomer() {
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        SearchResult<CustomerModel> searchResult = getFlexibleSearchService().search(flexibleSearchQuery);
        return searchResult.getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}