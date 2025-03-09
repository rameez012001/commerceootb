package com.commerceootb.facades.facadeImpl;

import com.commerceootb.core.event.KycEmailProcessEvent;
import com.commerceootb.core.event.KycProcessEvent;
import com.commerceootb.core.model.KycDetailsModel;
import com.commerceootb.facades.facadeService.KycCustomFacade;
import com.commerceootb.facades.product.data.KycData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.List;

public class DefaultKycCustomFacade implements KycCustomFacade {
    private ModelService modelService;
    private UserService userService;
    private EventService eventService;
    private Converter<KycDetailsModel,KycData> kycPopConverter;
    private Converter<KycData, KycDetailsModel> kycRevPopulator;

    @Override
    public void updateCustomerKyc(KycData kycData) throws Exception {

        CustomerModel currentUser = (CustomerModel) getUserService().getCurrentUser();
        List<KycDetailsModel> kycDetailsModelList = (List<KycDetailsModel>) currentUser.getKycDetails();
        KycDetailsModel kycDetailsModel;

        if (kycDetailsModelList != null && !kycDetailsModelList.isEmpty()) {
            kycDetailsModel = kycDetailsModelList.get(0);
        } else {
            kycDetailsModel = getModelService().create(KycDetailsModel.class);
            kycDetailsModel.setCustomer(currentUser);
        }

        getKycRevPopulator().convert(kycData, kycDetailsModel);
        getModelService().save(kycDetailsModel);

        KycProcessEvent kycProcessEvent = new KycProcessEvent();
        kycProcessEvent.setKycDetailsModel(kycDetailsModel);
        getEventService().publishEvent(kycProcessEvent);

//        KycEmailProcessEvent kycEmailProcessEvent = new KycEmailProcessEvent();
//        kycEmailProcessEvent.setKycDetailsModel(kycDetailsModel);
//        getEventService().publishEvent(kycEmailProcessEvent);
    }

public KycData getKycDatas() {
    CustomerModel currentUser = (CustomerModel) getUserService().getCurrentUser();

    if (currentUser == null || currentUser.getKycDetails() == null) {
        return createEmptyKycData();
    }

    List<KycDetailsModel> kycDetailsModelList = (List<KycDetailsModel>) currentUser.getKycDetails();

    if (kycDetailsModelList.isEmpty()) {
        return createEmptyKycData();
    }

    KycDetailsModel kycDetailsModel = kycDetailsModelList.get(0);
    if (kycDetailsModel == null) {
        return createEmptyKycData();
    }
    return getkycPopConverter().convert(kycDetailsModel);
}
    public KycData createEmptyKycData() {
        KycData kycData = new KycData();
        kycData.setDocumentId("");
        kycData.setDocumentType("");
        kycData.setIssuedDate(null);
        kycData.setExpiryDate(null);
        kycData.setDob(null);
        kycData.setPostalCode("");
        return kycData;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Converter<KycDetailsModel, KycData> getkycPopConverter() {
        return kycPopConverter;
    }

    public void setkycPopConverter(Converter<KycDetailsModel, KycData> kycConPopulator) {
        this.kycPopConverter = kycConPopulator;
    }

    public Converter<KycData, KycDetailsModel> getKycRevPopulator() {
        return kycRevPopulator;
    }

    public void setKycRevPopulator(Converter<KycData, KycDetailsModel> kycRevPopulator) {
        this.kycRevPopulator = kycRevPopulator;
    }

    public EventService getEventService() {
        return eventService;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }
}