/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 3, 2025, 3:24:21 PM                     ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DeliveryPeriod}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDeliveryPeriod extends GenericItem
{
	/** Qualifier of the <code>DeliveryPeriod.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>DeliveryPeriod.orderType</code> attribute **/
	public static final String ORDERTYPE = "orderType";
	/** Qualifier of the <code>DeliveryPeriod.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>DeliveryPeriod.startTime</code> attribute **/
	public static final String STARTTIME = "startTime";
	/** Qualifier of the <code>DeliveryPeriod.endTime</code> attribute **/
	public static final String ENDTIME = "endTime";
	/** Qualifier of the <code>DeliveryPeriod.sort</code> attribute **/
	public static final String SORT = "sort";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(ORDERTYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(STARTTIME, AttributeMode.INITIAL);
		tmp.put(ENDTIME, AttributeMode.INITIAL);
		tmp.put(SORT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.endTime</code> attribute.
	 * @return the endTime
	 */
	public Date getEndTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.endTime</code> attribute.
	 * @return the endTime
	 */
	public Date getEndTime()
	{
		return getEndTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.endTime</code> attribute. 
	 * @param value the endTime
	 */
	public void setEndTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.endTime</code> attribute. 
	 * @param value the endTime
	 */
	public void setEndTime(final Date value)
	{
		setEndTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.orderType</code> attribute.
	 * @return the orderType
	 */
	public String getOrderType()
	{
		return getOrderType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ORDERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.orderType</code> attribute. 
	 * @param value the orderType
	 */
	public void setOrderType(final String value)
	{
		setOrderType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.sort</code> attribute.
	 * @return the sort
	 */
	public Integer getSort(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.sort</code> attribute.
	 * @return the sort
	 */
	public Integer getSort()
	{
		return getSort( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.sort</code> attribute. 
	 * @return the sort
	 */
	public int getSortAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSort( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.sort</code> attribute. 
	 * @return the sort
	 */
	public int getSortAsPrimitive()
	{
		return getSortAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.sort</code> attribute. 
	 * @param value the sort
	 */
	public void setSort(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.sort</code> attribute. 
	 * @param value the sort
	 */
	public void setSort(final Integer value)
	{
		setSort( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.sort</code> attribute. 
	 * @param value the sort
	 */
	public void setSort(final SessionContext ctx, final int value)
	{
		setSort( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.sort</code> attribute. 
	 * @param value the sort
	 */
	public void setSort(final int value)
	{
		setSort( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.startTime</code> attribute.
	 * @return the startTime
	 */
	public Date getStartTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryPeriod.startTime</code> attribute.
	 * @return the startTime
	 */
	public Date getStartTime()
	{
		return getStartTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.startTime</code> attribute. 
	 * @param value the startTime
	 */
	public void setStartTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryPeriod.startTime</code> attribute. 
	 * @param value the startTime
	 */
	public void setStartTime(final Date value)
	{
		setStartTime( getSession().getSessionContext(), value );
	}
	
}
