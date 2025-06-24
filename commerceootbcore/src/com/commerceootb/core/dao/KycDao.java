package com.commerceootb.core.dao;

import com.commerceootb.core.model.KycDetailsModel;

public interface KycDao {
    KycDetailsModel getKycDetailForCode(final String code);
}
