package com.commerceootb.storefront.controllers.cms;

import com.commerceootb.core.model.OfferBannerComponentModel;
import com.commerceootb.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("OfferBannerComponent")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.OfferBannerComponent)
public class OfferBannerComponent extends AbstractCMSComponentController<OfferBannerComponentModel> {
    @Override
    protected void fillModel(HttpServletRequest request, Model model, OfferBannerComponentModel component) {
        model.addAttribute("title", component.getTitle());
        model.addAttribute("productLogo", component.getProductLogo());
        model.addAttribute("description", component.getDescription());
        model.addAttribute("wasPrice", component.getWasPrice());
        model.addAttribute("isPrice", component.getIsPrice());
        model.addAttribute("productImage", component.getProductImage());
    }

    @Override
    protected String getView(OfferBannerComponentModel component) {
        return ControllerConstants.Views.Cms.ComponentPrefix + "offerBannerComponent";
    }
}
