/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.commerceootbpromotionengine.setup;

import static com.commerceootbpromotionengine.constants.CommerceootbpromotionengineConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.commerceootbpromotionengine.constants.CommerceootbpromotionengineConstants;
import com.commerceootbpromotionengine.service.CommerceootbpromotionengineService;


@SystemSetup(extension = CommerceootbpromotionengineConstants.EXTENSIONNAME)
public class CommerceootbpromotionengineSystemSetup
{
	private final CommerceootbpromotionengineService commerceootbpromotionengineService;

	public CommerceootbpromotionengineSystemSetup(final CommerceootbpromotionengineService commerceootbpromotionengineService)
	{
		this.commerceootbpromotionengineService = commerceootbpromotionengineService;
	}

	@SystemSetup(process = SystemSetup.Process.ALL, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		commerceootbpromotionengineService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CommerceootbpromotionengineSystemSetup.class.getResourceAsStream("/commerceootbpromotionengine/sap-hybris-platform.png");
	}
}
