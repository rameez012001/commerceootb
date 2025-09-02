package com.commerceootb.fulfilmentprocess.actions.order;

import de.hybris.platform.apiregistryservices.model.ConsumedDestinationModel;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.integrationservices.model.IntegrationObjectModel;
import de.hybris.platform.integrationservices.service.IntegrationObjectService;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.outboundservices.facade.OutboundServiceFacade;
import de.hybris.platform.outboundservices.facade.SyncParameters;
import de.hybris.platform.outboundservices.service.DestinationSearchService;
import de.hybris.platform.processengine.action.AbstractAction;
import de.hybris.platform.task.RetryLaterException;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;


public class SendOrderToErpAction extends AbstractAction<OrderProcessModel> {

    private static final Logger logger = Logger.getLogger(SendOrderToErpAction.class);

    private OutboundServiceFacade outboundServiceFacade;

    private IntegrationObjectService integrationObjectService;

    private DestinationSearchService destinationSearchService;

    public enum Transition
    {
        OK, NOK, SEND_ERROR_EMAIL;

        public static Set<String> getStringValues()
        {
            final Set<String> res = new HashSet<>();
            for (final Transition transitions : Transition.values())
            {
                res.add(transitions.toString());
            }
            return res;
        }
    }

    @Override
    public String execute(OrderProcessModel process) throws RetryLaterException, Exception {
        return executeAction(process).toString();
    }

    @Override
    public Set<String> getTransitions() {
        return Transition.getStringValues();
    }

    public Transition executeAction(final OrderProcessModel process) {
        final OrderModel order = process.getOrder();
        IntegrationObjectModel outboundOrderIO = getIntegrationObjectService().findIntegrationObject("OutboundOrder");
        ConsumedDestinationModel destination = getDestinationSearchService().findDestination("SpringErpConsumedDestination");
        if (order == null) {
            logger.error("Order is null in OrderProcessModel.");
            return Transition.NOK;
        }
        final SyncParameters params = SyncParameters.syncParametersBuilder()
                .withPayloadObject(process.getOrder())
                .withIntegrationObject(outboundOrderIO)
                .withDestination(destination)
                .build();
        try {
            getOutboundServiceFacade().send(params)
                    .subscribe(
                            response -> updateOrderStatus(order, response.getStatusCode().is2xxSuccessful()
                                    ? OrderStatus.CREATED
                                    : OrderStatus.PROCESSING_ERROR),
                            throwable -> updateOrderStatus(order, OrderStatus.PROCESSING_ERROR)
                    );
            return Transition.OK;
        } catch (Exception e) {
            logger.error("Error occurred while sending order to outbound service", e);
            updateOrderStatus(order, OrderStatus.PROCESSING_ERROR);
            return Transition.NOK;
        }

    }

    private void updateOrderStatus(OrderModel order, OrderStatus status) {
        order.setStatus(status);
        getModelService().save(order);
    }

    public OutboundServiceFacade getOutboundServiceFacade() {
        return outboundServiceFacade;
    }

    public void setOutboundServiceFacade(OutboundServiceFacade outboundServiceFacade) {
        this.outboundServiceFacade = outboundServiceFacade;
    }

    public IntegrationObjectService getIntegrationObjectService() {
        return integrationObjectService;
    }

    public void setIntegrationObjectService(IntegrationObjectService integrationObjectService) {
        this.integrationObjectService = integrationObjectService;
    }

    public DestinationSearchService getDestinationSearchService() {
        return destinationSearchService;
    }

    public void setDestinationSearchService(DestinationSearchService destinationSearchService) {
        this.destinationSearchService = destinationSearchService;
    }
}
