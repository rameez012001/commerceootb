package com.commerceootb.core.service;

import com.commerceootb.core.dao.BpclDao;
import com.commerceootb.core.model.BpclModel;
import javax.annotation.Resource;
import java.util.List;
import static de.hybris.platform.servicelayer.util.ServicesUtil.validateIfSingleResult;
import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;
import static java.lang.String.format;

public class BpclServiceImpl implements BpclService {
    @Resource
    private BpclDao bpclDao;

    public BpclModel getBpclForCode(final long id)
    {
        validateParameterNotNull(id, "Parameter code must not be null");
        final List<BpclModel> bpcl = getBpclDao().getBpclByCode(id);
        validateIfSingleResult(bpcl, format("Product with code '%s' not found!", id),
                format("Product code '%s' is not unique, %d products found!", id,
                        Integer.valueOf(bpcl.size())));
        return bpcl.get(0);
    }

    @Override
    public List<BpclModel> getAllBpclData() {
        return getBpclDao().getBpclData();
    }


    public BpclDao getBpclDao() {
        return bpclDao;
    }

    public void setBpclDao(BpclDao bpclDao) {
        this.bpclDao = bpclDao;
    }
}
