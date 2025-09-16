/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16-Sep-2025, 10:28:37 am                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import com.commerceootb.core.jalo.KycDetails;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess KycProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedKycProcess extends BusinessProcess
{
	/** Qualifier of the <code>KycProcess.kycDetails</code> attribute **/
	public static final String KYCDETAILS = "kycDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n KYCDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedKycProcess> KYCDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedKycProcess>(
	CommerceootbCoreConstants.TC.KYCPROCESS,
	false,
	"kycDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(KYCDETAILS, AttributeMode.INITIAL);
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
		KYCDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycProcess.kycDetails</code> attribute.
	 * @return the kycDetails
	 */
	public KycDetails getKycDetails(final SessionContext ctx)
	{
		return (KycDetails)getProperty( ctx, KYCDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycProcess.kycDetails</code> attribute.
	 * @return the kycDetails
	 */
	public KycDetails getKycDetails()
	{
		return getKycDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycProcess.kycDetails</code> attribute. 
	 * @param value the kycDetails
	 */
	public void setKycDetails(final SessionContext ctx, final KycDetails value)
	{
		KYCDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycProcess.kycDetails</code> attribute. 
	 * @param value the kycDetails
	 */
	public void setKycDetails(final KycDetails value)
	{
		setKycDetails( getSession().getSessionContext(), value );
	}
	
}
