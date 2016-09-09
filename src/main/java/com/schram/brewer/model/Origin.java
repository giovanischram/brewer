package com.schram.brewer.model;

public enum Origin {

	NATIONAL("Nacional"),
	INTERNATIONAL("Internacional");
	
	private String description;
	
	private Origin(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}