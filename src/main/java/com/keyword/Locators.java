package com.keyword;

public interface Locators {
	
	String register ="//a[contains(text(),'Register')]";
	String firstName="//input[@id='customer.firstName']";
	String lastName="//input[@id='customer.lastName']";
	String adress="//input[@id=\"customer.address.street\"]";
	String city="//input[@id=\"customer.address.city\"]";
	String state="//input[@id=\"customer.address.state\"]";
	String zipcode="//input[@id=\"customer.address.zipCode\"]";
	String phone="//input[@id=\"customer.phoneNumber\"]";
	String ssn="//input[@id=\"customer.ssn\"]";
	String userName="//input[@id=\"customer.username\"]";
	String password="//input[@id=\"customer.password\"]";
	String confirmPassword="//input[@id=\"repeatedPassword\"]";
	String registerBtn="//input[@value=\"Register\"]";


	
	


}
