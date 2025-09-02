/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21-Aug-2025, 7:51:33 pm                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.promotionengineservices.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.delivery.DeliveryMode;
import de.hybris.platform.promotionengineservices.jalo.AbstractRuleBasedPromotionAction;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type RuleBasedPercentageDiscountOnDeliveryModeAction.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class RuleBasedPercentageDiscountOnDeliveryModeAction extends AbstractRuleBasedPromotionAction
{
	/** Qualifier of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryMode</code> attribute **/
	public static final String DELIVERYMODE = "deliveryMode";
	/** Qualifier of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryCost</code> attribute **/
	public static final String DELIVERYCOST = "deliveryCost";
	/** Qualifier of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryMode</code> attribute **/
	public static final String REPLACEDDELIVERYMODE = "replacedDeliveryMode";
	/** Qualifier of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryCost</code> attribute **/
	public static final String REPLACEDDELIVERYCOST = "replacedDeliveryCost";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRuleBasedPromotionAction.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DELIVERYMODE, AttributeMode.INITIAL);
		tmp.put(DELIVERYCOST, AttributeMode.INITIAL);
		tmp.put(REPLACEDDELIVERYMODE, AttributeMode.INITIAL);
		tmp.put(REPLACEDDELIVERYCOST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryCost</code> attribute.
	 * @return the deliveryCost - The delivery cost to apply to the order
	 */
	public BigDecimal getDeliveryCost(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, "deliveryCost".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryCost</code> attribute.
	 * @return the deliveryCost - The delivery cost to apply to the order
	 */
	public BigDecimal getDeliveryCost()
	{
		return getDeliveryCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryCost</code> attribute. 
	 * @param value the deliveryCost - The delivery cost to apply to the order
	 */
	public void setDeliveryCost(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, "deliveryCost".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryCost</code> attribute. 
	 * @param value the deliveryCost - The delivery cost to apply to the order
	 */
	public void setDeliveryCost(final BigDecimal value)
	{
		setDeliveryCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryMode</code> attribute.
	 * @return the deliveryMode - The delivery mode to apply to the order
	 */
	public DeliveryMode getDeliveryMode(final SessionContext ctx)
	{
		return (DeliveryMode)getProperty( ctx, "deliveryMode".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryMode</code> attribute.
	 * @return the deliveryMode - The delivery mode to apply to the order
	 */
	public DeliveryMode getDeliveryMode()
	{
		return getDeliveryMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryMode</code> attribute. 
	 * @param value the deliveryMode - The delivery mode to apply to the order
	 */
	public void setDeliveryMode(final SessionContext ctx, final DeliveryMode value)
	{
		setProperty(ctx, "deliveryMode".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.deliveryMode</code> attribute. 
	 * @param value the deliveryMode - The delivery mode to apply to the order
	 */
	public void setDeliveryMode(final DeliveryMode value)
	{
		setDeliveryMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryCost</code> attribute.
	 * @return the replacedDeliveryCost - The delivery cost that was set to order before a promotion was applied
	 */
	public BigDecimal getReplacedDeliveryCost(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, "replacedDeliveryCost".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryCost</code> attribute.
	 * @return the replacedDeliveryCost - The delivery cost that was set to order before a promotion was applied
	 */
	public BigDecimal getReplacedDeliveryCost()
	{
		return getReplacedDeliveryCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryCost</code> attribute. 
	 * @param value the replacedDeliveryCost - The delivery cost that was set to order before a promotion was applied
	 */
	public void setReplacedDeliveryCost(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, "replacedDeliveryCost".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryCost</code> attribute. 
	 * @param value the replacedDeliveryCost - The delivery cost that was set to order before a promotion was applied
	 */
	public void setReplacedDeliveryCost(final BigDecimal value)
	{
		setReplacedDeliveryCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryMode</code> attribute.
	 * @return the replacedDeliveryMode - The delivery mode that was set to order before a promotion was applied
	 */
	public DeliveryMode getReplacedDeliveryMode(final SessionContext ctx)
	{
		return (DeliveryMode)getProperty( ctx, "replacedDeliveryMode".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryMode</code> attribute.
	 * @return the replacedDeliveryMode - The delivery mode that was set to order before a promotion was applied
	 */
	public DeliveryMode getReplacedDeliveryMode()
	{
		return getReplacedDeliveryMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryMode</code> attribute. 
	 * @param value the replacedDeliveryMode - The delivery mode that was set to order before a promotion was applied
	 */
	public void setReplacedDeliveryMode(final SessionContext ctx, final DeliveryMode value)
	{
		setProperty(ctx, "replacedDeliveryMode".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleBasedPercentageDiscountOnDeliveryModeAction.replacedDeliveryMode</code> attribute. 
	 * @param value the replacedDeliveryMode - The delivery mode that was set to order before a promotion was applied
	 */
	public void setReplacedDeliveryMode(final DeliveryMode value)
	{
		setReplacedDeliveryMode( getSession().getSessionContext(), value );
	}
	
}
