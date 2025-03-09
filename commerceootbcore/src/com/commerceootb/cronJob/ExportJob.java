package com.commerceootb.cronJob;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import java.util.List;

public class ExportJob {
    FlexibleSearchService flexibleSearchService;
    String query1 = "SELECT {c.uid} AS customerID,{c.name} AS customerName,{o.pk} AS orderID,{o.code} AS orderCode";
    String query2 = "FROM {Customer as c JOIN Order AS o ON {u.pk}={o.user}}ORDER BY {o.creationtime}";
    String query = query1+" "+query2;

    public void perform() {
        FlexibleSearchQuery flq = new FlexibleSearchQuery(query);
        SearchResult<CustomerModel> result = getFlexibleSearchService().search(flq);
        List<CustomerModel> customers = result.getResult();
    }
    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}