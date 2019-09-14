package com.luxoft.exam.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.luxoft.exam.dto.ResponseItem;
import com.luxoft.exam.service.IntegrationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Engine Search from Google and iTunes")
@RestController
@RequestMapping("/enginesearch")
public class SearchController {
	

	@Autowired
	private IntegrationService intService;
	
	private final Logger log = LoggerFactory.getLogger(SearchController.class);


	@ApiOperation(value="Search books and albums")
	@GetMapping(value="/{term}", produces="application/json")
	public @ResponseBody Iterable<ResponseItem> search(@PathVariable("term") String term) {
		
		log.info("SearchController:search() - Begining of request processing!");
		List<ResponseItem> response = intService.processRequest(term);
		log.info("SearchController:search() - The processing of request was finished!");
		return response;
	}

}
