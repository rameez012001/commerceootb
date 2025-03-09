package com.commerceootb.facades.populators;

import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.facades.product.data.KycData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class KycPopulator implements Populator<KycDetailsModel, KycData> {
    @Override
    public void populate(KycDetailsModel kycDetailsModel, KycData kycData) throws ConversionException {
        kycData.setDocumentType(kycDetailsModel.getDocumentType());
        kycData.setDocumentId(kycDetailsModel.getDocumentId());
        kycData.setPostalCode(kycDetailsModel.getPostalCode());
        kycData.setDob(kycDetailsModel.getDob());
        kycData.setNationality(kycDetailsModel.getNationality());
    }
}