package com.commerceootb.core.service;

import com.commerceootb.core.model.BpclModel;

import java.util.List;

public interface BpclService {
    BpclModel getBpclForCode(final long id);
    List<BpclModel> getAllBpclData();
}
