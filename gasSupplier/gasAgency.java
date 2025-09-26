package com.gasSupplier;

public interface gasAgency {
	
	public String agencyNumber = "Bharat Gas";
	public int agencyCode = 1234;
	public long phNumber = 9811601;
    default void agencyDisplay() {
		System.out.println("The agency name is: " + agencyNumber);
		System.out.println("The agency code is: " + agencyCode);
		System.out.println("The agency phno is: " + phNumber);
	}

}
