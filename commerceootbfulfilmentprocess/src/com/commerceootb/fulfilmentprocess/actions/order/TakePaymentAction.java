/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.commerceootb.fulfilmentprocess.actions.order;

import com.commerceootb.core.service.KlarnaService;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.payment.PaymentService;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;


/**
 * The TakePayment step captures the payment transaction.
 */
public class TakePaymentAction extends AbstractSimpleDecisionAction<OrderProcessModel>
{
	private static final Logger LOG = Logger.getLogger(TakePaymentAction.class);

	private PaymentService paymentService;
    private KlarnaService klarnaService;

	@Override
	public Transition executeAction(final OrderProcessModel process)
	{
		final OrderModel order = process.getOrder();

		for (final PaymentTransactionModel txn : order.getPaymentTransactions())
		{
            if(!txn.getRequestId().equals("mock")){
                Map<String, Object> payload = new HashMap<>();
                payload.put("captured_amount", txn.getOrder().getTotalPrice().longValue());
                ResponseEntity<Map> response;
                try {
                    response = klarnaService.captureOrder(payload, txn.getRequestId());
                } catch (Exception e) {
                    setOrderStatus(order,OrderStatus.CANCELLED);
                    return Transition.NOK;
                }

                if (response == null || !response.getStatusCode().is2xxSuccessful()) {
                    setOrderStatus(order,OrderStatus.CHECKED_INVALID);
                    return Transition.NOK;
                }
            }else{
                if (txn.getInfo() instanceof CreditCardPaymentInfoModel)
                {
                    final PaymentTransactionEntryModel txnEntry = getPaymentService().capture(txn);

                    if (TransactionStatus.ACCEPTED.name().equals(txnEntry.getTransactionStatus()))
                    {
                        if (LOG.isDebugEnabled())
                        {
                            LOG.debug("The payment transaction has been captured. Order: " + order.getCode() + ". Txn: " + txn.getCode());
                        }
                        setOrderStatus(order, OrderStatus.PAYMENT_CAPTURED);
                    }
                    else
                    {
                        LOG.error("The payment transaction capture has failed. Order: " + order.getCode() + ". Txn: " + txn.getCode());
                        setOrderStatus(order, OrderStatus.PAYMENT_NOT_CAPTURED);
                        return Transition.NOK;
                    }
                }
            }
		}
        setOrderStatus(order,OrderStatus.PAYMENT_CAPTURED);
		return Transition.OK;
	}


	protected PaymentService getPaymentService()
	{
		return paymentService;
	}

	@Required
	public void setPaymentService(final PaymentService paymentService)
	{
		this.paymentService = paymentService;
	}

    public KlarnaService getKlarnaService() {
        return klarnaService;
    }

    public void setKlarnaService(KlarnaService klarnaService) {
        this.klarnaService = klarnaService;
    }
}
