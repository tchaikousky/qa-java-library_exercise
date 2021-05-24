package com.tchaikousky;

import java.util.ArrayList;

public class BookCase {
	private String name;
	private ArrayList<LibraryItem> items;
	
	public BookCase(String name) {
		this.name = name;
		this.items = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addItem(LibraryItem item) {
		items.add(item);
	}
	
	public void removeItem(LibraryItem item) {
		items.remove(item);
	}

	public void viewContents(ArrayList<LibraryItem> list) {
		for(LibraryItem item : list) {
			System.out.print(item.getTitle());
		}	
	}
		
}
