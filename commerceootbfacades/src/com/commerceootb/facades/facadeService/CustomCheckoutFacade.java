package com.commerceootb.facades.facadeService;

import de.hybris.platform.commercefacades.order.CheckoutFacade;

public interface CustomCheckoutFacade extends CheckoutFacade {
    boolean hasValidInstructions();
}
