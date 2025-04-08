package com.commerceootb.storefront.controllers.pages.checkout.steps;

import com.commerceootb.core.enums.DeliveryPeriod;
import com.commerceootb.core.jalo.DeliveryInstruction;
import com.commerceootb.core.model.DeliveryInstructionModel;
import com.commerceootb.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateQuoteCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/checkout/multi/delivery-instruction")
public class DeliveryInstructionCheckoutStepController extends AbstractCheckoutStepController {

    private static final String DELIVERY_INSTRUCTION = "delivery-instruction";
    @Resource(name = "modelService")
    private ModelService modelService;
    @Resource(name = "cartService")
    private CartService cartService;
    @Override
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @RequireHardLogIn
    @PreValidateQuoteCheckoutStep
    @PreValidateCheckoutStep(checkoutStep = DELIVERY_INSTRUCTION)
    public String enterStep(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException, CommerceCartModificationException {

        final CartData cartData = getCheckoutFacade().getCheckoutCart();
        DeliveryInstructionModel deliveryInstructionModel = new DeliveryInstructionModel();
        model.addAttribute("cartData", cartData);
        model.addAttribute("deliveryInstruction", deliveryInstructionModel);
        this.prepareDataForPage(model);
        final ContentPageModel multiCheckoutSummaryPage = getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL);
        storeCmsPageInModel(model, multiCheckoutSummaryPage);
        setUpMetaDataForContentPage(model, multiCheckoutSummaryPage);
        setCheckoutStepLinksForModel(model, getCheckoutStep());
        model.addAttribute(WebConstants.BREADCRUMBS_KEY,
                getResourceBreadcrumbBuilder().getBreadcrumbs("checkout.multi.deliveryMethod.breadcrumb"));
        model.addAttribute("metaRobots", "noindex,nofollow");
        return ControllerConstants.Views.Pages.MultiStepCheckout.DeliveryInstructionPage;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @RequireHardLogIn
    public String doSelectDeliveryMode(@RequestParam("instruction") final String instruction,
                                       @RequestParam("deliveryPeriod") final String deliveryPeriod)
    {
        if (StringUtils.isNotEmpty(instruction) && StringUtils.isNotEmpty(deliveryPeriod))
        {
            DeliveryInstructionModel deliveryInstructionModel = new DeliveryInstructionModel();
            deliveryInstructionModel.setInstruction(instruction);
            deliveryInstructionModel.setDeliveryPeriod(DeliveryPeriod.valueOf(deliveryPeriod));
            getModelService().save(deliveryInstructionModel);
            CartModel cartModel = getCartService().getSessionCart();
            cartModel.setDeliveryInstruction(deliveryInstructionModel);
            getModelService().save(cartModel);
        }

        return getCheckoutStep().nextStep();
    }

    @GetMapping("/back")
    @RequireHardLogIn
    @Override
    public String back(RedirectAttributes redirectAttributes) {
        return getCheckoutStep().previousStep();
    }

    @GetMapping("/next")
    @RequireHardLogIn
    @Override
    public String next(RedirectAttributes redirectAttributes) {
        return getCheckoutStep().nextStep();
    }

    protected CheckoutStep getCheckoutStep()
    {
        return getCheckoutStep(DELIVERY_INSTRUCTION);
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public CartService getCartService() {
        return cartService;
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }
}
