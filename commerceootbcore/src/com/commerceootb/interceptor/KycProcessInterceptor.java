package com.commerceootb.interceptor;

import com.commerceootb.core.event.KycEmailProcessEvent;
import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

public class KycProcessInterceptor implements PrepareInterceptor<KycDetailsModel> {
    private EventService eventService;
    @Override
    public void onPrepare(KycDetailsModel kycDetailsModel, InterceptorContext interceptorContext) throws InterceptorException {
        PK pk = kycDetailsModel.getPk();
        if(pk!=null){
            KycEmailProcessEvent kycEmailProcessEvent = new KycEmailProcessEvent();
            kycEmailProcessEvent.setKycDetailsModel(kycDetailsModel);
            getEventService().publishEvent(kycEmailProcessEvent);
        }
    }

    public EventService getEventService() {
        return eventService;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }
}