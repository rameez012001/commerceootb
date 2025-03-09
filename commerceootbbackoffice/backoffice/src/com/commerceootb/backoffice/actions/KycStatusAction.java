package com.commerceootb.backoffice.actions;

import com.commerceootb.core.constants.GeneratedCommerceootbCoreConstants;
import com.commerceootb.core.enums.KycStatus;
import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.core.model.KycProcessModel;
import com.hybris.backoffice.widgets.notificationarea.NotificationService;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import de.hybris.platform.basecommerce.enums.ConsignmentStatus;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.ordersplitting.model.ConsignmentProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;
import java.util.Iterator;

public class KycStatusAction implements CockpitAction<KycDetailsModel, Object> {

    @Resource(name = "modelService")
    private ModelService modelService;

    @Resource(name = "businessProcessService")
    private BusinessProcessService businessProcessService;



    @Override
    public ActionResult<Object> perform(ActionContext<KycDetailsModel> actionContext) {
        Object data = actionContext.getData();
        if ((data != null) && (data instanceof KycDetailsModel))
        {
            final KycDetailsModel kycModel = (KycDetailsModel) data;
            if(kycModel.getKycStatus().equals(KycStatus.PENDING)){
                kycModel.setKycStatus(KycStatus.APPROVED);
                getModelService().save(kycModel);
                businessProcessService.triggerEvent(kycModel.getDocumentId()+"_KycApproval");
                return new ActionResult<Object>(ActionResult.SUCCESS, kycModel);
            }
            return new ActionResult<Object>(ActionResult.ERROR, kycModel);
        }
        else
        {
            return new ActionResult(ActionResult.ERROR);
        }
    }

    @Override
    public boolean canPerform(ActionContext<KycDetailsModel> ctx) {
         KycDetailsModel kycDetailsModel = ctx.getData();
         return kycDetailsModel.getKycStatus().equals(KycStatus.PENDING);
    }

    @Override
    public boolean needsConfirmation(ActionContext<KycDetailsModel> ctx) {
        return true;
    }

    @Override
    public String getConfirmationMessage(ActionContext<KycDetailsModel> ctx) {
        return "Are you sure?";
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}