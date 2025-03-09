package com.commerceootb.core.event;

import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class  KycProcessEvent extends AbstractEvent {
    KycDetailsModel kycDetailsModel;
    public KycDetailsModel getKycDetailsModel() {
        return kycDetailsModel;
    }
    public void setKycDetailsModel(KycDetailsModel kycDetailsModel) {
        this.kycDetailsModel = kycDetailsModel;
    }
}