package com.luxoft.exam.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.luxoft.exam.model.AppleAlbumsAPI;
import com.luxoft.exam.model.GoogleBookAPI;

public interface SearchService {
	
	public GoogleBookAPI findBooks(String term) throws Exception;
	public AppleAlbumsAPI findAlbums(String term) throws Exception;
	
	public default RestTemplate createRestTemplate() {

		RestTemplate restTemplate = new RestTemplate();

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters);
		
		return restTemplate;	
	}
}
