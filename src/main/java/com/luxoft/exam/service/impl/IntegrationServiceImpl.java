package com.luxoft.exam.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxoft.exam.dto.ResponseItem;
import com.luxoft.exam.model.AppleAlbumsAPI;
import com.luxoft.exam.model.GoogleBookAPI;
import com.luxoft.exam.service.IntegrationService;
import com.luxoft.exam.service.SearchService;

@Service
public class IntegrationServiceImpl implements IntegrationService {
	
	@Autowired
	private SearchService srchService;
	
	private final Logger log = LoggerFactory.getLogger(IntegrationServiceImpl.class);
	
	
	@Override
	public List<ResponseItem> processRequest(String term) {

		try {
			
			GoogleBookAPI googleResponse = srchService.findBooks(term);

			if (!googleResponse.getItems().isEmpty()) {
				
				log.info("IntegrationServiceImpl:processRequest() - Books found: " + googleResponse.getItems().size());
				List<ResponseItem> response = parserResponse(googleResponse);
				
				integrateAndClassify(response, term);

				return response;

			} else {
				
				log.info("IntegrationServiceImpl:processRequest() - No book found!");
				List<ResponseItem> response = new ArrayList<ResponseItem>();
				
				integrateAndClassify(response, term);

				return response;
			}

		} catch (Exception e) {
			
			log.error("IntegrationServiceImpl:processRequest() - Error: " + e.getMessage());
			return null;
		}		
	}
	

	@Override
	public List<ResponseItem> parserResponse(GoogleBookAPI data) {
		
		List<ResponseItem> response = new ArrayList<ResponseItem>();

		data.getItems()
		.stream()
		.filter(r -> r.getVolumeInfo().getPrintType().equals("BOOK"))
		.forEach(r -> response.add(new ResponseItem(r.getVolumeInfo().getTitle(),
													r.getVolumeInfo().getAuthors(),
													r.getVolumeInfo().getPrintType()
													)
								   )
				);
		
		return response;
	}

	@Override
	public void parserResponse(List<ResponseItem> list, AppleAlbumsAPI data) {

		data.getResults()
		.stream()
		.filter(r -> r.getCollectionType().equals("Album"))
		.forEach(r -> list.add(new ResponseItem(r.getCollectionName(),
												Arrays.asList(r.getArtistName()),
												r.getCollectionType()
												)
							   )
				);
	}



	@Override
	public void integrateAndClassify(List<ResponseItem> response, String term) throws Exception {
		
		AppleAlbumsAPI iTunesResponse = srchService.findAlbums(term);
		
		if (!iTunesResponse.getResults().isEmpty()) {
			
			log.info("IntegrationServiceImpl:integrateAndClassify() - Albums found: " + iTunesResponse.getResultCount());
			parserResponse(response, iTunesResponse);
		}

		response.sort(ResponseItem::sortByTitle);
	}
}
