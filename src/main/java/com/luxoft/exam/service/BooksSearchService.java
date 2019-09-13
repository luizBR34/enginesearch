package com.luxoft.exam.service;

import com.luxoft.exam.model.GoogleBookAPI;

public interface BooksSearchService {
	
	public GoogleBookAPI findBooks(String term) throws Exception;

}
