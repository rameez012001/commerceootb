package com.commerceootb.interceptor.kycInterceptor;

import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.apache.commons.lang.StringUtils;

public class KycValidateInterceptor implements ValidateInterceptor<KycDetailsModel> {
    @Override
    public void onValidate(KycDetailsModel kycDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {
        if (StringUtils.isBlank(kycDetailsModel.getDocumentId())) {
            throw new InterceptorException("Document ID cannot be blank.");
        }

        // Validate Document Type
        if (StringUtils.isBlank(kycDetailsModel.getDocumentType())) {
            throw new InterceptorException("Document Type cannot be blank.");
        }

        // Validate Date of Birth
        if (kycDetailsModel.getDob() == null) {
            throw new InterceptorException("Date of Birth cannot be null.");
        }

        // Validate Postal Code
        if (StringUtils.isBlank(kycDetailsModel.getPostalCode())) {
            throw new InterceptorException("Postal Code cannot be blank.");
        }

        // Validate Nationality
        if (StringUtils.isBlank(kycDetailsModel.getNationality())) {
            throw new InterceptorException("Nationality cannot be blank.");
        }
    }
}