package com.pulkit.zipcodelookup.ui.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pulkit.zipcodelookup.ZipCodeLookupBusiness.service.ZipCodeService;
import com.pulkit.zipcodelookup.ZipCodeLookupData.ZipCode;

@Controller
public class ZipCodeController {
	public static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ZipCodeController.class);

	@Autowired
	private ZipCodeService zipCodeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String zipCodeHome() {
		LOGGER.info("zipCodeHome method of ZipCode Controller");
		return "index";
	}

	@GetMapping(value = "/list/data")
	public @ResponseBody DataTablesOutput<ZipCode> zipCodeList(@Valid DataTablesInput input) {
		LOGGER.info("zipCodeList method of ZipCode Controller " );
		return zipCodeService.list(input);

	}
}