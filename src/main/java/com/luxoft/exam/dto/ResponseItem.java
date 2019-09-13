package com.luxoft.exam.dto;

import java.util.List;

public class ResponseItem {
	
	private String title;
	private List<String> authors;
	private String itemType;

	public ResponseItem(String title, List<String> authors, String itemType) {
		this.title = title;
		this.authors = authors;
		this.itemType = itemType;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
    public static int sortByTitle(ResponseItem a, ResponseItem b) {
        return a.title.compareTo(b.title);
    }
}
