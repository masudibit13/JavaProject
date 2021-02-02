package com.google.qa.com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VarifyLoginPage {
	
	@Test
	
	public void verifyLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");    //copied from old file. This is something we need every time we test run the webpage
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/billing/?ng=login/");
	   	
		
	
	  
	LoginPage login = new LoginPage(driver);		  //calling from previous loginPage object model calling with constructor
	
	login.typeUserName();
	login.typePassword();
	login.clickLoginBtn();
	
	driver.quit();
	
	}

}
