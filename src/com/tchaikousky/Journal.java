package com.tchaikousky;

public class Journal extends LibraryItem {
	private String author;
	private String edition;
	
	public Journal(String title, int amountInStock, String location, String author, String edition) {
		super(title, amountInStock, location);
		this.author = author;
		this.edition = edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	
	
}
