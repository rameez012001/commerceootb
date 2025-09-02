package com.commerceootb.core.service;

import com.commerceootb.core.custom.service.TemplateRest;
import com.commerceootb.facades.klarna.data.KlarnaHppSessionReqData;
import com.commerceootb.facades.klarna.data.KlarnaHppSessionResData;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;
import org.springframework.http.*;

import java.util.*;

public class KlarnaServiceImpl implements KlarnaService {
    private final String KP_SESSION = "https://api-na.playground.klarna.com/payments/v1/sessions";
    private final String HPP_SESSION = "https://api-na.playground.klarna.com/hpp/v1/sessions";

    private TemplateRest templateRest;
    public KlarnaSessionResponseData createKpSession(Map<String,Object> payload){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<Object> entity = new HttpEntity<>(payload,headers);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<KlarnaSessionResponseData> response = null;
        try {
            response = getTemplateRest().createRestTemplate().exchange(
                    KP_SESSION,
                    HttpMethod.POST,
                    entity,
                    KlarnaSessionResponseData.class
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response.getBody();

    }

    public void createHppSession(KlarnaHppSessionReqData payload){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<Object> entity = new HttpEntity<>(payload,headers);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<KlarnaHppSessionResData> response = null;
        try {
            response = getTemplateRest().createRestTemplate().exchange(
                    HPP_SESSION,
                    HttpMethod.POST,
                    entity,
                    KlarnaHppSessionResData.class
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        response.getBody();
    }

    public TemplateRest getTemplateRest() {
        return templateRest;
    }

    public void setTemplateRest(TemplateRest templateRest) {
        this.templateRest = templateRest;
    }
}

