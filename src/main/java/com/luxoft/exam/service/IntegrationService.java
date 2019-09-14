package com.luxoft.exam.service;

import java.util.List;

import com.luxoft.exam.dto.ResponseItem;
import com.luxoft.exam.model.AppleAlbumsAPI;
import com.luxoft.exam.model.GoogleBookAPI;

public interface IntegrationService {
	
	public List<ResponseItem> processRequest(String term);
	public List<ResponseItem> parserResponse(GoogleBookAPI data);
	public void parserResponse(List<ResponseItem> list, AppleAlbumsAPI data);
	public void integrateAndClassify(List<ResponseItem> response, String term) throws Exception;
}
