package com.commerceootb.core.actions.quote;

import com.commerceootb.core.enums.KycStatus;
import com.commerceootb.core.event.KycEmailProcessEvent;
import com.commerceootb.core.model.KycProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.task.RetryLaterException;

public class KycEmailAction extends AbstractSimpleDecisionAction<KycProcessModel> {
    private EventService eventService;
    private BusinessProcessService businessProcessService;
    private BaseSiteService baseSiteService;

    @Override
    public Transition executeAction(KycProcessModel kycProcessModel) throws RetryLaterException, Exception {
        if (kycProcessModel.getKycDetails()!=null && kycProcessModel.getKycDetails().getKycStatus()== KycStatus.APPROVED){
            KycEmailProcessEvent kycEmailProcessEvent = new KycEmailProcessEvent();
            kycEmailProcessEvent.setKycDetailsModel(kycProcessModel.getKycDetails());
            getEventService().publishEvent(kycEmailProcessEvent);
            return Transition.OK;
        }
        return Transition.NOK;
    }

    public EventService getEventService() {
        return eventService;
    }
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public BaseSiteService getBaseSiteService() {
        return baseSiteService;
    }

    public void setBaseSiteService(BaseSiteService baseSiteService) {
        this.baseSiteService = baseSiteService;
    }
}
