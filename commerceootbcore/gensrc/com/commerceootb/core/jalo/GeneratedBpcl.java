/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 4, 2025, 11:34:03 AM                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Bpcl}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBpcl extends GenericItem
{
	/** Qualifier of the <code>Bpcl.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Bpcl.customerName</code> attribute **/
	public static final String CUSTOMERNAME = "customerName";
	/** Qualifier of the <code>Bpcl.customerMobileNumber</code> attribute **/
	public static final String CUSTOMERMOBILENUMBER = "customerMobileNumber";
	/** Qualifier of the <code>Bpcl.customerNumber</code> attribute **/
	public static final String CUSTOMERNUMBER = "customerNumber";
	/** Qualifier of the <code>Bpcl.distributorCode</code> attribute **/
	public static final String DISTRIBUTORCODE = "distributorCode";
	/** Qualifier of the <code>Bpcl.operatorId</code> attribute **/
	public static final String OPERATORID = "operatorId";
	/** Qualifier of the <code>Bpcl.operatorName</code> attribute **/
	public static final String OPERATORNAME = "operatorName";
	/** Qualifier of the <code>Bpcl.operatorMobileNumber</code> attribute **/
	public static final String OPERATORMOBILENUMBER = "operatorMobileNumber";
	/** Qualifier of the <code>Bpcl.lpgId</code> attribute **/
	public static final String LPGID = "lpgId";
	/** Qualifier of the <code>Bpcl.otpRefId</code> attribute **/
	public static final String OTPREFID = "otpRefId";
	/** Qualifier of the <code>Bpcl.latitude</code> attribute **/
	public static final String LATITUDE = "latitude";
	/** Qualifier of the <code>Bpcl.longitude</code> attribute **/
	public static final String LONGITUDE = "longitude";
	/** Qualifier of the <code>Bpcl.safetyImageUrl</code> attribute **/
	public static final String SAFETYIMAGEURL = "safetyImageUrl";
	/** Qualifier of the <code>Bpcl.questionRes</code> attribute **/
	public static final String QUESTIONRES = "questionRes";
	/** Qualifier of the <code>Bpcl.surakshaDate</code> attribute **/
	public static final String SURAKSHADATE = "surakshaDate";
	/** Qualifier of the <code>Bpcl.sentToLpgNxt</code> attribute **/
	public static final String SENTTOLPGNXT = "sentToLpgNxt";
	/** Qualifier of the <code>Bpcl.safetyInspectionDate</code> attribute **/
	public static final String SAFETYINSPECTIONDATE = "safetyInspectionDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNAME, AttributeMode.INITIAL);
		tmp.put(CUSTOMERMOBILENUMBER, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNUMBER, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTORCODE, AttributeMode.INITIAL);
		tmp.put(OPERATORID, AttributeMode.INITIAL);
		tmp.put(OPERATORNAME, AttributeMode.INITIAL);
		tmp.put(OPERATORMOBILENUMBER, AttributeMode.INITIAL);
		tmp.put(LPGID, AttributeMode.INITIAL);
		tmp.put(OTPREFID, AttributeMode.INITIAL);
		tmp.put(LATITUDE, AttributeMode.INITIAL);
		tmp.put(LONGITUDE, AttributeMode.INITIAL);
		tmp.put(SAFETYIMAGEURL, AttributeMode.INITIAL);
		tmp.put(QUESTIONRES, AttributeMode.INITIAL);
		tmp.put(SURAKSHADATE, AttributeMode.INITIAL);
		tmp.put(SENTTOLPGNXT, AttributeMode.INITIAL);
		tmp.put(SAFETYINSPECTIONDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerMobileNumber</code> attribute.
	 * @return the customerMobileNumber
	 */
	public Long getCustomerMobileNumber(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CUSTOMERMOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerMobileNumber</code> attribute.
	 * @return the customerMobileNumber
	 */
	public Long getCustomerMobileNumber()
	{
		return getCustomerMobileNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerMobileNumber</code> attribute. 
	 * @return the customerMobileNumber
	 */
	public long getCustomerMobileNumberAsPrimitive(final SessionContext ctx)
	{
		Long value = getCustomerMobileNumber( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerMobileNumber</code> attribute. 
	 * @return the customerMobileNumber
	 */
	public long getCustomerMobileNumberAsPrimitive()
	{
		return getCustomerMobileNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerMobileNumber</code> attribute. 
	 * @param value the customerMobileNumber
	 */
	public void setCustomerMobileNumber(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CUSTOMERMOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerMobileNumber</code> attribute. 
	 * @param value the customerMobileNumber
	 */
	public void setCustomerMobileNumber(final Long value)
	{
		setCustomerMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerMobileNumber</code> attribute. 
	 * @param value the customerMobileNumber
	 */
	public void setCustomerMobileNumber(final SessionContext ctx, final long value)
	{
		setCustomerMobileNumber( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerMobileNumber</code> attribute. 
	 * @param value the customerMobileNumber
	 */
	public void setCustomerMobileNumber(final long value)
	{
		setCustomerMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName()
	{
		return getCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final String value)
	{
		setCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public Long getCustomerNumber(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CUSTOMERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerNumber</code> attribute.
	 * @return the customerNumber
	 */
	public Long getCustomerNumber()
	{
		return getCustomerNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerNumber</code> attribute. 
	 * @return the customerNumber
	 */
	public long getCustomerNumberAsPrimitive(final SessionContext ctx)
	{
		Long value = getCustomerNumber( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.customerNumber</code> attribute. 
	 * @return the customerNumber
	 */
	public long getCustomerNumberAsPrimitive()
	{
		return getCustomerNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CUSTOMERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final Long value)
	{
		setCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final SessionContext ctx, final long value)
	{
		setCustomerNumber( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.customerNumber</code> attribute. 
	 * @param value the customerNumber
	 */
	public void setCustomerNumber(final long value)
	{
		setCustomerNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.distributorCode</code> attribute.
	 * @return the distributorCode
	 */
	public Integer getDistributorCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISTRIBUTORCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.distributorCode</code> attribute.
	 * @return the distributorCode
	 */
	public Integer getDistributorCode()
	{
		return getDistributorCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.distributorCode</code> attribute. 
	 * @return the distributorCode
	 */
	public int getDistributorCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDistributorCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.distributorCode</code> attribute. 
	 * @return the distributorCode
	 */
	public int getDistributorCodeAsPrimitive()
	{
		return getDistributorCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.distributorCode</code> attribute. 
	 * @param value the distributorCode
	 */
	public void setDistributorCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISTRIBUTORCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.distributorCode</code> attribute. 
	 * @param value the distributorCode
	 */
	public void setDistributorCode(final Integer value)
	{
		setDistributorCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.distributorCode</code> attribute. 
	 * @param value the distributorCode
	 */
	public void setDistributorCode(final SessionContext ctx, final int value)
	{
		setDistributorCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.distributorCode</code> attribute. 
	 * @param value the distributorCode
	 */
	public void setDistributorCode(final int value)
	{
		setDistributorCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.id</code> attribute.
	 * @return the id
	 */
	public Long getId(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.id</code> attribute.
	 * @return the id
	 */
	public Long getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.id</code> attribute. 
	 * @return the id
	 */
	public long getIdAsPrimitive(final SessionContext ctx)
	{
		Long value = getId( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.id</code> attribute. 
	 * @return the id
	 */
	public long getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final long value)
	{
		setId( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final long value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.latitude</code> attribute.
	 * @return the latitude
	 */
	public String getLatitude(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LATITUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.latitude</code> attribute.
	 * @return the latitude
	 */
	public String getLatitude()
	{
		return getLatitude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.latitude</code> attribute. 
	 * @param value the latitude
	 */
	public void setLatitude(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LATITUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.latitude</code> attribute. 
	 * @param value the latitude
	 */
	public void setLatitude(final String value)
	{
		setLatitude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.longitude</code> attribute.
	 * @return the longitude
	 */
	public String getLongitude(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LONGITUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.longitude</code> attribute.
	 * @return the longitude
	 */
	public String getLongitude()
	{
		return getLongitude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.longitude</code> attribute. 
	 * @param value the longitude
	 */
	public void setLongitude(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LONGITUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.longitude</code> attribute. 
	 * @param value the longitude
	 */
	public void setLongitude(final String value)
	{
		setLongitude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.lpgId</code> attribute.
	 * @return the lpgId
	 */
	public Long getLpgId(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, LPGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.lpgId</code> attribute.
	 * @return the lpgId
	 */
	public Long getLpgId()
	{
		return getLpgId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.lpgId</code> attribute. 
	 * @return the lpgId
	 */
	public long getLpgIdAsPrimitive(final SessionContext ctx)
	{
		Long value = getLpgId( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.lpgId</code> attribute. 
	 * @return the lpgId
	 */
	public long getLpgIdAsPrimitive()
	{
		return getLpgIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.lpgId</code> attribute. 
	 * @param value the lpgId
	 */
	public void setLpgId(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, LPGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.lpgId</code> attribute. 
	 * @param value the lpgId
	 */
	public void setLpgId(final Long value)
	{
		setLpgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.lpgId</code> attribute. 
	 * @param value the lpgId
	 */
	public void setLpgId(final SessionContext ctx, final long value)
	{
		setLpgId( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.lpgId</code> attribute. 
	 * @param value the lpgId
	 */
	public void setLpgId(final long value)
	{
		setLpgId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorId</code> attribute.
	 * @return the operatorId
	 */
	public String getOperatorId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OPERATORID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorId</code> attribute.
	 * @return the operatorId
	 */
	public String getOperatorId()
	{
		return getOperatorId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorId</code> attribute. 
	 * @param value the operatorId
	 */
	public void setOperatorId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OPERATORID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorId</code> attribute. 
	 * @param value the operatorId
	 */
	public void setOperatorId(final String value)
	{
		setOperatorId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorMobileNumber</code> attribute.
	 * @return the operatorMobileNumber
	 */
	public Long getOperatorMobileNumber(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, OPERATORMOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorMobileNumber</code> attribute.
	 * @return the operatorMobileNumber
	 */
	public Long getOperatorMobileNumber()
	{
		return getOperatorMobileNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorMobileNumber</code> attribute. 
	 * @return the operatorMobileNumber
	 */
	public long getOperatorMobileNumberAsPrimitive(final SessionContext ctx)
	{
		Long value = getOperatorMobileNumber( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorMobileNumber</code> attribute. 
	 * @return the operatorMobileNumber
	 */
	public long getOperatorMobileNumberAsPrimitive()
	{
		return getOperatorMobileNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorMobileNumber</code> attribute. 
	 * @param value the operatorMobileNumber
	 */
	public void setOperatorMobileNumber(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, OPERATORMOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorMobileNumber</code> attribute. 
	 * @param value the operatorMobileNumber
	 */
	public void setOperatorMobileNumber(final Long value)
	{
		setOperatorMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorMobileNumber</code> attribute. 
	 * @param value the operatorMobileNumber
	 */
	public void setOperatorMobileNumber(final SessionContext ctx, final long value)
	{
		setOperatorMobileNumber( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorMobileNumber</code> attribute. 
	 * @param value the operatorMobileNumber
	 */
	public void setOperatorMobileNumber(final long value)
	{
		setOperatorMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorName</code> attribute.
	 * @return the operatorName
	 */
	public String getOperatorName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OPERATORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.operatorName</code> attribute.
	 * @return the operatorName
	 */
	public String getOperatorName()
	{
		return getOperatorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorName</code> attribute. 
	 * @param value the operatorName
	 */
	public void setOperatorName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OPERATORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.operatorName</code> attribute. 
	 * @param value the operatorName
	 */
	public void setOperatorName(final String value)
	{
		setOperatorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.otpRefId</code> attribute.
	 * @return the otpRefId
	 */
	public Integer getOtpRefId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, OTPREFID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.otpRefId</code> attribute.
	 * @return the otpRefId
	 */
	public Integer getOtpRefId()
	{
		return getOtpRefId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.otpRefId</code> attribute. 
	 * @return the otpRefId
	 */
	public int getOtpRefIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getOtpRefId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.otpRefId</code> attribute. 
	 * @return the otpRefId
	 */
	public int getOtpRefIdAsPrimitive()
	{
		return getOtpRefIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.otpRefId</code> attribute. 
	 * @param value the otpRefId
	 */
	public void setOtpRefId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, OTPREFID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.otpRefId</code> attribute. 
	 * @param value the otpRefId
	 */
	public void setOtpRefId(final Integer value)
	{
		setOtpRefId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.otpRefId</code> attribute. 
	 * @param value the otpRefId
	 */
	public void setOtpRefId(final SessionContext ctx, final int value)
	{
		setOtpRefId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.otpRefId</code> attribute. 
	 * @param value the otpRefId
	 */
	public void setOtpRefId(final int value)
	{
		setOtpRefId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.questionRes</code> attribute.
	 * @return the questionRes
	 */
	public String getQuestionRes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUESTIONRES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.questionRes</code> attribute.
	 * @return the questionRes
	 */
	public String getQuestionRes()
	{
		return getQuestionRes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.questionRes</code> attribute. 
	 * @param value the questionRes
	 */
	public void setQuestionRes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUESTIONRES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.questionRes</code> attribute. 
	 * @param value the questionRes
	 */
	public void setQuestionRes(final String value)
	{
		setQuestionRes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.safetyImageUrl</code> attribute.
	 * @return the safetyImageUrl
	 */
	public String getSafetyImageUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAFETYIMAGEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.safetyImageUrl</code> attribute.
	 * @return the safetyImageUrl
	 */
	public String getSafetyImageUrl()
	{
		return getSafetyImageUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.safetyImageUrl</code> attribute. 
	 * @param value the safetyImageUrl
	 */
	public void setSafetyImageUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAFETYIMAGEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.safetyImageUrl</code> attribute. 
	 * @param value the safetyImageUrl
	 */
	public void setSafetyImageUrl(final String value)
	{
		setSafetyImageUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.safetyInspectionDate</code> attribute.
	 * @return the safetyInspectionDate
	 */
	public Date getSafetyInspectionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAFETYINSPECTIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.safetyInspectionDate</code> attribute.
	 * @return the safetyInspectionDate
	 */
	public Date getSafetyInspectionDate()
	{
		return getSafetyInspectionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.safetyInspectionDate</code> attribute. 
	 * @param value the safetyInspectionDate
	 */
	public void setSafetyInspectionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAFETYINSPECTIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.safetyInspectionDate</code> attribute. 
	 * @param value the safetyInspectionDate
	 */
	public void setSafetyInspectionDate(final Date value)
	{
		setSafetyInspectionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.sentToLpgNxt</code> attribute.
	 * @return the sentToLpgNxt
	 */
	public Boolean isSentToLpgNxt(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENTTOLPGNXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.sentToLpgNxt</code> attribute.
	 * @return the sentToLpgNxt
	 */
	public Boolean isSentToLpgNxt()
	{
		return isSentToLpgNxt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.sentToLpgNxt</code> attribute. 
	 * @return the sentToLpgNxt
	 */
	public boolean isSentToLpgNxtAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSentToLpgNxt( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.sentToLpgNxt</code> attribute. 
	 * @return the sentToLpgNxt
	 */
	public boolean isSentToLpgNxtAsPrimitive()
	{
		return isSentToLpgNxtAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.sentToLpgNxt</code> attribute. 
	 * @param value the sentToLpgNxt
	 */
	public void setSentToLpgNxt(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENTTOLPGNXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.sentToLpgNxt</code> attribute. 
	 * @param value the sentToLpgNxt
	 */
	public void setSentToLpgNxt(final Boolean value)
	{
		setSentToLpgNxt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.sentToLpgNxt</code> attribute. 
	 * @param value the sentToLpgNxt
	 */
	public void setSentToLpgNxt(final SessionContext ctx, final boolean value)
	{
		setSentToLpgNxt( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.sentToLpgNxt</code> attribute. 
	 * @param value the sentToLpgNxt
	 */
	public void setSentToLpgNxt(final boolean value)
	{
		setSentToLpgNxt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.surakshaDate</code> attribute.
	 * @return the surakshaDate
	 */
	public String getSurakshaDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURAKSHADATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bpcl.surakshaDate</code> attribute.
	 * @return the surakshaDate
	 */
	public String getSurakshaDate()
	{
		return getSurakshaDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.surakshaDate</code> attribute. 
	 * @param value the surakshaDate
	 */
	public void setSurakshaDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURAKSHADATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bpcl.surakshaDate</code> attribute. 
	 * @param value the surakshaDate
	 */
	public void setSurakshaDate(final String value)
	{
		setSurakshaDate( getSession().getSessionContext(), value );
	}
	
}
