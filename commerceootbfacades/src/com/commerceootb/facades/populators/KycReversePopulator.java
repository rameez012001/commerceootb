package com.commerceootb.facades.populators;

import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.facades.product.data.KycData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.user.UserService;

public class KycReversePopulator implements Populator<KycData, KycDetailsModel> {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void populate(KycData kycData, KycDetailsModel kycDetailsModel) throws ConversionException {
        kycDetailsModel.setDocumentId(kycData.getDocumentId());
        kycDetailsModel.setDocumentType(kycData.getDocumentType());
        kycDetailsModel.setDob(kycData.getDob());
        kycDetailsModel.setNationality(kycData.getNationality());
        kycDetailsModel.setPostalCode(kycData.getPostalCode());
        kycDetailsModel.setCustomer((CustomerModel) getUserService().getCurrentUser());
    }
}