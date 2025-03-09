package com.commerceootbocc.controllers;

import com.commerceootb.facades.facadeImpl.CustomProductFacade;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.request.mapping.annotation.RequestMappingOverride;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.util.EnumSet;

@RestController
@Tag(name = "Products")
@RequestMapping(value = "/{baseSiteId}/products")
public class CustomProductController {

    private static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
    @Resource
    private DataMapper dataMapper;
    @Resource(name = "customProductFacade")
    private CustomProductFacade customProductFacade;

    @Resource(name = "cwsProductFacade")
    private ProductFacade productFacade;

    @Secured("ROLE_CLIENT")
    @GetMapping("/{productCode}")
    @RequestMappingOverride(priorityProperty = "89")
    @Operation(operationId = "getProduct", summary = "Retrieves product details.", description = "Retrieves the details of a single product using the product identifier.")
    @ApiBaseSiteIdParam
    public ProductWsDTO getProductByCode(@PathVariable final String productCode,@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) throws ConversionException
    {
        final ProductData product = getCustomProductFacade().getProductForCodeAndOptions(productCode, EnumSet.allOf(ProductOption.class));
        return getDataMapper().map(product, ProductWsDTO.class,fields);
    }

    public DataMapper getDataMapper() {
        return dataMapper;
    }

    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    public CustomProductFacade getCustomProductFacade() {
        return customProductFacade;
    }

    public void setCustomProductFacade(CustomProductFacade customProductFacade) {
        this.customProductFacade = customProductFacade;
    }

    public ProductFacade getProductFacade() {
        return productFacade;
    }

    public void setProductFacade(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }
}
