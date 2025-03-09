package com.commerceootb.core.job;

import com.commerceootb.core.model.KycDetailsModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class KycDetailsJobPerformable extends AbstractJobPerformable<CronJobModel> {
    private UserService userService;
    private ModelService modelService;

    private static final Logger LOG = Logger.getLogger(KycDetailsJobPerformable.class);

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        File file = new File("C:\\Users\\LT0517\\Downloads\\kycDetails.xlsx");

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.rowIterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                String kycType = String.valueOf(row.getCell(0));
                String documentType = String.valueOf(row.getCell(1));
                String documentNumber = String.valueOf(row.getCell(2));
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date expiryDate = null;
                try {
                    expiryDate = sdf.parse(String.valueOf(row.getCell(3)));
                } catch (ParseException e) {
                    LOG.error("Date parsing exception occurred "+e);
                }

                String customerUid = row.getCell(4).getStringCellValue();

                KycDetailsModel kycDetailsModel = getModelService().create(KycDetailsModel.class);
                kycDetailsModel.setKycType(kycType);
                kycDetailsModel.setDocumentType(documentType);
                kycDetailsModel.setDocumentId(documentNumber);
                kycDetailsModel.setExpiryDate(expiryDate);
                CustomerModel customerModel = (CustomerModel) getUserService().getUserForUID(customerUid);
                kycDetailsModel.setCustomer(customerModel);
                getModelService().save(kycDetailsModel);
            }
        } catch (IOException e) {
            LOG.error("Excel import exception occurred " + e);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}