/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 14, 2025, 4:53:38 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ProductReview}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductReview extends GenericItem
{
	/** Qualifier of the <code>ProductReview.reviewId</code> attribute **/
	public static final String REVIEWID = "reviewId";
	/** Qualifier of the <code>ProductReview.reviewText</code> attribute **/
	public static final String REVIEWTEXT = "reviewText";
	/** Qualifier of the <code>ProductReview.rating</code> attribute **/
	public static final String RATING = "rating";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REVIEWID, AttributeMode.INITIAL);
		tmp.put(REVIEWTEXT, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.rating</code> attribute.
	 * @return the rating
	 */
	public Integer getRating(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.rating</code> attribute.
	 * @return the rating
	 */
	public Integer getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.rating</code> attribute. 
	 * @return the rating
	 */
	public int getRatingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRating( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.rating</code> attribute. 
	 * @return the rating
	 */
	public int getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final Integer value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final int value)
	{
		setRating( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final int value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.reviewId</code> attribute.
	 * @return the reviewId
	 */
	public String getReviewId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REVIEWID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.reviewId</code> attribute.
	 * @return the reviewId
	 */
	public String getReviewId()
	{
		return getReviewId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.reviewId</code> attribute. 
	 * @param value the reviewId
	 */
	public void setReviewId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REVIEWID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.reviewId</code> attribute. 
	 * @param value the reviewId
	 */
	public void setReviewId(final String value)
	{
		setReviewId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.reviewText</code> attribute.
	 * @return the reviewText
	 */
	public String getReviewText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REVIEWTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductReview.reviewText</code> attribute.
	 * @return the reviewText
	 */
	public String getReviewText()
	{
		return getReviewText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.reviewText</code> attribute. 
	 * @param value the reviewText
	 */
	public void setReviewText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REVIEWTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductReview.reviewText</code> attribute. 
	 * @param value the reviewText
	 */
	public void setReviewText(final String value)
	{
		setReviewText( getSession().getSessionContext(), value );
	}
	
}
