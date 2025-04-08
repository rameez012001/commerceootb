/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.commerceootbpromotionengine.controller;

import static com.commerceootbpromotionengine.constants.CommerceootbpromotionengineConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commerceootbpromotionengine.service.CommerceootbpromotionengineService;


@Controller
public class CommerceootbpromotionengineHelloController
{
	@Autowired
	private CommerceootbpromotionengineService commerceootbpromotionengineService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", commerceootbpromotionengineService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
