package com.schram.brewer.model;

public enum Flavor {

	SWEETISH("Adocicada"),
	BITTER("Amarga"),
	STINGO("Forte"),
	FRUITY("Frutada"),
	LIGHT("Suave");
	
	private String description;
	
	private Flavor(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}