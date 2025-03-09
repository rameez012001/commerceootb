package com.commerceootb.facades.populators;

import com.commerceootb.core.model.BpclModel;
import com.commerceootb.facades.product.data.BpclData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class BpclPopulator implements Populator<BpclModel, BpclData> {

    @Override
    public void populate(BpclModel source, BpclData target) throws ConversionException {
        target.setId(source.getId());
        target.setCustomerName(source.getCustomerName());
        target.setCustomerMobileNumber(source.getCustomerMobileNumber());
        target.setCustomerNumber(source.getCustomerNumber());
        target.setDistributorCode(source.getDistributorCode());
        target.setOperatorId(source.getOperatorId());
        target.setOperatorName(source.getOperatorName());
        target.setOperatorMobileNumber(source.getOperatorMobileNumber());
        target.setLpgId(source.getLpgId());
        target.setOtpRefId(source.getOtpRefId());
        target.setLatitude(source.getLatitude());
        target.setLongitude(source.getLongitude());
        target.setSafetyImageUrl(source.getSafetyImageUrl());
        target.setQuestionRes(source.getQuestionRes());
        target.setSurakshaDate(source.getSurakshaDate());
        target.setSentToLpgNxt(source.getSentToLpgNxt());
        target.setSafetyInspectionDate(source.getSafetyInspectionDate());

    }
}
