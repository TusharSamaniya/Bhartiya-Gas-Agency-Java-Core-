package com.customer;

import com.gasSupplier.gasAgency;

public class Customers implements gasAgency{
	
	String name;
	String Street;
	String area;
	String pincode;
	String mobileNumber;
	

	public Customers(String name, String street, String area, String pincode, String mobileNumber) {
		super();
		this.name = name;
		Street = street;
		this.area = area;
		this.pincode = pincode;
		this.mobileNumber = mobileNumber;
	}
	
	

}
