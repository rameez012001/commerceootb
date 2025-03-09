package com.commerceootb.facades.process.email.context;

import com.commerceootb.core.model.KycEmailProcessModel;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.log4j.Logger;

public class KycEmailContext extends AbstractEmailContext<KycEmailProcessModel> {

    private static final Logger LOG = Logger.getLogger(KycEmailContext.class);

    private String documentNumber;

    @Override
    public void init(KycEmailProcessModel businessProcessModel, EmailPageModel emailPageModel) {
        super.init(businessProcessModel, emailPageModel);

        this.documentNumber = businessProcessModel.getKycDetail().getDocumentId();
        String displayName = businessProcessModel.getKycDetail().getCustomer().getName();

        put(TITLE, "Sir/Madam");
        put(DISPLAY_NAME, displayName);
        put(FROM_EMAIL, "rameez.hameed@laderatechnology.com");
        put(FROM_DISPLAY_NAME, "Rameez");
        put("documentNumber", documentNumber);

        LOG.debug("Initialized KYC Email Context with documentNumber: " + documentNumber + ", displayName: " + displayName);
    }

    @Override
    protected BaseSiteModel getSite(KycEmailProcessModel businessProcessModel) {
        return businessProcessModel.getKycDetail().getCustomer().getSite();
    }

    @Override
    protected CustomerModel getCustomer(KycEmailProcessModel businessProcessModel) {
        return businessProcessModel.getKycDetail().getCustomer();
    }

    @Override
    protected LanguageModel getEmailLanguage(KycEmailProcessModel businessProcessModel) {
        LanguageModel language = businessProcessModel.getKycDetail().getCustomer().getSessionLanguage();
        if (language == null) {
            LOG.warn("Session language is null, falling back to default language.");
        }
        return language;
    }
}