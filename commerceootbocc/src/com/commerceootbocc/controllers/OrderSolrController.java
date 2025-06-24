package com.commerceootbocc.controllers;

import com.commerceootb.facades.facadeService.OrderSolrFacade;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.platform.cms2.data.PageableData;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.OrderSearchPageData;
import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import de.hybris.platform.commercewebservicescommons.dto.order.OrderWsDTO;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/order")
public class OrderSolrController {
    private static final String DEFAULT_FIELD_SET = FieldSetLevelHelper.DEFAULT_LEVEL;
    @Resource(name="orderSolrFacade")
    private OrderSolrFacade orderSolrFacade;

    @Resource
    private DataMapper dataMapper;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, params = "!q", value = "/{indexedType}/{code}")
    public OrderWsDTO textSearch(@PathVariable String indexedType,@PathVariable final String code,
                                 @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) throws CMSItemNotFoundException
    {


        OrderSearchPageData<SearchStateData, OrderData> searchPageData = getOrderSolrFacade().getAllOrders(code,indexedType);
        return getDataMapper().map(searchPageData, OrderWsDTO.class,fields);
    }

    public OrderSolrFacade getOrderSolrFacade() {
        return orderSolrFacade;
    }

    public void setOrderSolrFacade(OrderSolrFacade orderSolrFacade) {
        this.orderSolrFacade = orderSolrFacade;
    }

    public DataMapper getDataMapper() {
        return dataMapper;
    }

    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }
}
