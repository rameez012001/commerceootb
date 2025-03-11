package com.commerceootb.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.solrfacetsearch.search.impl.SearchQueryConverterData;
import org.apache.solr.client.solrj.SolrQuery;

public class CustomProductFilterPopulator implements Populator<SearchQueryConverterData, SolrQuery> {
    @Override
    public void populate(SearchQueryConverterData searchQueryConverterData, SolrQuery entries) throws ConversionException {
        String rawQuery = "(isSearchable_boolean:true)";
        entries.addFilterQuery(rawQuery);
    }
}
