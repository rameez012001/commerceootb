package com.commerceootb.core.actions.quote;

import com.commerceootb.core.model.KycProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.task.RetryLaterException;
import org.apache.log4j.Logger;

public class ValidateKycProcess extends AbstractSimpleDecisionAction<KycProcessModel> {
    private static final Logger LOG = Logger.getLogger(ValidateKycProcess.class);
    @Override
    public Transition executeAction(KycProcessModel kycProcessModel) throws RetryLaterException, Exception {
        if(validateKyc(kycProcessModel)){
            LOG.info("KYC Registered Successfully");
            return Transition.OK;
        }
        LOG.info("Invalid Kyc Details. Provide Value");
        return Transition.NOK;
    }

    public boolean validateKyc(KycProcessModel kycProcessModel){
        String kycType = kycProcessModel.getKycDetails().getKycType();
        String documentId = kycProcessModel.getKycDetails().getDocumentId();
        String documentType = kycProcessModel.getKycDetails().getDocumentType();
        return kycType != null || documentId != null || documentType != null;
    }
}