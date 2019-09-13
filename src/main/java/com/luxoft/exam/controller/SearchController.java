package com.luxoft.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.luxoft.exam.service.BooksSearchService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Engine Search from Google and iTunes")
@RestController
@RequestMapping("/enginesearch")
public class SearchController {
	
	
	@Autowired
	private BooksSearchService bookService;
	
	
	
	@ApiOperation(value="Search books and albums")
	@GetMapping(value="/{term}", produces="application/json")
	public @ResponseBody Iterable<ResponseItems> search(@PathVariable("term") String term) {
		
		
		return null;
	}

}
