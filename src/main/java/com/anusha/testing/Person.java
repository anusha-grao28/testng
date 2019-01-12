package com.anusha.testing;

public class Person {

	private String fName;
	private String lName;
	private Integer age;
	
	private Address address;

	
	
	public Person(String fName, String lName, Integer age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public String getFullName(){
		
		return this.fName +"-" + this.lName;
	}
	
}
