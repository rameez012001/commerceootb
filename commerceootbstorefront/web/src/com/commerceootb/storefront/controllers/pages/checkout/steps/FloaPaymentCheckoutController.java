package com.commerceootb.storefront.controllers.pages.checkout.steps;

import com.commerceootb.facades.facadeService.FloaPaymentFacade;
import com.commerceootb.facades.floa.data.InstallmentPlanResponse;
import com.commerceootb.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorfacades.order.AcceleratorCheckoutFacade;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateQuoteCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.commercefacades.order.data.CartData;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.math.RoundingMode;
import java.util.*;

@Controller
@RequestMapping(value = "/checkout1/multi/payment-method")
public class FloaPaymentCheckoutController extends AbstractCheckoutStepController {
    private static final String PAYMENT_METHOD = "payment-method";
    private static final Logger LOG = Logger.getLogger(FloaPaymentCheckoutController.class);
    @Resource(name = "floaPaymentFacade")
    private FloaPaymentFacade floaPaymentFacade;

    @Resource(name = "acceleratorCheckoutFacade")
    private AcceleratorCheckoutFacade checkoutFacade;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @RequireHardLogIn
    @PreValidateQuoteCheckoutStep
    @PreValidateCheckoutStep(checkoutStep = PAYMENT_METHOD)
    public String enterStep(final Model model, final RedirectAttributes redirectAttributes) {
        try {
            CartData cartData = getCheckoutFacade().getCheckoutCart();
            InstallmentPlanResponse plans = getFloaPaymentFacade().getSimulatedPlans(cartData.getTotalPrice().getValue().setScale(0, RoundingMode.HALF_UP));
            model.addAttribute("simulatedPlans", plans.getSimulatedInstallmentPlans());
        } catch (Exception e) {
            model.addAttribute("error", "Unable to fetch installment plans.");
        }
        return ControllerConstants.Views.Pages.Custom.customFloaPage;
    }

    protected CheckoutStep getCheckoutStep() {
        return getCheckoutStep(PAYMENT_METHOD);
    }

    @PostMapping("/createDealTemplate/{productCode}")
    @RequireHardLogIn
    public String postCreateDealTemplate(@PathVariable String productCode, final Model model, final RedirectAttributes redirectAttributes) {

        CartData cartData = getCheckoutFacade().getCheckoutCart();

        Map<String, Object> dealTemplate = getFloaPaymentFacade().createDealTemplate(productCode, cartData);

        if (dealTemplate != null && !dealTemplate.isEmpty()) {
            model.addAttribute("dealTemplate", dealTemplate);
        } else {
            return "redirect:/add";
        }

        return ControllerConstants.Views.Pages.Custom.customFloaPage;
    }


    @PostMapping("/finalizeDeal/{dealReference}")
    @RequireHardLogIn
    public String finalizeDeal1(@PathVariable String dealReference) {
        CartData cartData = getCheckoutFacade().getCheckoutCart();

        Map<String, Object> finalizeDeal = getFloaPaymentFacade().finalizeDeal(dealReference, cartData);
        List<Map<String, Object>> links = (List<Map<String, Object>>) finalizeDeal.get("links");
        if (links != null) {
            for (Map<String, Object> link : links) {
                if ("redirect-payment-journey".equals(link.get("rel"))) {
                    String href = (String) link.get("href");
                    return "redirect:" + href;
                }
            }
        }
        return "redirect:/checkout/multi/payment-method/add";
    }

    @PostMapping("/payment-success")
    public ResponseEntity<Void> postPaymentStatus(@RequestBody Map<String, Object> payload) {
        LOG.info(payload);
        return ResponseEntity.ok().build();
    }


    @RequestMapping(value = "/payment-success", method = RequestMethod.GET)
    @RequireHardLogIn
    public String paymentSuccess() {
        return getCheckoutStep().nextStep();
    }

    @RequestMapping(value = "/back", method = RequestMethod.GET)
    @RequireHardLogIn
    @Override
    public String back(final RedirectAttributes redirectAttributes)
    {
        return getCheckoutStep().previousStep();
    }

    @RequestMapping(value = "/next", method = RequestMethod.GET)
    @RequireHardLogIn
    @Override
    public String next(final RedirectAttributes redirectAttributes)
    {
        return getCheckoutStep().nextStep();
    }

    public FloaPaymentFacade getFloaPaymentFacade() {
        return floaPaymentFacade;
    }

    public void setFloaPaymentFacade(FloaPaymentFacade floaPaymentFacade) {
        this.floaPaymentFacade = floaPaymentFacade;
    }

    public AcceleratorCheckoutFacade getCheckoutFacade() {
        return checkoutFacade;
    }

    public void setCheckoutFacade(AcceleratorCheckoutFacade checkoutFacade) {
        this.checkoutFacade = checkoutFacade;
    }
}