package com.luxoft.exam.controller;


import java.util.ArrayList;
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
import com.luxoft.exam.model.GoogleBookAPI;
import com.luxoft.exam.service.BooksSearchService;
import com.luxoft.exam.service.IntegrationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Engine Search from Google and iTunes")
@RestController
@RequestMapping("/enginesearch")
public class SearchController {
	
	
	@Autowired
	private BooksSearchService bookService;
	
	@Autowired
	private IntegrationService intService;
	
	
	private final Logger log = LoggerFactory.getLogger(SearchController.class);

	
	@ApiOperation(value="Search books and albums")
	@GetMapping(value="/{term}", produces="application/json")
	public @ResponseBody Iterable<ResponseItem> search(@PathVariable("term") String term) {
		
		try {
		
			GoogleBookAPI apiResponse = bookService.findBooks(term);
			
			if (!apiResponse.getItems().isEmpty()) {
				
				log.info("SearchController:search() - Items found: " + apiResponse.getItems().size());
				List<ResponseItem> response = intService.parserResponse(apiResponse);
				response.sort(ResponseItem::sortByTitle);
				
				return response;

			} else {
				
				log.info("SearchController:search() - No item found!");
				return new ArrayList<ResponseItem>();
			}

		} catch (Exception e) {
			
			log.error("SearchController:search() - Error: " + e.getMessage());
			return null;
		}
	}

}
