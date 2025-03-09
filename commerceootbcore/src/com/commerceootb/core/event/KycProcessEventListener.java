package com.commerceootb.core.event;

import com.commerceootb.core.model.KycProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

public class KycProcessEventListener extends AbstractEventListener<KycProcessEvent> {
    private BusinessProcessService businessProcessService;
    private ModelService modelService;

    @Override
    protected void onEvent(KycProcessEvent kycProcessEvent) {
        KycProcessModel kycProcessModel = (KycProcessModel) getBusinessProcessService().createProcess("KycProcess"+System.currentTimeMillis(),"KycProcessReg");
        kycProcessModel.setKycDetails(kycProcessEvent.getKycDetailsModel());
        getModelService().save(kycProcessModel);
        getBusinessProcessService().startProcess(kycProcessModel);
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}