package com.commerceootb.facades.populators;

import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.facades.product.data.KycData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.List;

public class KycConverter implements Converter<CustomerModel, KycData> {
    private UserService userService;

    @Override
    public KycData convert(CustomerModel customerModel) throws ConversionException {
        if (customerModel == null) {
            throw new ConversionException("CustomerModel cannot be null");
        }

        List<KycDetailsModel> kycDetailsModelList = (List<KycDetailsModel>) customerModel.getKycDetails();

        if (kycDetailsModelList == null || kycDetailsModelList.isEmpty()) {
            // Return an empty KycData object instead of throwing an exception
            return new KycData();
        }

        KycDetailsModel kycDetailsModel = kycDetailsModelList.get(0);
        if (kycDetailsModel == null) {
            return new KycData(); // Default object
        }

        KycData kycData = new KycData();
        kycData.setDocumentType(kycDetailsModel.getDocumentType());
        kycData.setDocumentId(kycDetailsModel.getDocumentId());
        kycData.setPostalCode(kycDetailsModel.getPostalCode());
        kycData.setDob(kycDetailsModel.getDob());
        kycData.setNationality(kycDetailsModel.getNationality());

        return kycData;
    }

    @Override
    public KycData convert(CustomerModel customerModel, KycData kycData) throws ConversionException {
        return null;
    }
}