package com.commerceootb.core.service;

import com.commerceootb.facades.klarna.data.KlarnaHppSessionResData;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;

import java.util.Map;

public interface KlarnaService {
    KlarnaSessionResponseData createKPSession(Map<String,Object> payload);
    KlarnaHppSessionResData createHppSession(Map<String,Object> payload);
}
