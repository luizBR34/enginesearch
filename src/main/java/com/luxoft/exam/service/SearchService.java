package com.luxoft.exam.service;

import com.luxoft.exam.model.AppleAlbumsAPI;
import com.luxoft.exam.model.GoogleBookAPI;

public interface SearchService {
	
	public GoogleBookAPI findBooks(String term) throws Exception;
	public AppleAlbumsAPI findAlbums(String term) throws Exception;
}
