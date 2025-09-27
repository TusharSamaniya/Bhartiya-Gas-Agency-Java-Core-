package com.gasBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.customer.GasConnection;

public class Booking extends GasConnection{
	
	public double otp = 5682, amount = 825.0, refund = 0;
	
	public String dt, delDate, status, delMobileNo = "789456123";
	public Date dt_1;

	public Booking(String name, String street, String area, String pincode, String mobileNumber, Date lastDate) {
		super(name, street, area, pincode, mobileNumber, lastDate);
		// TODO Auto-generated constructor stub
	}
	
	public void getDate() {
		System.out.println("Enter booking date: ");
		dt = new Scanner(System.in).next();
		dt_1 = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dt_1 = dateFormat.parse(dt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}

}
