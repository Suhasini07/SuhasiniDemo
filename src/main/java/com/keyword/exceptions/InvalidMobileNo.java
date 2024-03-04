package com.keyword.exceptions;

public class InvalidMobileNo extends Error {
	
	String msg;
	
	public InvalidMobileNo(String mbl) {
		msg="Mobile No. should be 10 digit";
	}
	@Override
	public String toString() {
		return msg;
	}
	
	

}
