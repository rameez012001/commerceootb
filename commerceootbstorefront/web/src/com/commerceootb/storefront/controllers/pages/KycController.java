package com.commerceootb.storefront.controllers.pages;

import com.commerceootb.facades.facadeService.KycCustomFacade;
import com.commerceootb.facades.product.data.KycData;
import com.commerceootb.storefront.forms.KycDocumentForm;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.ThirdPartyConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.ProfileValidator;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@Controller
@RequestMapping("/kyc")
public class KycController extends AbstractPageController {
    private static final String KYC_CMS_PAGE = "kycCMSPage";
    private static final String TITLE_DATA_ATTR = "titleData";
    private static final String BREADCRUMBS_ATTR = "breadcrumbs";
    private static final String TEXT_ACCOUNT_PROFILE = "text.account.profile";
    private static final String REDIRECT_TO_UPDATE_PROFILE = "redirect:/my-account/update-profile";

    @Resource(name = "userFacade")
    private UserFacade userFacade;
    @Resource(name = "accountBreadcrumbBuilder")
    private ResourceBreadcrumbBuilder accountBreadcrumbBuilder;
    @Resource(name = "customerFacade")
    private CustomerFacade customerFacade;
    @Resource(name = "kycCustomFacade")
    private KycCustomFacade kycCustomFacade;
    @Resource(name = "profileValidator")
    private ProfileValidator profileValidator;

    public ProfileValidator getProfileValidator() {
        return profileValidator;
    }

    public void setProfileValidator(ProfileValidator profileValidator) {
        this.profileValidator = profileValidator;
    }

    @GetMapping
    public String getView(final Model model) throws CMSItemNotFoundException {

        model.addAttribute(TITLE_DATA_ATTR, userFacade.getTitles());

        final CustomerData customerData = customerFacade.getCurrentCustomer();
        final KycDocumentForm updateProfileForm = new KycDocumentForm();

        updateProfileForm.setTitleCode(customerData.getTitleCode());
        updateProfileForm.setFirstName(customerData.getFirstName());
        updateProfileForm.setLastName(customerData.getLastName());

        KycData kycData = kycCustomFacade.getKycDatas();

        updateProfileForm.setDocumentType(kycData.getDocumentType());
        updateProfileForm.setDocumentId(kycData.getDocumentId());
        updateProfileForm.setPostalCode(kycData.getPostalCode());
        updateProfileForm.setNationality(kycData.getNationality());
        updateProfileForm.setDob(String.valueOf(kycData.getDob()));

        model.addAttribute("updateProfileForm", updateProfileForm);

        final ContentPageModel kycCMSPage = getContentPageForLabelOrId(KYC_CMS_PAGE);
        storeCmsPageInModel(model, kycCMSPage);
        setUpMetaDataForContentPage(model, kycCMSPage);

        model.addAttribute(BREADCRUMBS_ATTR, accountBreadcrumbBuilder.getBreadcrumbs(TEXT_ACCOUNT_PROFILE));
        model.addAttribute(ThirdPartyConstants.SeoRobots.META_ROBOTS, ThirdPartyConstants.SeoRobots.NOINDEX_NOFOLLOW);
        return getViewForPage(model);

    }

    @PostMapping("/update-profile")
    public String updateProfile(final KycDocumentForm updateProfileForm, final BindingResult bindingResult, final Model model,
                                final RedirectAttributes redirectAttributes) throws Exception {
        getProfileValidator().validate(updateProfileForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "Error Page";
        }

        KycData kycData     = new KycData();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        try {
            kycData.setDob(sd.parse(updateProfileForm.getDob()));
        } catch (ParseException e) {
            e.printStackTrace();
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Invalid date format");
            return REDIRECT_TO_UPDATE_PROFILE;
        }
        kycData.setNationality(updateProfileForm.getNationality());
        kycData.setPostalCode(updateProfileForm.getPostalCode());
        kycData.setDocumentType(updateProfileForm.getDocumentType());
        kycData.setDocumentId(updateProfileForm.getDocumentId());

        kycCustomFacade.updateCustomerKyc(kycData);

        final CustomerData currentCustomerData = customerFacade.getCurrentCustomer();
        final CustomerData customerData = new CustomerData();
        customerData.setTitleCode(updateProfileForm.getTitleCode());
        customerData.setFirstName(updateProfileForm.getFirstName());
        customerData.setLastName(updateProfileForm.getLastName());
        customerData.setUid(currentCustomerData.getUid());
        customerData.setDisplayUid(currentCustomerData.getDisplayUid());

        try {
            customerFacade.updateProfile(customerData);
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                    "text.account.profile.confirmationUpdated", null);
        } catch (final DuplicateUidException e) {
            bindingResult.rejectValue("email", "registration.error.account.exists.title");
            return "Error Page";
        }

        return "redirect:/kyc";
    }
}