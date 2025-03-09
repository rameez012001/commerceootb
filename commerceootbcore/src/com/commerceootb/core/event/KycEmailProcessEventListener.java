package com.commerceootb.core.event;

import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.core.model.KycEmailProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;

public class KycEmailProcessEventListener extends AbstractEventListener<KycEmailProcessEvent> {
    private BusinessProcessService businessProcessService;
    private ModelService modelService;
    private BaseSiteService baseSiteService;
    private BaseStoreService baseStoreService;

    @Override
    protected void onEvent(KycEmailProcessEvent kycEmailProcessEvent) {
        KycDetailsModel kycDetailsModel = kycEmailProcessEvent.getKycDetailsModel();

        KycEmailProcessModel kycEmailProcessModel =(KycEmailProcessModel) getBusinessProcessService().createProcess("KycEmailProcess"+System.currentTimeMillis(),"KycEmailProcess");

        kycEmailProcessModel.setKycDetail(kycDetailsModel);
        kycEmailProcessModel.setCustomer(kycDetailsModel.getCustomer());
        kycEmailProcessModel.setSite(getBaseSiteService().getBaseSiteForUID("electronics"));
        kycEmailProcessModel.setStore(getBaseStoreService().getBaseStoreForUid("electronics"));
        kycEmailProcessModel.setCurrency(kycDetailsModel.getCustomer().getSessionCurrency());
        kycEmailProcessModel.setLanguage(kycDetailsModel.getCustomer().getSessionLanguage());

        getModelService().save(kycEmailProcessModel);
        getBusinessProcessService().startProcess(kycEmailProcessModel);

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

    public BaseSiteService getBaseSiteService() {
        return baseSiteService;
    }

    public void setBaseSiteService(BaseSiteService baseSiteService) {
        this.baseSiteService = baseSiteService;
    }

    public BaseStoreService getBaseStoreService() {
        return baseStoreService;
    }

    public void setBaseStoreService(BaseStoreService baseStoreService) {
        this.baseStoreService = baseStoreService;
    }
}
