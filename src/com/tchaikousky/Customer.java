package com.tchaikousky;

import java.util.ArrayList;

public class Customer extends Person implements Viewable {
	private int customerId = 0;
	private ArrayList<LibraryItem> currentRentedItems;
	private ArrayList<LibraryItem> allRentedItems;
	private ArrayList<String> membershipCities;

	public Customer(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		this.customerId += 1;
		currentRentedItems = new ArrayList<>();
		allRentedItems = new ArrayList<>();
		membershipCities = new ArrayList<>();
		customerId++;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public void addCities(String city) {
		membershipCities.add(city);
	}

	@Override
	public void viewContents(ArrayList<?> items) {
		for(Object item : items) {
			System.out.println(item);
		}
	}
	
	public void checkoutItem(LibraryItem item) {
		currentRentedItems.add(item);
		allRentedItems.add(item);
	}
	
	public void returnItem(int id) {
		int index = -1;
		for(LibraryItem rentedItem : currentRentedItems) {
			if(rentedItem.getItemId() == id ) {
				index = currentRentedItems.indexOf(rentedItem);
			}
		}
		if(index != -1) {
			currentRentedItems.remove(index);
		} else {
			System.out.println("Item with id of " + id + " is not currently checked out.");
		}
	}
	
}
