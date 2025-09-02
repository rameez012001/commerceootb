package com.commerceootb.core.custom.serviceImpl;

import com.commerceootb.core.custom.service.FloaPaymentService;
import com.commerceootb.core.custom.service.TemplateRest;
import com.commerceootb.facades.floa.data.InstallmentPlanResponse;
import de.hybris.platform.commercefacades.order.data.CartData;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.net.ssl.SSLContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class FloaPaymentServiceImpl implements FloaPaymentService {

    private final String FINALIZE_DEAL = "https://finalizedeal.rameez012001.workers.dev/?dealReference=%s";
    private final String SIMULATED_PLANS = "https://getfloapaymentinstallment.rameez012001.workers.dev/?amount=%s&countryCode=FR";
    private final String DEAL_TEMPLATE  = "https://createdealtemplate.rameez012001.workers.dev/?productCode=%s";

    private TemplateRest templateRest;

    @Override
    public InstallmentPlanResponse getSimulatedPlans(BigDecimal x) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        try{
            ResponseEntity<InstallmentPlanResponse> response = getTemplateRest().createRestTemplate().exchange(
                    String.format(SIMULATED_PLANS,x),
                    HttpMethod.GET,
                    entity,
                    InstallmentPlanResponse.class
            );
            return response.getBody();
        }catch (Exception z){
            z.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, Object> createDealTemplate(String productCode, CartData cartData) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        Map<String, Object> payload = new HashMap<>();
        payload.put("merchantReference", cartData.getGuid());
        payload.put("device", "Desktop");
        payload.put("shippingMethod", "STD");

        Map<String, Object> shippingAddress = new HashMap<>();
        shippingAddress.put("line1", "71 Rue Lucien Faure");
        shippingAddress.put("zipCode", "33300");
        shippingAddress.put("city", "Bordeaux");
        shippingAddress.put("countryCode", "FR");

        payload.put("shippingAddress", shippingAddress);

        payload.put("merchantFinancedAmount", cartData.getTotalPrice().getValue().setScale(0, RoundingMode.HALF_UP).intValue());
        payload.put("itemCount", cartData.getTotalItems());
        List<Map<String, Object>> customers = List.of(Map.of(
                "civility", "Mr",
                "firstName", "Rameez",
                "lastName", "Hello",
                "birthDate", "1990-01-01",
                "birthDepartment", "33",
                "mobilePhoneNumber", "+33643237017",
                "email", "test@floa.com",
                "homeAddress", shippingAddress
        ));
        payload.put("customers", customers);

        HttpEntity<Object> entity = new HttpEntity<>(payload,headers);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<Map> response = null;
        try {
            response = getTemplateRest().createRestTemplate().exchange(
                    String.format(DEAL_TEMPLATE,productCode),
                    HttpMethod.POST,
                    entity,
                    Map.class
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response.getBody();
    }

    @Override
    public Map<String, Object> finalizeDeal(String dealReferenceID,CartData cartData) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        Map<String, Object> payload = new HashMap<>();

        payload.put("merchantReference", UUID.randomUUID().toString());

        Map<String, Object> amountDetails = new HashMap<>();
        amountDetails.put("discountAmount", 100);
        amountDetails.put("shippingFee", 50);
        payload.put("amountDetails", amountDetails);

        Map<String, Object> configuration = new HashMap<>();
        configuration.put("culture", "fr-FR");
        configuration.put("backUrl", "https://floa.com/back");
        configuration.put("returnUrl", "https://paymentsuccess.rameez012001.workers.dev/");
        configuration.put("notificationUrl", "https://floa.com/notif");

        List<String> sessionModes = List.of("WebPage");
        configuration.put("sessionModes", sessionModes);

        payload.put("configuration", configuration);

        HttpEntity<Object> entity = new HttpEntity<>(payload,headers);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<Map> response = null;
        try {
            response = getTemplateRest().createRestTemplate().exchange(
                    String.format(FINALIZE_DEAL,dealReferenceID),
                    HttpMethod.POST,
                    entity,
                    Map.class
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response.getBody();
    }



    public TemplateRest getTemplateRest() {
        return templateRest;
    }

    public void setTemplateRest(TemplateRest templateRest) {
        this.templateRest = templateRest;
    }

    public String getOAuthToken() throws Exception {
        try {
            // Set up headers
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.set("User-Agent", "Mozilla/5.0");

            // Body includes client_id and client_secret
            MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
            body.add("client_id", "3db10eb0269c463998242bdd55045689");
            body.add("client_secret", "MDIxYzhiZGEtZjcwMS00YzJkLWEyOWUtZjFjNDgwNDljMTNi");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, headers);

            // grant_type only in query parameter
            String url = UriComponentsBuilder
                    .fromHttpUrl("https://api.floapay.io/api-nx-live-int/oauth/token")
                    .queryParam("grant_type", "client_credentials")
                    .toUriString();

            ResponseEntity<Map> response = getTemplateRest().createRestTemplate().exchange(
                    url,
                    HttpMethod.POST,
                    request,
                    Map.class
            );

            return response.getBody().get("access_token").toString();

        } catch (HttpClientErrorException | HttpServerErrorException ex) {
            System.err.println("HTTP Status: " + ex.getStatusCode());
            System.err.println("Response Body: " + ex.getResponseBodyAsString());
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }


    }
}