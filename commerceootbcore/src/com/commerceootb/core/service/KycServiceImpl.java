package com.commerceootb.core.service;

import com.commerceootb.core.dao.KycDao;
import com.commerceootb.core.model.KycDetailsModel;

public class KycServiceImpl implements KycService {

    private KycDao kycDao;

    @Override
    public KycDetailsModel getKycDetailForCodeAndOption(String code) {
        return getKycDao().getKycDetailForCode(code);
    }
    public KycDao getKycDao() {
        return kycDao;
    }
    public void setKycDao(KycDao kycDao) {
        this.kycDao = kycDao;
    }
}
