package com.commerceootb.facades.facadeService;

import com.commerceootb.facades.product.data.KycData;
import com.oracle.truffle.api.interop.UnknownIdentifierException;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;

import java.util.Collection;

public interface KycCustomFacade {
    void updateCustomerKyc(KycData kycData) throws Exception;
    KycData getKycDatas();

    KycData createEmptyKycData();
    KycData getKycDataByIdAndOption(String id, Collection<ProductOption> option);
}