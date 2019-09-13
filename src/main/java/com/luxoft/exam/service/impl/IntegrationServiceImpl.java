package com.luxoft.exam.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.luxoft.exam.dto.ResponseItem;
import com.luxoft.exam.model.GoogleBookAPI;
import com.luxoft.exam.service.IntegrationService;

@Service
public class IntegrationServiceImpl implements IntegrationService {

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
}
