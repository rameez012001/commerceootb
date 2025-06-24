package com.commerceootb.facades.populators;

import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.facades.product.data.KycData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class BasicKycPopulator implements Populator<KycDetailsModel, KycData> {
    @Override
    public void populate(KycDetailsModel kycDetailsModel, KycData kycData) throws ConversionException {
        kycData.setDocumentId(kycDetailsModel.getDocumentId());
        kycData.setPostalCode(kycDetailsModel.getPostalCode());
    }
}
