package com.commerceootb.core.dao.impl;

import com.commerceootb.core.dao.KycDao;
import com.commerceootb.core.model.BpclModel;
import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KycDaoImpl implements KycDao {
    private static final Logger LOGGER= Logger.getLogger(BpclDaoImpl.class);
    private FlexibleSearchService flexibleSearchService;
    private static final String KYC_QUERY="SELECT{" + KycDetailsModel.PK+ "}FROM{"+KycDetailsModel._TYPECODE+ "}WHERE{" +KycDetailsModel.DOCUMENTID+ "}=?code";
    @Override
    public KycDetailsModel getKycDetailForCode(String code) {
        Map<String, Object> params = new HashMap<>();
        params.put("code", code);

        SearchResult<KycDetailsModel> searchResult = flexibleSearchService.search(KYC_QUERY, params);
        if (searchResult == null || searchResult.getResult().isEmpty()) {
            return null;
        }
        return searchResult.getResult().get(0);

    }
    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
