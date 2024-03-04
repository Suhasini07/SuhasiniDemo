package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.keyword.ActualErrorMessage;
import com.keyword.Config;
import com.keyword.ErrorMessage;
import com.keyword.Keyword;
import com.keyword.Locators;


public class TestcaseExecution {
	
	Keyword keyword=new Keyword();
	@Test
	public void myTestCases() {
		
		keyword.launchBrowser("chrome");	
		keyword.launchURL(Config.APPURL);
		keyword.click(Locators.register);
		keyword.sendKeys(Locators.firstName, "Arnav677");
		boolean b=keyword.firstNameValidation(Locators.firstName);
		System.out.println(b);
		Assert.assertEquals(b, false);;
		keyword.sendKeys(Locators.lastName, "Nigade");
		boolean lname=keyword.fieldEnabled(Locators.lastName);
		Assert.assertTrue(lname);
		keyword.sendKeys(Locators.adress, "akshay classic");
		keyword.sendKeys(Locators.city, "Pune");
		keyword.sendKeys(Locators.state, "Maharashtra");
		keyword.sendKeys(Locators.zipcode, "411087");
		keyword.sendKeys(Locators.phone, "1234567892");
		boolean p=keyword.mobileNoValidation(Locators.phone);
		Assert.assertEquals(b, false);
		keyword.sendKeys(Locators.ssn, "558jikj");
		keyword.sendKeys(Locators.userName, "arnavni");
		keyword.sendKeys(Locators.password, "Test@123");
		keyword.sendKeys(Locators.confirmPassword, "Test@123");
		keyword.click(Locators.registerBtn);
		String fnameerror;
		//fnameerror=keyword.getText(ErrorMessage.fName);
		//Assert.assertEquals(ActualErrorMessage.fname,fnameerror );

	}

}
