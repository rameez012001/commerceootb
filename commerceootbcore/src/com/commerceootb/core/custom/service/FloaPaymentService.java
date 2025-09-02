package com.commerceootb.core.custom.service;

import com.commerceootb.facades.floa.data.InstallmentPlanResponse;
import de.hybris.platform.commercefacades.order.data.CartData;

import java.math.BigDecimal;
import java.util.Map;

public interface FloaPaymentService {
    InstallmentPlanResponse getSimulatedPlans(BigDecimal x) throws Exception;
    Map<String,Object> createDealTemplate(String productCode, CartData cartData) throws Exception;
    Map<String,Object> finalizeDeal(String dealReferenceID,CartData cartData) throws Exception;
}
