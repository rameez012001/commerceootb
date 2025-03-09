package com.commerceootb.facades.facadeImpl;

import com.commerceootb.core.model.BpclModel;
import com.commerceootb.core.service.BpclServiceImpl;
import com.commerceootb.facades.facadeService.BpclFacade;
import com.commerceootb.facades.product.data.BpclData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class BpclFacadeImpl implements BpclFacade {
    private Converter<BpclModel,BpclData> bpclConverter;
    private BpclServiceImpl bpclService;

    @Override
    public BpclData getBpclByID(Long id) {
        final BpclModel bpclModel = getBpclService().getBpclForCode(id);
        return  getBpclConverter().convert(bpclModel);
    }

    @Override
    public List<BpclData> getAllBpclData() {
        final List<BpclModel> bpclModel = getBpclService().getAllBpclData();
        return  getBpclConverter().convertAll(bpclModel);
    }

    public Converter<BpclModel, BpclData> getBpclConverter() {
        return bpclConverter;
    }

    public void setBpclConverter(Converter<BpclModel, BpclData> bpclConverter) {
        this.bpclConverter = bpclConverter;
    }

    public BpclServiceImpl getBpclService() {
        return bpclService;
    }

    public void setBpclService(BpclServiceImpl bpclService) {
        this.bpclService = bpclService;
    }
}
