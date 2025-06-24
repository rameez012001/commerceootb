package com.commerceootbocc.controllers;

import com.commerceootb.facades.facadeService.BpclFacade;
import com.commerceootb.facades.product.data.BpclData;
import com.commerceootbocc.dto.custom.BpclWsDto;
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
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Tag(name = "BPCL")
@RequestMapping(value = "{baseSiteId}/bpcl")
public class BpclController {
    private static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
    @Resource
    private DataMapper dataMapper;

    @Resource(name = "bpclFacade")
    private BpclFacade bpclFacade;

    @GetMapping(value = "/{id}")
    @ApiBaseSiteIdParam
    public BpclWsDto getBpclByCode(@PathVariable final String id, @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) throws ConversionException
    {
        final BpclData bpclData = getBpclFacade().getBpclByID(Long.valueOf(id));
        return getDataMapper().map(bpclData, BpclWsDto.class,fields);
    }

    @GetMapping("/bpcl_data")
    @Operation(operationId = "getProduct", summary = "Retrieves all the Bpcl Data.", description = "Retrieves all the details of a BPCL using the product identifier.")
    @ApiBaseSiteIdParam
    public List<BpclWsDto> getBpclData(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) throws ConversionException
    {
        final List<BpclData> bpclData = Optional.ofNullable(getBpclFacade().getAllBpclData()).orElse(Collections.emptyList());
        return bpclData.stream().map(data->getDataMapper().map(data,BpclWsDto.class,fields)).collect(Collectors.toList());
    }

    public DataMapper getDataMapper() {
        return dataMapper;
    }

    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    public BpclFacade getBpclFacade() {
        return bpclFacade;
    }

    public void setBpclFacade(BpclFacade bpclFacade) {
        this.bpclFacade = bpclFacade;
    }
}
