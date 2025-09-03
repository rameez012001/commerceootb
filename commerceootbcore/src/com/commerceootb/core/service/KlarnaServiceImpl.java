package com.commerceootb.core.service;

import com.commerceootb.core.custom.service.TemplateRest;
import com.commerceootb.facades.klarna.data.KlarnaHppSessionResData;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;
import org.springframework.http.*;

import java.util.*;

public class KlarnaServiceImpl implements KlarnaService {
    private final String KP_SESSION = "https://api-na.playground.klarna.com/payments/v1/sessions";
    private final String HPP_SESSION = "https://api-na.playground.klarna.com/hpp/v1/sessions";

    private TemplateRest templateRest;
    @Override
    public KlarnaSessionResponseData createKPSession(Map<String,Object> payload){
        HttpHeaders headers = getHeader();
        HttpEntity<Object> entity = new HttpEntity<>(payload,headers);
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

    @Override
    public KlarnaHppSessionResData createHppSession(Map<String,Object> payload){
        HttpHeaders headers = getHeader();
        HttpEntity<Object> entity = new HttpEntity<>(payload,headers);
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
        return response.getBody();
    }

    private HttpHeaders getHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setBasicAuth("4c564b4b-62c3-47b5-8c61-9f66e63b1d60","klarna_test_api_d25zKE02cjNTOE92YnJnV1d1cSNGKiEqVDUxKHBaeWEsNGM1NjRiNGItNjJjMy00N2I1LThjNjEtOWY2NmU2M2IxZDYwLDEsZk1zZ1BWOFJZcWFHNC90MUNkS3hjd0pPNmJxUWJUVitHY0hvNUxFeGM1WT0");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    public TemplateRest getTemplateRest() {
        return templateRest;
    }

    public void setTemplateRest(TemplateRest templateRest) {
        this.templateRest = templateRest;
    }
}

