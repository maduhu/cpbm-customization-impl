/*
*  Copyright © 2013 Citrix Systems, Inc.
*  You may not use, copy, or modify this file except pursuant to a valid license agreement from
*  Citrix Systems, Inc.
*/ 
package com.citrix.cpbm.portal.fragment.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping({
    "/billing", "/usage"
})
@SessionAttributes({
  "depositRecordForm"
})
public class BillingController extends AbstractBillingController {

  Logger logger = Logger.getLogger(com.citrix.cpbm.portal.fragment.controllers.BillingController.class);

}
