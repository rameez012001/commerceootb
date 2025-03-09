/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.commerceootbocc.controllers;

import com.commerceootb.facades.facadeService.BpclFacade;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/{bpcl}")
public class CommerceootboccController
{
	@Resource(name = "bpclFacade")
	private BpclFacade bpclFacade;
	private static final Logger LOG = Logger.getLogger(CommerceootboccController.class);
	
}
