package com.commerceootb.core.custom.service;

import com.commerceootb.core.custom.dao.CustomerExportDao;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public class CustomerExportServiceImpl implements CustomerExportService {
    private CustomerExportDao customerExportDao;
    @Override
    public List<CustomerModel> customerList() {
        return getCustomerExportDao().getAllCustomer();
    }

    public CustomerExportDao getCustomerExportDao() {
        return customerExportDao;
    }

    public void setCustomerExportDao(CustomerExportDao customerExportDao) {
        this.customerExportDao = customerExportDao;
    }
}
