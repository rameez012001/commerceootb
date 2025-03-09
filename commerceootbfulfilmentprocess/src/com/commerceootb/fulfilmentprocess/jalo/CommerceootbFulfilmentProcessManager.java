/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.commerceootb.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.commerceootb.fulfilmentprocess.constants.CommerceootbFulfilmentProcessConstants;

public class CommerceootbFulfilmentProcessManager extends GeneratedCommerceootbFulfilmentProcessManager
{
	public static final CommerceootbFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommerceootbFulfilmentProcessManager) em.getExtension(CommerceootbFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
