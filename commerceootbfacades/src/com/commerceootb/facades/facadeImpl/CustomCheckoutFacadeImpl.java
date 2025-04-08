package com.commerceootb.facades.facadeImpl;

import com.commerceootb.facades.facadeService.CustomCheckoutFacade;
import de.hybris.platform.commercefacades.order.impl.DefaultCheckoutFacade;
import de.hybris.platform.core.model.order.CartModel;

public class CustomCheckoutFacadeImpl extends DefaultCheckoutFacade implements CustomCheckoutFacade {
    @Override
    public boolean hasValidInstructions() {
        if (!getCartService().hasSessionCart())
        {
            return false;
        }
        final CartModel cartModel = getCartService().getSessionCart();
        return true;
    }
}
