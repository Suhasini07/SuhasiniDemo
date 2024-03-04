package com.keyword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.keyword.Locators;

import com.keyword.exceptions.InvalidMobileNo;
import com.keyword.exceptions.InvalidNameError;

public class Keyword {
	
	 public RemoteWebDriver driver;
	
	public void launchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome"))
			
		{
			driver=new ChromeDriver();
			
			System.out.println("Launching chrome browser");
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("Launching firefox browser");

		}
		
		else
			
		{
			System.err.println("Invalid browser name");
		}
		
		
		

	}
	
	public void launchURL(String url) {
		
		driver.get(url);

	}
	
	public void click(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public void sendKeys(String xpath,String name) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(name);

	}
//	public String getText(String xpath) {
//		String text=driver.findElement(By.xpath(xpath)).getText();
//		
//		return text;
//
//	}
	
	public boolean mobileNoValidation(String mblxpath) {
		String mbl=driver.findElement(By.xpath(mblxpath)).getText();
  System.out.println("Mobile No. is :"+mbl);
	//int mobileno=Integer.parseInt(mbl);

		Pattern p=Pattern.compile("^\\d{10}$");
		Matcher m=p.matcher(mbl);
		boolean matchfound=m.find();
		System.out.println(matchfound);
		return matchfound;

	}
	
	public boolean firstNameValidation(String fnamepath) {
		boolean value=true;
		// value=fname.matches("^[a-zA-Z]*$");
		
		String s=driver.findElement(By.xpath(fnamepath)).getText();
		System.out.println("First Name is : "+s);
		//Pattern p=Pattern.compile("^[a-zA-Z]*$");
		//Matcher m=p.matcher(s);
		  value=s.matches("^[a-z]{1,6}$");
		System.out.println(value);
return value;
		
		

	}
	
	public boolean fieldEnabled(String lnameXpath) {
		boolean lname=driver.findElement(By.xpath(lnameXpath)).isEnabled();
		return lname;
		

	}
	
	
}
