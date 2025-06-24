package com.commerceootb.core.service;

import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.commercefacades.product.ProductOption;

import java.util.Collection;

public interface KycService {
    KycDetailsModel getKycDetailForCodeAndOption(final String code);
}
