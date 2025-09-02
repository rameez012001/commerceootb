/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22-Aug-2025, 11:43:51 am                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.commerceootb.core.jalo.OfferBannerComponent OfferBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedOfferBannerComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>OfferBannerComponent.productLogo</code> attribute **/
	public static final String PRODUCTLOGO = "productLogo";
	/** Qualifier of the <code>OfferBannerComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>OfferBannerComponent.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>OfferBannerComponent.wasPrice</code> attribute **/
	public static final String WASPRICE = "wasPrice";
	/** Qualifier of the <code>OfferBannerComponent.isPrice</code> attribute **/
	public static final String ISPRICE = "isPrice";
	/** Qualifier of the <code>OfferBannerComponent.productImage</code> attribute **/
	public static final String PRODUCTIMAGE = "productImage";
	/** Qualifier of the <code>OfferBannerComponent.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTLOGO, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(WASPRICE, AttributeMode.INITIAL);
		tmp.put(ISPRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTIMAGE, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.isPrice</code> attribute.
	 * @return the isPrice
	 */
	public CMSLinkComponent getIsPrice(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, ISPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.isPrice</code> attribute.
	 * @return the isPrice
	 */
	public CMSLinkComponent getIsPrice()
	{
		return getIsPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.isPrice</code> attribute. 
	 * @param value the isPrice
	 */
	public void setIsPrice(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, ISPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.isPrice</code> attribute. 
	 * @param value the isPrice
	 */
	public void setIsPrice(final CMSLinkComponent value)
	{
		setIsPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.productImage</code> attribute.
	 * @return the productImage
	 */
	public Media getProductImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PRODUCTIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.productImage</code> attribute.
	 * @return the productImage
	 */
	public Media getProductImage()
	{
		return getProductImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.productImage</code> attribute. 
	 * @param value the productImage
	 */
	public void setProductImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PRODUCTIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.productImage</code> attribute. 
	 * @param value the productImage
	 */
	public void setProductImage(final Media value)
	{
		setProductImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.productLogo</code> attribute.
	 * @return the productLogo
	 */
	public Media getProductLogo(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PRODUCTLOGO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.productLogo</code> attribute.
	 * @return the productLogo
	 */
	public Media getProductLogo()
	{
		return getProductLogo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.productLogo</code> attribute. 
	 * @param value the productLogo
	 */
	public void setProductLogo(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PRODUCTLOGO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.productLogo</code> attribute. 
	 * @param value the productLogo
	 */
	public void setProductLogo(final Media value)
	{
		setProductLogo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOfferBannerComponent.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.title</code> attribute. 
	 * @return the localized title
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.title</code> attribute. 
	 * @return the localized title
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOfferBannerComponent.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.title</code> attribute. 
	 * @param value the title
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.title</code> attribute. 
	 * @param value the title
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.wasPrice</code> attribute.
	 * @return the wasPrice
	 */
	public String getWasPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WASPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBannerComponent.wasPrice</code> attribute.
	 * @return the wasPrice
	 */
	public String getWasPrice()
	{
		return getWasPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.wasPrice</code> attribute. 
	 * @param value the wasPrice
	 */
	public void setWasPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WASPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBannerComponent.wasPrice</code> attribute. 
	 * @param value the wasPrice
	 */
	public void setWasPrice(final String value)
	{
		setWasPrice( getSession().getSessionContext(), value );
	}
	
}
