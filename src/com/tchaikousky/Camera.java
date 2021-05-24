package com.tchaikousky;

public class Camera extends LibraryItem {
	private String model;

	public Camera(String title, int amountInStock, String location, String model) {
		super(title, amountInStock, location);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
}
