package com.tchaikousky;

public abstract class LibraryItem {
	private static int id = 0;
	private String title;
	private int amountInStock;
	private String location;
	private int itemId;
	
	public LibraryItem(String title, int amountInStock, String location) {
		this.itemId = id += 1;
		this.title = title;
		this.amountInStock = amountInStock;
		this.location = location;
		id++;
	}

	public static int getId() {
		return LibraryItem.id;
	}

	public static void setId(int id) {
		LibraryItem.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAmountInStock() {
		return amountInStock;
	}

	public void setAmountInStock(int amountInStock) {
		this.amountInStock = amountInStock;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getItemId() {
		return itemId;
	}

	public void incrementAmountInStock() {
		this.amountInStock += 1;
	}
	
	public void decrementAmountInStock() {
		this.amountInStock -= 1;
	}
	
	
	
}
