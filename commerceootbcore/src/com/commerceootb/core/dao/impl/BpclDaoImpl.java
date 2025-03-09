package com.commerceootb.core.dao.impl;

import com.commerceootb.core.dao.BpclDao;
import com.commerceootb.core.model.BpclModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BpclDaoImpl implements BpclDao {
    private static final Logger LOGGER= Logger.getLogger(BpclDaoImpl.class);
    private FlexibleSearchService flexibleSearchService;
    private static final String BPCL_QUERY="SELECT{" +BpclModel.PK+ "}FROM{"+BpclModel._TYPECODE+ "}WHERE{" +BpclModel.ID+ "}=?code";
    private static final String FULL_BPCL_QUERY="SELECT{" +BpclModel.PK+ "}FROM{"+BpclModel._TYPECODE+"}";
    @Override
    public List<BpclModel> getBpclByCode(Long id) {
        ServicesUtil.validateParameterNotNull(id,"ID must not be null");
        final Map<String, Object> params =new HashMap<>();
        params.put("code",id);
        LOGGER.info(getFlexibleSearchService().search(BPCL_QUERY,params).getClass());
        final SearchResult<BpclModel> student=getFlexibleSearchService().search(BPCL_QUERY,params);
        return student.getResult()==null ? Collections.emptyList(): student.getResult();
    }

    @Override
    public List<BpclModel> getBpclData() {
        final SearchResult<BpclModel> student=getFlexibleSearchService().search(FULL_BPCL_QUERY);
        return student.getResult()==null ? Collections.emptyList(): student.getResult();
    }


    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
