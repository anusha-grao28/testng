package com.anusha.testing;

public class Address {

	private String pinCode;
	private String state;
	private String town;

	public String getState() {
		return state;
	}

	public Address(String pinCode, String state, String town) {
		this.pinCode = pinCode;
		this.state = state;
		this.town = town;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String pinCode, String town) {
		super();
		this.pinCode = pinCode;
		this.town = town;
	}

	
	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
