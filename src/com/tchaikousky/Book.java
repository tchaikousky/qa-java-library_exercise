package com.tchaikousky;

public class Book extends LibraryItem{
	private String author;
	private int numOfPages;
	
	public Book(String title, int amountInStock, String location, String author, int numOfPages) {
		super(title, amountInStock, location);
		this.author = author;
		this.numOfPages = numOfPages;
		
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
}
