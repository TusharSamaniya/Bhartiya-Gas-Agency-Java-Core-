package com.customer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GasConnection extends Customers{
	
	int numberOfClinder;
	String date;
	static int connectionNumber = 100;
	{
		connectionNumber+= 1;
	}
	Date lastDate = null;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public GasConnection(String name, String street, String area, String pincode, String mobileNumber, Date lastDate) {
		super(name, street, area, pincode, mobileNumber);
		this.lastDate = lastDate;
	}
	
	public void getLastDate() {
		System.out.println("Enter the last date");
		date = new Scanner(System.in).nextLine();
		
		try {
			lastDate = dateFormat.parse(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
