package com.commerceootb.core.custom.dao;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface CustomerExportDao {
    List<CustomerModel> getAllCustomer();
}
