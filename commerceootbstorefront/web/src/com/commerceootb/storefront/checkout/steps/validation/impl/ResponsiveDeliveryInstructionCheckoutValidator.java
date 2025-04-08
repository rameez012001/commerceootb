package com.commerceootb.storefront.checkout.steps.validation.impl;

import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.validation.AbstractCheckoutStepValidator;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.validation.ValidationResults;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class ResponsiveDeliveryInstructionCheckoutValidator extends AbstractCheckoutStepValidator
{
    private static final Logger log = Logger.getLogger(ResponsiveDeliveryInstructionCheckoutValidator.class);
    @Override
    public ValidationResults validateOnEnter(final RedirectAttributes redirectAttributes)
    {

        if (getCheckoutFlowFacade().hasNoDeliveryMode())
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.INFO_MESSAGES_HOLDER,
                    "checkout.multi.deliveryMethod.notprovided");
            log.info("ResponsiveDeliveryInstructionCheckoutValidator success");
            return ValidationResults.REDIRECT_TO_DELIVERY_METHOD;
        }

        return ValidationResults.SUCCESS;
    }
}

