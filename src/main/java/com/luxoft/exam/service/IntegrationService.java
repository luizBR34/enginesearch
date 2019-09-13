package com.luxoft.exam.service;

import java.util.List;

import com.luxoft.exam.dto.ResponseItem;
import com.luxoft.exam.model.GoogleBookAPI;

public interface IntegrationService {
	
	public List<ResponseItem> parserResponse(GoogleBookAPI data);

}
