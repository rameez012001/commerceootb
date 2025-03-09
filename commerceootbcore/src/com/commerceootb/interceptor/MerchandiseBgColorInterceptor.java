package com.commerceootb.interceptor;

import com.commerceootb.core.model.MerchandiseComponentModel;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.site.BaseSiteService;

public class MerchandiseBgColorInterceptor implements InitDefaultsInterceptor<MerchandiseComponentModel> {
    @Override
    public void onInitDefaults(MerchandiseComponentModel merchandiseComponentModel, InterceptorContext interceptorContext) throws InterceptorException {
        merchandiseComponentModel.setBgColor("red");

    }
}