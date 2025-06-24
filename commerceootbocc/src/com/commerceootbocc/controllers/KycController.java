package com.commerceootbocc.controllers;

import com.commerceootb.facades.facadeService.KycCustomFacade;
import com.commerceootb.facades.product.data.KycData;
import com.commerceootbocc.dto.custom.KycWsDto;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commerceservices.request.mapping.annotation.RequestMappingOverride;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;

@RestController
@Tag(name = "KYC")
@RequestMapping(value = "{baseSiteId}/kyc")
public class KycController {

    private static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
    @Resource
    private DataMapper dataMapper;

    @Resource(name = "kycCustomFacade")
    private KycCustomFacade kycCustomFacade;

    @GetMapping(value = "/{code}")
    @RequestMappingOverride(priorityProperty = "99")
    @ResponseBody
    @Operation(operationId = "getKyc", summary = "Retrieves Kyc details.", description = "Retrieves the details of kyc using the KYC id.")
    @ApiBaseSiteIdParam
    public KycWsDto getKycWsDtoByCodeAndOption(@PathVariable final String code, @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) throws ConversionException
    {
        final KycData kycData = getKycCustomFacade().getKycDataByIdAndOption(code, Collections.singleton(ProductOption.BASIC));
        return getDataMapper().map(kycData, KycWsDto.class,fields);
    }

    public DataMapper getDataMapper() {
        return dataMapper;
    }

    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    public KycCustomFacade getKycCustomFacade() {
        return kycCustomFacade;
    }

    public void setKycCustomFacade(KycCustomFacade kycCustomFacade) {
        this.kycCustomFacade = kycCustomFacade;
    }
}
