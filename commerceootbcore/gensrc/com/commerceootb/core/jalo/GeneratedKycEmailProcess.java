/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16-Sep-2025, 10:28:37 am                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import com.commerceootb.core.jalo.KycDetails;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess KycEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedKycEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>KycEmailProcess.kycDetail</code> attribute **/
	public static final String KYCDETAIL = "kycDetail";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(KYCDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycEmailProcess.kycDetail</code> attribute.
	 * @return the kycDetail
	 */
	public KycDetails getKycDetail(final SessionContext ctx)
	{
		return (KycDetails)getProperty( ctx, KYCDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycEmailProcess.kycDetail</code> attribute.
	 * @return the kycDetail
	 */
	public KycDetails getKycDetail()
	{
		return getKycDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycEmailProcess.kycDetail</code> attribute. 
	 * @param value the kycDetail
	 */
	public void setKycDetail(final SessionContext ctx, final KycDetails value)
	{
		setProperty(ctx, KYCDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycEmailProcess.kycDetail</code> attribute. 
	 * @param value the kycDetail
	 */
	public void setKycDetail(final KycDetails value)
	{
		setKycDetail( getSession().getSessionContext(), value );
	}
	
}
