package com.luxoft.exam.service.impl;

import static java.util.Objects.nonNull;

import com.luxoft.exam.model.GoogleBookAPI;
import com.luxoft.exam.service.BooksSearchService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class BooksSearchServiceImpl implements BooksSearchService {
	
	@Value(value = "${search.books.service}")
	private String endpointURI;
	
	private final Logger log = LoggerFactory.getLogger(BooksSearchServiceImpl.class);
	
	
	@Override
	public GoogleBookAPI findBooks(String term) throws Exception {
		
		RestTemplate restTemplate = new RestTemplate();

        try {
        	
        	GoogleBookAPI response = restTemplate.getForObject(endpointURI, GoogleBookAPI.class, term);

            if (nonNull(response)) {
                log.info("GoogleBookAPI:findBooks() - Successful called!");
                return response;
            } else {
            	log.info("GoogleBookAPI:findBooks() - Null: The endpoint doesn't respond anything.");
                return new GoogleBookAPI();
            }

        } catch (RestClientException rc) {
            log.error("Error connecting to Google Books endpoint: " + rc.getMessage());
            throw new Exception("Error when to call Google Books API. Details: " + rc);
        }
	}
}
