package com.tchaikousky;

public abstract class Person {
	private String firstName;
	private String lastName;
	private String age;
	private String name;
	
	public Person(String firstName, String lastName, String age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.name = firstName + " " + lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
}
