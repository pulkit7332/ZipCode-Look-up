package com.pulkit.zipcodelookup.ZipCodeLookupBusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.monitorjbl.json.JsonResult;
import com.monitorjbl.json.JsonView;
import com.monitorjbl.json.Match;
import com.pulkit.zipcodelookup.ZipCodeLookupData.ZipCode;
import com.pulkit.zipcodelookup.ZipCodeLookupData.repository.ZipCodeRepository;

@Service
public class ZipCodeService {
	@Autowired
	private ZipCodeRepository zipCodeRepository;
	private JsonResult json = JsonResult.instance();
	public static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ZipCodeService.class);

	public DataTablesOutput<ZipCode> list(DataTablesInput input) {
		LOGGER.info("list method of ZipCodeService ");
		return zipCodeRepository.findAll(input);
		

	}

}
