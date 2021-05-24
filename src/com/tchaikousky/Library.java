package com.tchaikousky;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<BookCase> shelves;
	private ArrayList<Customer> customers;
	
	public Library(String name) {
		this.name = name;
		this.shelves = new ArrayList<>();
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<BookCase> getShelves() {
		return shelves;
	}

	public void setShelves(ArrayList<BookCase> shelves) {
		this.shelves = shelves;
	}
	
	public void addShelf(BookCase bookcase) {
		this.shelves.add(bookcase);
	}
	
	public void removeShelf(BookCase bookcase) {
		this.shelves.remove(bookcase);
	}
	
	public void checkoutItem(Customer customer, LibraryItem item) {
		if(item.getAmountInStock() != 0) {
			customer.checkoutItem(item);
			item.decrementAmountInStock();
		} else {
			System.out.println(item.getTitle() + " is currently not in stock");
		}
	}
	
	public void checkInItem(Customer customer, LibraryItem item) {
		customer.returnItem(item.getItemId());
		item.incrementAmountInStock();
	}
	
	public void addItem(BookCase bookCase, LibraryItem item) {
		bookCase.addItem(item);
		item.setLocation(bookCase.getName());
	}
	

	public void updateItem(LibraryItem item, String title) {
		item.setTitle(title);
	}
	
	public void updateItem(LibraryItem item, int amountInStock) {
		item.setAmountInStock(amountInStock);
	}
	
	public void updateItem(LibraryItem item, BookCase newBookCase, String location) {
		item.setLocation(newBookCase.getName());
	}
	
	public void removeItem(LibraryItem item) {
		BookCase bookCase = null;
		
		for(BookCase shelf : shelves) {
			if(shelf.getName().equals(item.getLocation())) {
				bookCase = shelf;
				break;
			}
		}
		
		if(bookCase != null) {
			bookCase.removeItem(item);
		} else {
			System.out.println("Could not find " + item.getTitle() + " in our library.");
		}
	}
	
	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void deleteCustomer(Customer customer) {
		customers.remove(customer);
	}
	
	public void updateCustomer(Customer customer, String firstName, String lastName, int age) {
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setName();
		customer.setAge(age);
	}
}
