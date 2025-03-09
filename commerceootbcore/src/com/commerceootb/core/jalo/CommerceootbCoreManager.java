/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.commerceootb.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.commerceootb.core.constants.CommerceootbCoreConstants;
import com.commerceootb.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class CommerceootbCoreManager extends GeneratedCommerceootbCoreManager
{
	public static final CommerceootbCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommerceootbCoreManager) em.getExtension(CommerceootbCoreConstants.EXTENSIONNAME);
	}
}
