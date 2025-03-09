package com.commerceootb.core.dao;

import com.commerceootb.core.model.BpclModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface BpclDao extends Dao {
    List<BpclModel> getBpclByCode(Long id);
    List<BpclModel> getBpclData();
}
