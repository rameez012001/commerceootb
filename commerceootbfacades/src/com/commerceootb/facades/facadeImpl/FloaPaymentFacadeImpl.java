package com.commerceootb.facades.facadeImpl;

import com.commerceootb.core.custom.service.FloaPaymentService;
import com.commerceootb.facades.facadeService.FloaPaymentFacade;
import com.commerceootb.facades.floa.data.InstallmentPlanResponse;
import de.hybris.platform.commercefacades.order.data.CartData;

import java.math.BigDecimal;
import java.util.Map;

public class FloaPaymentFacadeImpl implements FloaPaymentFacade {
    private FloaPaymentService floaPaymentService;

    @Override
    public InstallmentPlanResponse getSimulatedPlans(BigDecimal x) throws Exception {
        return getFloaPaymentService().getSimulatedPlans(x);
    }

    @Override
    public Map<String, Object> createDealTemplate(String productCode, CartData cartData) {
        try {
            return getFloaPaymentService().createDealTemplate(productCode,cartData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<String, Object> finalizeDeal(String dealReferenceID,CartData cartData) {
        try {
            return getFloaPaymentService().finalizeDeal(dealReferenceID,cartData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public FloaPaymentService getFloaPaymentService() {
        return floaPaymentService;
    }

    public void setFloaPaymentService(FloaPaymentService floaPaymentService) {
        this.floaPaymentService = floaPaymentService;
    }
}
