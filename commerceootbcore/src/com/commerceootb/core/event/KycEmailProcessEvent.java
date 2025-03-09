package com.commerceootb.core.event;

import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class KycEmailProcessEvent extends AbstractEvent {
    private KycDetailsModel kycDetailsModel;

    public KycDetailsModel getKycDetailsModel() {
        return kycDetailsModel;
    }

    public void setKycDetailsModel(KycDetailsModel kycDetailsModel) {
        this.kycDetailsModel = kycDetailsModel;
    }
}
