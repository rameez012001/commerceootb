/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 10, 2025, 10:22:24 AM                   ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import com.commerceootb.core.jalo.KycProcess;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem KycDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedKycDetails extends GenericItem
{
	/** Qualifier of the <code>KycDetails.documentId</code> attribute **/
	public static final String DOCUMENTID = "documentId";
	/** Qualifier of the <code>KycDetails.kycType</code> attribute **/
	public static final String KYCTYPE = "kycType";
	/** Qualifier of the <code>KycDetails.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>KycDetails.dob</code> attribute **/
	public static final String DOB = "dob";
	/** Qualifier of the <code>KycDetails.postalCode</code> attribute **/
	public static final String POSTALCODE = "postalCode";
	/** Qualifier of the <code>KycDetails.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	/** Qualifier of the <code>KycDetails.expiryDate</code> attribute **/
	public static final String EXPIRYDATE = "expiryDate";
	/** Qualifier of the <code>KycDetails.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>KycDetails.kycStatus</code> attribute **/
	public static final String KYCSTATUS = "kycStatus";
	/** Qualifier of the <code>KycDetails.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>KycDetails.kycProcess</code> attribute **/
	public static final String KYCPROCESS = "kycProcess";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CUSTOMER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedKycDetails> CUSTOMERHANDLER = new BidirectionalOneToManyHandler<GeneratedKycDetails>(
	CommerceootbCoreConstants.TC.KYCDETAILS,
	false,
	"customer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n KYCPROCESS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<KycProcess> KYCPROCESSHANDLER = new OneToManyHandler<KycProcess>(
	CommerceootbCoreConstants.TC.KYCPROCESS,
	true,
	"kycDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DOCUMENTID, AttributeMode.INITIAL);
		tmp.put(KYCTYPE, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(DOB, AttributeMode.INITIAL);
		tmp.put(POSTALCODE, AttributeMode.INITIAL);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		tmp.put(EXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(KYCSTATUS, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CUSTOMERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		CUSTOMERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.dob</code> attribute.
	 * @return the dob
	 */
	public Date getDob(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.dob</code> attribute.
	 * @return the dob
	 */
	public Date getDob()
	{
		return getDob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.dob</code> attribute. 
	 * @param value the dob
	 */
	public void setDob(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.dob</code> attribute. 
	 * @param value the dob
	 */
	public void setDob(final Date value)
	{
		setDob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.documentId</code> attribute.
	 * @return the documentId
	 */
	public String getDocumentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.documentId</code> attribute.
	 * @return the documentId
	 */
	public String getDocumentId()
	{
		return getDocumentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.documentId</code> attribute. 
	 * @param value the documentId
	 */
	public void setDocumentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.documentId</code> attribute. 
	 * @param value the documentId
	 */
	public void setDocumentId(final String value)
	{
		setDocumentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public String getDocumentType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public String getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final String value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate()
	{
		return getExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final Date value)
	{
		setExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.kycProcess</code> attribute.
	 * @return the kycProcess
	 */
	public Collection<KycProcess> getKycProcess(final SessionContext ctx)
	{
		return KYCPROCESSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.kycProcess</code> attribute.
	 * @return the kycProcess
	 */
	public Collection<KycProcess> getKycProcess()
	{
		return getKycProcess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.kycProcess</code> attribute. 
	 * @param value the kycProcess
	 */
	public void setKycProcess(final SessionContext ctx, final Collection<KycProcess> value)
	{
		KYCPROCESSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.kycProcess</code> attribute. 
	 * @param value the kycProcess
	 */
	public void setKycProcess(final Collection<KycProcess> value)
	{
		setKycProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycProcess. 
	 * @param value the item to add to kycProcess
	 */
	public void addToKycProcess(final SessionContext ctx, final KycProcess value)
	{
		KYCPROCESSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycProcess. 
	 * @param value the item to add to kycProcess
	 */
	public void addToKycProcess(final KycProcess value)
	{
		addToKycProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycProcess. 
	 * @param value the item to remove from kycProcess
	 */
	public void removeFromKycProcess(final SessionContext ctx, final KycProcess value)
	{
		KYCPROCESSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycProcess. 
	 * @param value the item to remove from kycProcess
	 */
	public void removeFromKycProcess(final KycProcess value)
	{
		removeFromKycProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.kycStatus</code> attribute.
	 * @return the kycStatus
	 */
	public EnumerationValue getKycStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, KYCSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.kycStatus</code> attribute.
	 * @return the kycStatus
	 */
	public EnumerationValue getKycStatus()
	{
		return getKycStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.kycStatus</code> attribute. 
	 * @param value the kycStatus
	 */
	public void setKycStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, KYCSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.kycStatus</code> attribute. 
	 * @param value the kycStatus
	 */
	public void setKycStatus(final EnumerationValue value)
	{
		setKycStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.kycType</code> attribute.
	 * @return the kycType
	 */
	public String getKycType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KYCTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.kycType</code> attribute.
	 * @return the kycType
	 */
	public String getKycType()
	{
		return getKycType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.kycType</code> attribute. 
	 * @param value the kycType
	 */
	public void setKycType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KYCTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.kycType</code> attribute. 
	 * @param value the kycType
	 */
	public void setKycType(final String value)
	{
		setKycType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycDetails.postalCode</code> attribute.
	 * @return the postalCode
	 */
	public String getPostalCode()
	{
		return getPostalCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSTALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycDetails.postalCode</code> attribute. 
	 * @param value the postalCode
	 */
	public void setPostalCode(final String value)
	{
		setPostalCode( getSession().getSessionContext(), value );
	}
	
}
