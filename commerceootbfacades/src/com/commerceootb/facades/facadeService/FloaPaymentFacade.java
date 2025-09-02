package com.commerceootb.facades.facadeService;

import com.commerceootb.facades.floa.data.InstallmentPlanResponse;
import de.hybris.platform.commercefacades.order.data.CartData;

import java.math.BigDecimal;
import java.util.Map;

public interface FloaPaymentFacade {
    InstallmentPlanResponse getSimulatedPlans(BigDecimal x) throws Exception;
    Map<String,Object> createDealTemplate(String productCode, CartData cartData);
    Map<String,Object> finalizeDeal(String dealReferenceID,CartData cartData);
}
