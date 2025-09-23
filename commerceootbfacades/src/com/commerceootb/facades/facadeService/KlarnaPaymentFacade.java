package com.commerceootb.facades.facadeService;

import com.commerceootb.facades.klarna.data.KlarnaHppSessionResData;
import com.commerceootb.facades.klarna.data.KlarnaOrderDetails;
import com.commerceootb.facades.klarna.data.KlarnaOrderResponse;

import java.util.Map;

public interface KlarnaPaymentFacade {
    KlarnaHppSessionResData createKpSession();
    void createOrder(String sId, String token);
}
