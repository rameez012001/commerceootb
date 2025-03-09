package com.commerceootbocc.controllers;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import de.hybris.platform.commercewebservicescommons.dto.order.OrderWsDTO;

import javax.annotation.Resource;

@Controller
@RequestMapping("/order")
public class OrderSolrController {
    private static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
//    @Resource(name="orderSolrFacade")
//    private OrderSolrFacade orderSolrFacade;
    @ResponseBody
    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public OrderWsDTO textSearch(@Parameter(description = "Order GUID or order code.", required = true) @PathVariable final String code,
                                 @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) throws CMSItemNotFoundException
    {
        return null;
    }
}
