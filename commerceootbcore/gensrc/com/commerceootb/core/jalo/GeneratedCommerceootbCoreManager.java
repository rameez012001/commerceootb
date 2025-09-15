/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-Sep-2025, 12:25:18 pm                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import com.commerceootb.core.jalo.ApparelProduct;
import com.commerceootb.core.jalo.ApparelSizeVariantProduct;
import com.commerceootb.core.jalo.ApparelStyleVariantProduct;
import com.commerceootb.core.jalo.Bpcl;
import com.commerceootb.core.jalo.CustomLink;
import com.commerceootb.core.jalo.DeliveryInstruction;
import com.commerceootb.core.jalo.ElectronicsColorVariantProduct;
import com.commerceootb.core.jalo.KycDetails;
import com.commerceootb.core.jalo.KycEmailProcess;
import com.commerceootb.core.jalo.KycProcess;
import com.commerceootb.core.jalo.MerchandiseComponent;
import com.commerceootb.core.jalo.OfferBannerComponent;
import com.commerceootb.core.jalo.ProductReview;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.europe1.jalo.PDTRow;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>CommerceootbCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCommerceootbCoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n MERCHANDISECOMPONENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MerchandiseComponent> PRODUCT2MERCHANDISERELMERCHANDISECOMPONENTHANDLER = new OneToManyHandler<MerchandiseComponent>(
	CommerceootbCoreConstants.TC.MERCHANDISECOMPONENT,
	true,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n KYCDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<KycDetails> CUSTOMER2KYCDETKYCDETAILSHANDLER = new OneToManyHandler<KycDetails>(
	CommerceootbCoreConstants.TC.KYCDETAILS,
	true,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("addressId", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("deliveryInstruction", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("bindingFormat", AttributeMode.INITIAL);
		tmp.put("marketingImprintName", AttributeMode.INITIAL);
		tmp.put("availableDate", AttributeMode.INITIAL);
		tmp.put("additionalResources", AttributeMode.INITIAL);
		tmp.put("nonEComCatSection", AttributeMode.INITIAL);
		tmp.put("isSearchable", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("kycList", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("offerPrice", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.europe1.jalo.PriceRow", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalResources</code> attribute.
	 * @return the additionalResources
	 */
	public CustomLink getAdditionalResources(final SessionContext ctx, final Product item)
	{
		return (CustomLink)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Product.ADDITIONALRESOURCES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalResources</code> attribute.
	 * @return the additionalResources
	 */
	public CustomLink getAdditionalResources(final Product item)
	{
		return getAdditionalResources( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalResources</code> attribute. 
	 * @param value the additionalResources
	 */
	public void setAdditionalResources(final SessionContext ctx, final Product item, final CustomLink value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Product.ADDITIONALRESOURCES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalResources</code> attribute. 
	 * @param value the additionalResources
	 */
	public void setAdditionalResources(final Product item, final CustomLink value)
	{
		setAdditionalResources( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.addressId</code> attribute.
	 * @return the addressId
	 */
	public String getAddressId(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Address.ADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.addressId</code> attribute.
	 * @return the addressId
	 */
	public String getAddressId(final Address item)
	{
		return getAddressId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.addressId</code> attribute. 
	 * @param value the addressId
	 */
	public void setAddressId(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Address.ADDRESSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.addressId</code> attribute. 
	 * @param value the addressId
	 */
	public void setAddressId(final Address item, final String value)
	{
		setAddressId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.availableDate</code> attribute.
	 * @return the availableDate
	 */
	public Date getAvailableDate(final SessionContext ctx, final Product item)
	{
		return (Date)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Product.AVAILABLEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.availableDate</code> attribute.
	 * @return the availableDate
	 */
	public Date getAvailableDate(final Product item)
	{
		return getAvailableDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.availableDate</code> attribute. 
	 * @param value the availableDate
	 */
	public void setAvailableDate(final SessionContext ctx, final Product item, final Date value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Product.AVAILABLEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.availableDate</code> attribute. 
	 * @param value the availableDate
	 */
	public void setAvailableDate(final Product item, final Date value)
	{
		setAvailableDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.bindingFormat</code> attribute.
	 * @return the bindingFormat
	 */
	public String getBindingFormat(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Product.BINDINGFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.bindingFormat</code> attribute.
	 * @return the bindingFormat
	 */
	public String getBindingFormat(final Product item)
	{
		return getBindingFormat( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.bindingFormat</code> attribute. 
	 * @param value the bindingFormat
	 */
	public void setBindingFormat(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Product.BINDINGFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.bindingFormat</code> attribute. 
	 * @param value the bindingFormat
	 */
	public void setBindingFormat(final Product item, final String value)
	{
		setBindingFormat( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Bpcl createBpcl(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.BPCL );
			return (Bpcl)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Bpcl : "+e.getMessage(), 0 );
		}
	}
	
	public Bpcl createBpcl(final Map attributeValues)
	{
		return createBpcl( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomLink createCustomLink(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.CUSTOMLINK );
			return (CustomLink)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomLink : "+e.getMessage(), 0 );
		}
	}
	
	public CustomLink createCustomLink(final Map attributeValues)
	{
		return createCustomLink( getSession().getSessionContext(), attributeValues );
	}
	
	public DeliveryInstruction createDeliveryInstruction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.DELIVERYINSTRUCTION );
			return (DeliveryInstruction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DeliveryInstruction : "+e.getMessage(), 0 );
		}
	}
	
	public DeliveryInstruction createDeliveryInstruction(final Map attributeValues)
	{
		return createDeliveryInstruction( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public KycDetails createKycDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.KYCDETAILS );
			return (KycDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating KycDetails : "+e.getMessage(), 0 );
		}
	}
	
	public KycDetails createKycDetails(final Map attributeValues)
	{
		return createKycDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public KycEmailProcess createKycEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.KYCEMAILPROCESS );
			return (KycEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating KycEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public KycEmailProcess createKycEmailProcess(final Map attributeValues)
	{
		return createKycEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public KycProcess createKycProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.KYCPROCESS );
			return (KycProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating KycProcess : "+e.getMessage(), 0 );
		}
	}
	
	public KycProcess createKycProcess(final Map attributeValues)
	{
		return createKycProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public MerchandiseComponent createMerchandiseComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.MERCHANDISECOMPONENT );
			return (MerchandiseComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MerchandiseComponent : "+e.getMessage(), 0 );
		}
	}
	
	public MerchandiseComponent createMerchandiseComponent(final Map attributeValues)
	{
		return createMerchandiseComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferBannerComponent createOfferBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.OFFERBANNERCOMPONENT );
			return (OfferBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OfferBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public OfferBannerComponent createOfferBannerComponent(final Map attributeValues)
	{
		return createOfferBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductReview createProductReview(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommerceootbCoreConstants.TC.PRODUCTREVIEW );
			return (ProductReview)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductReview : "+e.getMessage(), 0 );
		}
	}
	
	public ProductReview createProductReview(final Map attributeValues)
	{
		return createProductReview( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveryInstruction</code> attribute.
	 * @return the deliveryInstruction
	 */
	public DeliveryInstruction getDeliveryInstruction(final SessionContext ctx, final AbstractOrder item)
	{
		return (DeliveryInstruction)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.AbstractOrder.DELIVERYINSTRUCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.deliveryInstruction</code> attribute.
	 * @return the deliveryInstruction
	 */
	public DeliveryInstruction getDeliveryInstruction(final AbstractOrder item)
	{
		return getDeliveryInstruction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.deliveryInstruction</code> attribute. 
	 * @param value the deliveryInstruction
	 */
	public void setDeliveryInstruction(final SessionContext ctx, final AbstractOrder item, final DeliveryInstruction value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.AbstractOrder.DELIVERYINSTRUCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.deliveryInstruction</code> attribute. 
	 * @param value the deliveryInstruction
	 */
	public void setDeliveryInstruction(final AbstractOrder item, final DeliveryInstruction value)
	{
		setDeliveryInstruction( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return CommerceootbCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isSearchable</code> attribute.
	 * @return the isSearchable
	 */
	public Boolean isIsSearchable(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Product.ISSEARCHABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isSearchable</code> attribute.
	 * @return the isSearchable
	 */
	public Boolean isIsSearchable(final Product item)
	{
		return isIsSearchable( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isSearchable</code> attribute. 
	 * @return the isSearchable
	 */
	public boolean isIsSearchableAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIsSearchable( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isSearchable</code> attribute. 
	 * @return the isSearchable
	 */
	public boolean isIsSearchableAsPrimitive(final Product item)
	{
		return isIsSearchableAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isSearchable</code> attribute. 
	 * @param value the isSearchable
	 */
	public void setIsSearchable(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Product.ISSEARCHABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isSearchable</code> attribute. 
	 * @param value the isSearchable
	 */
	public void setIsSearchable(final Product item, final Boolean value)
	{
		setIsSearchable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isSearchable</code> attribute. 
	 * @param value the isSearchable
	 */
	public void setIsSearchable(final SessionContext ctx, final Product item, final boolean value)
	{
		setIsSearchable( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isSearchable</code> attribute. 
	 * @param value the isSearchable
	 */
	public void setIsSearchable(final Product item, final boolean value)
	{
		setIsSearchable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.kycDetails</code> attribute.
	 * @return the kycDetails
	 */
	public Collection<KycDetails> getKycDetails(final SessionContext ctx, final Customer item)
	{
		return CUSTOMER2KYCDETKYCDETAILSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.kycDetails</code> attribute.
	 * @return the kycDetails
	 */
	public Collection<KycDetails> getKycDetails(final Customer item)
	{
		return getKycDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.kycDetails</code> attribute. 
	 * @param value the kycDetails
	 */
	public void setKycDetails(final SessionContext ctx, final Customer item, final Collection<KycDetails> value)
	{
		CUSTOMER2KYCDETKYCDETAILSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.kycDetails</code> attribute. 
	 * @param value the kycDetails
	 */
	public void setKycDetails(final Customer item, final Collection<KycDetails> value)
	{
		setKycDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycDetails. 
	 * @param value the item to add to kycDetails
	 */
	public void addToKycDetails(final SessionContext ctx, final Customer item, final KycDetails value)
	{
		CUSTOMER2KYCDETKYCDETAILSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycDetails. 
	 * @param value the item to add to kycDetails
	 */
	public void addToKycDetails(final Customer item, final KycDetails value)
	{
		addToKycDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycDetails. 
	 * @param value the item to remove from kycDetails
	 */
	public void removeFromKycDetails(final SessionContext ctx, final Customer item, final KycDetails value)
	{
		CUSTOMER2KYCDETKYCDETAILSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycDetails. 
	 * @param value the item to remove from kycDetails
	 */
	public void removeFromKycDetails(final Customer item, final KycDetails value)
	{
		removeFromKycDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.kycList</code> attribute.
	 * @return the kycList
	 */
	public List<KycDetails> getKycList(final SessionContext ctx, final Customer item)
	{
		List<KycDetails> coll = (List<KycDetails>)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Customer.KYCLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.kycList</code> attribute.
	 * @return the kycList
	 */
	public List<KycDetails> getKycList(final Customer item)
	{
		return getKycList( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.kycList</code> attribute. 
	 * @param value the kycList
	 */
	public void setKycList(final SessionContext ctx, final Customer item, final List<KycDetails> value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Customer.KYCLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.kycList</code> attribute. 
	 * @param value the kycList
	 */
	public void setKycList(final Customer item, final List<KycDetails> value)
	{
		setKycList( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.marketingImprintName</code> attribute.
	 * @return the marketingImprintName
	 */
	public String getMarketingImprintName(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getMarketingImprintName requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, CommerceootbCoreConstants.Attributes.Product.MARKETINGIMPRINTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.marketingImprintName</code> attribute.
	 * @return the marketingImprintName
	 */
	public String getMarketingImprintName(final Product item)
	{
		return getMarketingImprintName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.marketingImprintName</code> attribute. 
	 * @return the localized marketingImprintName
	 */
	public Map<Language,String> getAllMarketingImprintName(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,CommerceootbCoreConstants.Attributes.Product.MARKETINGIMPRINTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.marketingImprintName</code> attribute. 
	 * @return the localized marketingImprintName
	 */
	public Map<Language,String> getAllMarketingImprintName(final Product item)
	{
		return getAllMarketingImprintName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.marketingImprintName</code> attribute. 
	 * @param value the marketingImprintName
	 */
	public void setMarketingImprintName(final SessionContext ctx, final Product item, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setMarketingImprintName requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, CommerceootbCoreConstants.Attributes.Product.MARKETINGIMPRINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.marketingImprintName</code> attribute. 
	 * @param value the marketingImprintName
	 */
	public void setMarketingImprintName(final Product item, final String value)
	{
		setMarketingImprintName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.marketingImprintName</code> attribute. 
	 * @param value the marketingImprintName
	 */
	public void setAllMarketingImprintName(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,CommerceootbCoreConstants.Attributes.Product.MARKETINGIMPRINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.marketingImprintName</code> attribute. 
	 * @param value the marketingImprintName
	 */
	public void setAllMarketingImprintName(final Product item, final Map<Language,String> value)
	{
		setAllMarketingImprintName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.merchandiseComponent</code> attribute.
	 * @return the merchandiseComponent
	 */
	public Collection<MerchandiseComponent> getMerchandiseComponent(final SessionContext ctx, final Product item)
	{
		return PRODUCT2MERCHANDISERELMERCHANDISECOMPONENTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.merchandiseComponent</code> attribute.
	 * @return the merchandiseComponent
	 */
	public Collection<MerchandiseComponent> getMerchandiseComponent(final Product item)
	{
		return getMerchandiseComponent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.merchandiseComponent</code> attribute. 
	 * @param value the merchandiseComponent
	 */
	public void setMerchandiseComponent(final SessionContext ctx, final Product item, final Collection<MerchandiseComponent> value)
	{
		PRODUCT2MERCHANDISERELMERCHANDISECOMPONENTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.merchandiseComponent</code> attribute. 
	 * @param value the merchandiseComponent
	 */
	public void setMerchandiseComponent(final Product item, final Collection<MerchandiseComponent> value)
	{
		setMerchandiseComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to merchandiseComponent. 
	 * @param value the item to add to merchandiseComponent
	 */
	public void addToMerchandiseComponent(final SessionContext ctx, final Product item, final MerchandiseComponent value)
	{
		PRODUCT2MERCHANDISERELMERCHANDISECOMPONENTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to merchandiseComponent. 
	 * @param value the item to add to merchandiseComponent
	 */
	public void addToMerchandiseComponent(final Product item, final MerchandiseComponent value)
	{
		addToMerchandiseComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from merchandiseComponent. 
	 * @param value the item to remove from merchandiseComponent
	 */
	public void removeFromMerchandiseComponent(final SessionContext ctx, final Product item, final MerchandiseComponent value)
	{
		PRODUCT2MERCHANDISERELMERCHANDISECOMPONENTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from merchandiseComponent. 
	 * @param value the item to remove from merchandiseComponent
	 */
	public void removeFromMerchandiseComponent(final Product item, final MerchandiseComponent value)
	{
		removeFromMerchandiseComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.nonEComCatSection</code> attribute.
	 * @return the nonEComCatSection
	 */
	public List<Category> getNonEComCatSection(final SessionContext ctx, final Product item)
	{
		List<Category> coll = (List<Category>)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.Product.NONECOMCATSECTION);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.nonEComCatSection</code> attribute.
	 * @return the nonEComCatSection
	 */
	public List<Category> getNonEComCatSection(final Product item)
	{
		return getNonEComCatSection( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.nonEComCatSection</code> attribute. 
	 * @param value the nonEComCatSection
	 */
	public void setNonEComCatSection(final SessionContext ctx, final Product item, final List<Category> value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.Product.NONECOMCATSECTION,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.nonEComCatSection</code> attribute. 
	 * @param value the nonEComCatSection
	 */
	public void setNonEComCatSection(final Product item, final List<Category> value)
	{
		setNonEComCatSection( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.offerPrice</code> attribute.
	 * @return the offerPrice
	 */
	public Double getOfferPrice(final SessionContext ctx, final PriceRow item)
	{
		return (Double)item.getProperty( ctx, CommerceootbCoreConstants.Attributes.PriceRow.OFFERPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.offerPrice</code> attribute.
	 * @return the offerPrice
	 */
	public Double getOfferPrice(final PriceRow item)
	{
		return getOfferPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.offerPrice</code> attribute. 
	 * @return the offerPrice
	 */
	public double getOfferPriceAsPrimitive(final SessionContext ctx, final PriceRow item)
	{
		Double value = getOfferPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.offerPrice</code> attribute. 
	 * @return the offerPrice
	 */
	public double getOfferPriceAsPrimitive(final PriceRow item)
	{
		return getOfferPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.offerPrice</code> attribute. 
	 * @param value the offerPrice
	 */
	public void setOfferPrice(final SessionContext ctx, final PriceRow item, final Double value)
	{
		item.setProperty(ctx, CommerceootbCoreConstants.Attributes.PriceRow.OFFERPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.offerPrice</code> attribute. 
	 * @param value the offerPrice
	 */
	public void setOfferPrice(final PriceRow item, final Double value)
	{
		setOfferPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.offerPrice</code> attribute. 
	 * @param value the offerPrice
	 */
	public void setOfferPrice(final SessionContext ctx, final PriceRow item, final double value)
	{
		setOfferPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.offerPrice</code> attribute. 
	 * @param value the offerPrice
	 */
	public void setOfferPrice(final PriceRow item, final double value)
	{
		setOfferPrice( getSession().getSessionContext(), item, value );
	}
	
}
