package com.luxoft.exam.service.impl;

import static java.util.Objects.nonNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.luxoft.exam.model.AppleAlbumsAPI;
import com.luxoft.exam.model.GoogleBookAPI;
import com.luxoft.exam.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Value(value = "${search.books.endpoint}")
	private String googleEndpointURI;
	
	
	@Value(value = "${search.albums.endpoint}")
	private String iTunesEndpointURI;
	
	
	@Value(value = "${search.limit.result}")
	private int limitOfResults;
	

	private final Logger log = LoggerFactory.getLogger(SearchServiceImpl.class);
	
	
	@Override
	public GoogleBookAPI findBooks(String term) throws Exception {
		
		RestTemplate restTemplate = new RestTemplate();

        try {
        	
        	GoogleBookAPI response = restTemplate.getForObject(googleEndpointURI, GoogleBookAPI.class, term, limitOfResults);

            if (nonNull(response)) {
                log.info("SearchServiceImpl:findBooks() - Google Books API Successful called!");
                return response;
            } else {
            	log.info("SearchServiceImpl:findBooks() - Null: The endpoint doesn't respond anything.");
                return new GoogleBookAPI();
            }

        } catch (RestClientException rc) {
            log.error("Error connecting to Google Books endpoint: " + rc.getMessage());
            throw new Exception("Error when to call Google Books API. Details: " + rc);
        }
	}


	@Override
	public AppleAlbumsAPI findAlbums(String term) throws Exception {

		RestTemplate restTemplate = createRestTemplate();
		
        try {
        	
        	AppleAlbumsAPI response = restTemplate.getForObject(iTunesEndpointURI, AppleAlbumsAPI.class, term, limitOfResults);

            if (nonNull(response)) {
                log.info("SearchServiceImpl:findAlbums() - iTunes API Successful called!");
                return response;
            } else {
            	log.info("SearchServiceImpl:findAlbums() - Null: The endpoint doesn't respond anything.");
                return new AppleAlbumsAPI();
            }

        } catch (RestClientException rc) {
            log.error("Error connecting to iTunes endpoint: " + rc.getMessage());
            throw new Exception("Error when to call iTunes API. Details: " + rc);
        }
	}
}
