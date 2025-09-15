/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-Sep-2025, 12:25:18 pm                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import de.hybris.platform.catalog.jalo.Catalog;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MerchandiseComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMerchandiseComponent extends GenericItem
{
	/** Qualifier of the <code>MerchandiseComponent.catalog</code> attribute **/
	public static final String CATALOG = "catalog";
	/** Qualifier of the <code>MerchandiseComponent.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>MerchandiseComponent.textCode</code> attribute **/
	public static final String TEXTCODE = "textCode";
	/** Qualifier of the <code>MerchandiseComponent.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>MerchandiseComponent.text</code> attribute **/
	public static final String TEXT = "text";
	/** Qualifier of the <code>MerchandiseComponent.textColor</code> attribute **/
	public static final String TEXTCOLOR = "textColor";
	/** Qualifier of the <code>MerchandiseComponent.bgColor</code> attribute **/
	public static final String BGCOLOR = "bgColor";
	/** Qualifier of the <code>MerchandiseComponent.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	/** Qualifier of the <code>MerchandiseComponent.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>MerchandiseComponent.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>MerchandiseComponent.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMerchandiseComponent> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedMerchandiseComponent>(
	CommerceootbCoreConstants.TC.MERCHANDISECOMPONENT,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATALOG, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(TEXTCODE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		tmp.put(TEXTCOLOR, AttributeMode.INITIAL);
		tmp.put(BGCOLOR, AttributeMode.INITIAL);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.bgColor</code> attribute.
	 * @return the bgColor
	 */
	public String getBgColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BGCOLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.bgColor</code> attribute.
	 * @return the bgColor
	 */
	public String getBgColor()
	{
		return getBgColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.bgColor</code> attribute. 
	 * @param value the bgColor
	 */
	public void setBgColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BGCOLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.bgColor</code> attribute. 
	 * @param value the bgColor
	 */
	public void setBgColor(final String value)
	{
		setBgColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.catalog</code> attribute.
	 * @return the catalog
	 */
	public Catalog getCatalog(final SessionContext ctx)
	{
		return (Catalog)getProperty( ctx, CATALOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.catalog</code> attribute.
	 * @return the catalog
	 */
	public Catalog getCatalog()
	{
		return getCatalog( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.catalog</code> attribute. 
	 * @param value the catalog
	 */
	public void setCatalog(final SessionContext ctx, final Catalog value)
	{
		setProperty(ctx, CATALOG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.catalog</code> attribute. 
	 * @param value the catalog
	 */
	public void setCatalog(final Catalog value)
	{
		setCatalog( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		new PartOfHandler<CatalogVersion>()
		{
			@Override
			protected CatalogVersion doGetValue(final SessionContext ctx)
			{
				return getCatalogVersion( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final CatalogVersion _value)
			{
				final CatalogVersion value = _value;
				setProperty(ctx, CATALOGVERSION,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.priority</code> attribute.
	 * @return the priority
	 */
	public String getPriority(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.priority</code> attribute.
	 * @return the priority
	 */
	public String getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.priority</code> attribute. 
	 * @param value the priority
	 */
	public void setPriority(final String value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.text</code> attribute.
	 * @return the text
	 */
	public String getText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMerchandiseComponent.getText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.text</code> attribute.
	 * @return the text
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.text</code> attribute. 
	 * @return the localized text
	 */
	public Map<Language,String> getAllText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.text</code> attribute. 
	 * @return the localized text
	 */
	public Map<Language,String> getAllText()
	{
		return getAllText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMerchandiseComponent.setText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.text</code> attribute. 
	 * @param value the text
	 */
	public void setAllText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.text</code> attribute. 
	 * @param value the text
	 */
	public void setAllText(final Map<Language,String> value)
	{
		setAllText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.textCode</code> attribute.
	 * @return the textCode
	 */
	public String getTextCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.textCode</code> attribute.
	 * @return the textCode
	 */
	public String getTextCode()
	{
		return getTextCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.textCode</code> attribute. 
	 * @param value the textCode
	 */
	public void setTextCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.textCode</code> attribute. 
	 * @param value the textCode
	 */
	public void setTextCode(final String value)
	{
		setTextCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.textColor</code> attribute.
	 * @return the textColor
	 */
	public String getTextColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXTCOLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.textColor</code> attribute.
	 * @return the textColor
	 */
	public String getTextColor()
	{
		return getTextColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.textColor</code> attribute. 
	 * @param value the textColor
	 */
	public void setTextColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXTCOLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.textColor</code> attribute. 
	 * @param value the textColor
	 */
	public void setTextColor(final String value)
	{
		setTextColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchandiseComponent.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchandiseComponent.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
