package com.commerceootb.core.service;

import com.commerceootb.facades.klarna.data.KlarnaHppSessionReqData;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;

import java.util.Map;

public interface KlarnaService {
    KlarnaSessionResponseData createKpSession(Map<String,Object> payload);
    public void createHppSession(KlarnaHppSessionReqData payload);
}
