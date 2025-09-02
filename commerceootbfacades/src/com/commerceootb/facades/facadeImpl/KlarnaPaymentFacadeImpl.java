package com.commerceootb.facades.facadeImpl;


import com.commerceootb.core.service.KlarnaService;
import com.commerceootb.facades.facadeService.KlarnaPaymentFacade;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.order.CartService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KlarnaPaymentFacadeImpl implements KlarnaPaymentFacade {
    private CartService cartService;
    private KlarnaService klarnaService;

    public Map<String, Object> createKpSession() {
        CartModel cartModel = cartService.getSessionCart();

        Map<String, Object> payload = new HashMap<>();

        payload.put("purchase_country", "US");
        payload.put("purchase_currency", "USD");
        payload.put("locale", "en-US");
        payload.put("order_amount", cartModel.getTotalPrice());
        payload.put("order_tax_amount", cartModel.getTotalTax());


        List<Map<String, Object>> orderLines = cartModel.getEntries().stream().map(entry -> {
            Map<String, Object> orderLine = new HashMap<>();
            orderLine.put("name", entry.getProduct().getName());
            orderLine.put("quantity", entry.getQuantity());
            orderLine.put("unit_price", entry.getBasePrice());
            orderLine.put("total_amount", entry.getTotalPrice());
            return orderLine;
        }).collect(Collectors.toList());

        payload.put("order_lines", orderLines);
        KlarnaSessionResponseData kpSession = getKlarnaService().createKpSession(payload);
        createHppSession(kpSession.getSessionId());
        return payload;
    }

    public void createHppSession(String kpSessionID) {
        Map<String, Object> payload = new HashMap<>();
        String sessionURL = "https://api-na.playground.klarna.com/payments/v1/sessions/%s";
        payload.put("payment_session_url", String.format(sessionURL,kpSessionID));

        Map<String, Object> merchantUrls = new HashMap<>();
        merchantUrls.put("success", "https://example.com/success?sid={{session_id}}&authorization_token={authorization_token}");
        merchantUrls.put("cancel", "https://example.com/cancel?sid={{session_id}}");
        merchantUrls.put("back", "https://example.com/back?sid={{session_id}}");
        merchantUrls.put("failure", "https://example.com/fail?sid={{session_id}}");
        merchantUrls.put("error", "https://example.com/error?sid={{session_id}}");

        payload.put("merchant_urls", merchantUrls);


    }

    public KlarnaService getKlarnaService() {
        return klarnaService;
    }

    public void setKlarnaService(KlarnaService klarnaService) {
        this.klarnaService = klarnaService;
    }

    public CartService getCartService() {
        return cartService;
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }
}
