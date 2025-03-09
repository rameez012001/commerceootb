package com.commerceootb.interceptor;

import com.commerceootb.core.model.OfferBannerComponentModel;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.commerceservices.url.UrlResolver;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;
import org.apache.commons.lang.BooleanUtils;

import java.util.Collection;
import java.util.Objects;

public class BannerComponentIntreceptor implements LoadInterceptor<OfferBannerComponentModel> {
    private ProductService productService;
    private CatalogVersionService catalogVersionService;
    private UrlResolver<ProductModel> productModelUrlResolver;
    private final String CATALOG_VERSION = "Online";
    private final String CATALOG_NAME = "electronicsProductCatalog";

    @Override
    public void onLoad(OfferBannerComponentModel offerBannerComponentModel, InterceptorContext interceptorContext) throws InterceptorException {
        CatalogVersionModel catalogVersionModel = getCatalogVersionService().getCatalogVersion(CATALOG_NAME,CATALOG_VERSION);
        ProductModel product = getProductService().getProductForCode(catalogVersionModel,offerBannerComponentModel.getProductCode());
        Collection<PriceRowModel> priceRowModels = product.getEurope1Prices();
        PriceRowModel priceRowModel = priceRowModels.stream().filter(x-> BooleanUtils.isTrue(x.getGiveAwayPrice()))
                .findFirst().orElseThrow(()->new RuntimeException("No Price Row Model Found"));
        offerBannerComponentModel.setWasPrice(String.valueOf(priceRowModel.getPrice()));
        if(Objects.nonNull(priceRowModel.getPrice())){
            offerBannerComponentModel.getIsPrice().setLinkName(String.valueOf(priceRowModel.getOfferPrice()));
            offerBannerComponentModel.getIsPrice().setUrl(getProductModelUrlResolver().resolve(product));
        }
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public CatalogVersionService getCatalogVersionService() {
        return catalogVersionService;
    }

    public void setCatalogVersionService(CatalogVersionService catalogVersionService) {
        this.catalogVersionService = catalogVersionService;
    }

    public UrlResolver<ProductModel> getProductModelUrlResolver() {
        return productModelUrlResolver;
    }

    public void setProductModelUrlResolver(UrlResolver<ProductModel> productModelUrlResolver) {
        this.productModelUrlResolver = productModelUrlResolver;
    }
}