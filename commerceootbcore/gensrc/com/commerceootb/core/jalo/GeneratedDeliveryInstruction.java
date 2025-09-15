/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-Sep-2025, 12:25:18 pm                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DeliveryInstruction}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDeliveryInstruction extends GenericItem
{
	/** Qualifier of the <code>DeliveryInstruction.instruction</code> attribute **/
	public static final String INSTRUCTION = "instruction";
	/** Qualifier of the <code>DeliveryInstruction.deliveryPeriod</code> attribute **/
	public static final String DELIVERYPERIOD = "deliveryPeriod";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INSTRUCTION, AttributeMode.INITIAL);
		tmp.put(DELIVERYPERIOD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryInstruction.deliveryPeriod</code> attribute.
	 * @return the deliveryPeriod
	 */
	public EnumerationValue getDeliveryPeriod(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DELIVERYPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryInstruction.deliveryPeriod</code> attribute.
	 * @return the deliveryPeriod
	 */
	public EnumerationValue getDeliveryPeriod()
	{
		return getDeliveryPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryInstruction.deliveryPeriod</code> attribute. 
	 * @param value the deliveryPeriod
	 */
	public void setDeliveryPeriod(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DELIVERYPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryInstruction.deliveryPeriod</code> attribute. 
	 * @param value the deliveryPeriod
	 */
	public void setDeliveryPeriod(final EnumerationValue value)
	{
		setDeliveryPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryInstruction.instruction</code> attribute.
	 * @return the instruction
	 */
	public String getInstruction(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INSTRUCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeliveryInstruction.instruction</code> attribute.
	 * @return the instruction
	 */
	public String getInstruction()
	{
		return getInstruction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryInstruction.instruction</code> attribute. 
	 * @param value the instruction
	 */
	public void setInstruction(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INSTRUCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeliveryInstruction.instruction</code> attribute. 
	 * @param value the instruction
	 */
	public void setInstruction(final String value)
	{
		setInstruction( getSession().getSessionContext(), value );
	}
	
}
