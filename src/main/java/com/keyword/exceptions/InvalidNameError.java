package com.keyword.exceptions;

public class InvalidNameError extends Error {
	String msg;

	public  InvalidNameError(String name) {
		
				
			msg="Name should contain only alphabets";

	}
	
	@Override
	public String toString() {
		return msg;

	}

}
