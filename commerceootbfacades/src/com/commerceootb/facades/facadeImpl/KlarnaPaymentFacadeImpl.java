package com.commerceootb.facades.facadeImpl;


import com.commerceootb.core.service.KlarnaService;
import com.commerceootb.facades.facadeService.KlarnaPaymentFacade;
import com.commerceootb.facades.klarna.data.KlarnaHppSessionResData;
import com.commerceootb.facades.klarna.data.KlarnaOrderDetails;
import com.commerceootb.facades.klarna.data.KlarnaOrderResponse;
import com.commerceootb.facades.klarna.data.KlarnaSessionResponseData;
import de.hybris.platform.core.enums.CreditCardType;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.payment.enums.PaymentTransactionType;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.payment.strategy.TransactionCodeGenerator;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class KlarnaPaymentFacadeImpl implements KlarnaPaymentFacade {
    private CartService cartService;
    private KlarnaService klarnaService;
    private ModelService modelService;
    private CommonI18NService commonI18NService;
    private TransactionCodeGenerator transactionCodeGenerator;

    private static final Logger LOGGER = Logger.getLogger(KlarnaPaymentFacadeImpl.class);

    @Override
    public KlarnaHppSessionResData createKpSession() {
        CartModel cartModel = getCartService().getSessionCart();

        Map<String, Object> payload = new HashMap<>();

        payload.put("purchase_country", cartModel.getDeliveryAddress().getCountry().getIsocode());
        payload.put("purchase_currency", cartModel.getCurrency().getIsocode());
        payload.put("locale", "en-US");
        payload.put("order_amount", Math.round(cartModel.getTotalPrice() * 100));
        payload.put("order_tax_amount", Math.round(cartModel.getTotalTax() * 100));


        List<Map<String, Object>> orderLines = cartModel.getEntries().stream().map(entry -> {
            Map<String, Object> orderLine = new HashMap<>();
            orderLine.put("name", entry.getProduct().getName());
            orderLine.put("quantity", entry.getQuantity());
            orderLine.put("unit_price", Math.round(entry.getBasePrice() * 100));
            orderLine.put("total_amount", Math.round(entry.getTotalPrice() * 100));
            return orderLine;
        }).collect(Collectors.toList());

        payload.put("order_lines", orderLines);
        KlarnaSessionResponseData kpSession = getKlarnaService().createKPSession(payload);
        KlarnaHppSessionResData hppSession = createHppSession(kpSession.getSession_id());
        LOGGER.info(kpSession);
        return hppSession;
    }

    public KlarnaHppSessionResData createHppSession(String kpSessionID) {
        Map<String, Object> payload = new HashMap<>();
        String sessionURL = "https://api-na.playground.klarna.com/payments/v1/sessions/%s";
        payload.put("payment_session_url", String.format(sessionURL, kpSessionID));

        Map<String, Object> merchantUrls = new HashMap<>();
        merchantUrls.put("success", "https://electronics.local:9002/commerceootbstorefront/electronics/en/checkout/multi/payment-method/klarna-success?sid={{session_id}}&authorization_token={authorization_token}");
        merchantUrls.put("cancel", "https://example.com/cancel?sid={{session_id}}");
        merchantUrls.put("back", "https://example.com/back?sid={{session_id}}");
        merchantUrls.put("failure", "https://example.com/fail?sid={{session_id}}");
        merchantUrls.put("error", "https://example.com/error?sid={{session_id}}");

        payload.put("merchant_urls", merchantUrls);
        return getKlarnaService().createHppSession(payload);
    }

    @Override
    public void createOrder(String sId, String token) {
        Map<String, Object> payload = new HashMap<>();

        CartModel cartModel = getCartService().getSessionCart();

        payload.put("purchase_country", cartModel.getDeliveryAddress().getCountry().getIsocode());
        payload.put("purchase_currency", "USD");

        Map<String, Object> billingAddress = new HashMap<>();
        billingAddress.put("given_name", cartModel.getDeliveryAddress().getFirstname());
        billingAddress.put("family_name", cartModel.getDeliveryAddress().getLastname());
        billingAddress.put("email", cartModel.getUser().getUid());
        billingAddress.put("title", cartModel.getDeliveryAddress().getTitle().getCode());
        billingAddress.put("street_address", cartModel.getDeliveryAddress().getStreetnumber());
        billingAddress.put("street_address2", cartModel.getDeliveryAddress().getStreetname());
        billingAddress.put("postal_code", cartModel.getDeliveryAddress().getPostalcode());
        billingAddress.put("city", cartModel.getUser().getDefaultShipmentAddress().getRegion().getName());
        billingAddress.put("region", cartModel.getUser().getDefaultShipmentAddress().getRegion().getIsocodeShort());
        billingAddress.put("phone", cartModel.getDeliveryAddress().getPhone1());
        billingAddress.put("country", cartModel.getDeliveryAddress().getCountry().getIsocode());

        payload.put("billing_address", billingAddress);

        payload.put("order_amount", Math.round(cartModel.getTotalPrice() * 100));
        payload.put("order_tax_amount", Math.round(cartModel.getTotalTax() * 100));


        List<Map<String, Object>> orderLines = cartModel.getEntries().stream().map(entry -> {
            Map<String, Object> orderLine = new HashMap<>();
            orderLine.put("type", "physical");
            orderLine.put("reference", "");
            orderLine.put("name", entry.getProduct().getName());
            orderLine.put("quantity", entry.getQuantity());
            orderLine.put("unit_price", Math.round(entry.getBasePrice() * 100));
            orderLine.put("total_amount", Math.round(entry.getTotalPrice() * 100));
            orderLine.put("total_discount_amount", 0);
            orderLine.put("total_tax_amount", 0);
            orderLine.put("product_url", "https://electronics.local:9002/commerceootbstorefront/electronics/en/"+entry.getProduct().getName()+"/p/"+entry.getProduct().getCode());
            orderLine.put("image_url", "https://www.exampleobjects.com/logo.png");
            return orderLine;
        }).collect(Collectors.toList());

        payload.put("order_lines", orderLines);

        Map<String, Object> merchantUrls = new HashMap<>();
        merchantUrls.put("confirmation", "https://electronics.local:9002/commerceootbstorefront/electronics/en/checkout/orderConfirmation/0005500…");
        merchantUrls.put("notification", "https://electronics.local:9002/commerceootbstorefront/electronics/en/checkout/orderConfirmation/0005500…");

        payload.put("merchant_urls", merchantUrls);

        payload.put("merchant_reference1", "45aa52f387871e3a210645d4");

        KlarnaOrderResponse order = getKlarnaService().createOrder(payload, sId, token);
        KlarnaOrderDetails orderDetails = getKlarnaService().getOrder(order.getOrder_id());
        paymentInfoModel(orderDetails);
    }

    private PaymentInfoModel paymentInfoModel(KlarnaOrderDetails orderDetails) {
        CartModel cartModel = getCartService().getSessionCart();
        CreditCardPaymentInfoModel paymentInfoModel = getModelService().create(CreditCardPaymentInfoModel.class);
        paymentInfoModel.setCode("klarna-" + cartModel.getCode());
        paymentInfoModel.setUser(cartModel.getUser());
        paymentInfoModel.setBillingAddress(cartModel.getUser().getDefaultPaymentAddress());

        // Dummy card values
        paymentInfoModel.setCcOwner(cartModel.getUser().getName());
        paymentInfoModel.setIssueNumber(123);
        paymentInfoModel.setNumber("4111111111111111");
        paymentInfoModel.setSubscriptionId(orderDetails.getOrder_id());
        paymentInfoModel.setSubscriptionServiceId("service"+orderDetails.getOrder_id());
        paymentInfoModel.setType(CreditCardType.VISA);
        paymentInfoModel.setValidFromMonth("01");
        paymentInfoModel.setValidFromYear("2023");
        paymentInfoModel.setValidToMonth("12");
        paymentInfoModel.setValidToYear("2028");

        PaymentTransactionModel transaction = paymentTransactionModel(orderDetails);
        transaction.setCode(getTransactionCodeGenerator().generateCode(cartModel.getCode()));
        transaction.setInfo(paymentInfoModel);

        PaymentTransactionEntryModel entry = paymentTransactionEntryModel(orderDetails,transaction);
        transaction.setEntries(List.of(entry));

        cartModel.setPaymentInfo(paymentInfoModel);
        cartModel.setPaymentTransactions(List.of(transaction));

        getModelService().saveAll(paymentInfoModel, transaction, entry, cartModel);

        return paymentInfoModel;
    }

    private PaymentTransactionModel paymentTransactionModel(KlarnaOrderDetails orderDetails) {
        PaymentTransactionModel paymentTransactionModel = getModelService().create(PaymentTransactionModel.class);

        paymentTransactionModel.setRequestId(orderDetails.getOrder_id());
        paymentTransactionModel.setRequestToken("token-xyz");
        paymentTransactionModel.setPaymentProvider("DummyProvider");
        paymentTransactionModel.setPlannedAmount(BigDecimal.valueOf(100.00));
        paymentTransactionModel.setCurrency(commonI18NService.getCurrency("USD"));
        paymentTransactionModel.setVersionID("v1");
        return paymentTransactionModel;
    }

    private PaymentTransactionEntryModel paymentTransactionEntryModel(KlarnaOrderDetails orderDetails,PaymentTransactionModel parentTransaction) {
        PaymentTransactionEntryModel paymentTransactionEntryModel = getModelService().create(PaymentTransactionEntryModel.class);
        paymentTransactionEntryModel.setCode(parentTransaction.getCode());
        paymentTransactionEntryModel.setType(PaymentTransactionType.AUTHORIZATION);
        paymentTransactionEntryModel.setTransactionStatus(orderDetails.getFraud_status());
        paymentTransactionEntryModel.setAmount(BigDecimal.valueOf(100.00));
        paymentTransactionEntryModel.setCurrency(commonI18NService.getCurrency(orderDetails.getPurchase_currency()));
        paymentTransactionEntryModel.setTime(new Date());
        paymentTransactionEntryModel.setPaymentTransaction(parentTransaction);
        return paymentTransactionEntryModel;
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

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public CommonI18NService getCommonI18NService() {
        return commonI18NService;
    }

    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }

    public TransactionCodeGenerator getTransactionCodeGenerator() {
        return transactionCodeGenerator;
    }

    public void setTransactionCodeGenerator(TransactionCodeGenerator transactionCodeGenerator) {
        this.transactionCodeGenerator = transactionCodeGenerator;
    }
}
