package com.commerceootb.facades.facadeService;

import com.commerceootb.facades.product.data.BpclData;

import java.util.List;

public interface BpclFacade {
    BpclData getBpclByID(Long id);
    List<BpclData> getAllBpclData();
}
