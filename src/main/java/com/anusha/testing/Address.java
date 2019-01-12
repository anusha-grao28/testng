package com.anusha.testing;

public class Address {

	private String pinCode;

	private String town;
	
	
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
