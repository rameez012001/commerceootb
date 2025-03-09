package com.commerceootb.core.job;

import com.commerceootb.core.custom.service.CustomerExportService;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

public class CustomerExportCronJob extends AbstractJobPerformable<CronJobModel> {
    private CustomerExportService customerExportService;
    private static final Logger logger = Logger.getLogger(CustomerExportCronJob.class);

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        List<CustomerModel> customerModelList = getCustomerExportService().customerList();

        String filePath = "C:\\Users\\LT0517\\Downloads\\customerdata.csv";
        File file = new File(filePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // Write the CSV header
            writer.write("Customer ID,Customer Name,Order Code,Product Name,Quantity\n");

            for (CustomerModel customer : customerModelList) {
                List<OrderModel> orders = (List<OrderModel>) customer.getOrders();
                if (orders != null) {
                    for (OrderModel order : orders) {
                        List<AbstractOrderEntryModel> entries = order.getEntries();
                        if (entries != null) {
                            for (AbstractOrderEntryModel entry : entries) {
                                ProductModel product = entry.getProduct();
                                if (product != null) {
                                    writer.write(String.format("%s,%s,%s,%s,%s\n", customer.getUid(), customer.getName(), order.getCode(), product.getName(), entry.getQuantity()));
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            logger.error("Error", e);
            return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
        }

        logger.info("Success");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public CustomerExportService getCustomerExportService() {
        return customerExportService;
    }

    public void setCustomerExportService(CustomerExportService customerExportService) {
        this.customerExportService = customerExportService;
    }
}