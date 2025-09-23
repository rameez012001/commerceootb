package com.commerceootb.core.service;

import com.commerceootb.facades.klarna.data.KlarnaHppSessionResData;
import com.commerceootb.facades.klarna.data.KlarnaOrderDetails;
import com.commerceootb.facades.klarna.data.KlarnaOrderResponse;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface KlarnaService {
    KlarnaSessionResponseData createKPSession(Map<String,Object> payload);
    KlarnaHppSessionResData createHppSession(Map<String,Object> payload);
    KlarnaOrderResponse createOrder(Map<String,Object> payload, String sid, String token);
    KlarnaOrderDetails getOrder(String orderID);
    ResponseEntity<Map> captureOrder(Map<String,Object> payload, String orderID);
}
