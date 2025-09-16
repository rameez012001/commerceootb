/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16-Sep-2025, 10:28:37 am                    ---
 * ----------------------------------------------------------------
 */
package com.commerceootb.core.jalo;

import com.commerceootb.core.constants.CommerceootbCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CustomLink}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomLink extends GenericItem
{
	/** Qualifier of the <code>CustomLink.linkId</code> attribute **/
	public static final String LINKID = "linkId";
	/** Qualifier of the <code>CustomLink.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>CustomLink.url</code> attribute **/
	public static final String URL = "url";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LINKID, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomLink.linkId</code> attribute.
	 * @return the linkId
	 */
	public String getLinkId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINKID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomLink.linkId</code> attribute.
	 * @return the linkId
	 */
	public String getLinkId()
	{
		return getLinkId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomLink.linkId</code> attribute. 
	 * @param value the linkId
	 */
	public void setLinkId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINKID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomLink.linkId</code> attribute. 
	 * @param value the linkId
	 */
	public void setLinkId(final String value)
	{
		setLinkId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomLink.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomLink.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomLink.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomLink.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomLink.url</code> attribute.
	 * @return the url
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomLink.url</code> attribute.
	 * @return the url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomLink.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomLink.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
}
