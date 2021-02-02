package com.google.qa.com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;								// webDriver is a interface. You can say global connected
	
	By username = By.id("username");  				// By it is a class for selenium
	By password = By.name("password");
	By signin   = By.xpath("//button[@name=\\\"login\\\"]");
	
	
	
public LoginPage(WebDriver driver) {				// constructor 
	this.driver = driver;							// this is a key word. 
	}
	
public void typeUserName() {
    driver.findElement (username).sendKeys("techfiosdemo@gmail.com");	
	}

public void typePassword() {
	driver.findElement(password).sendKeys("abc123");
    }

public void clickLoginBtn() {
	driver.findElement(signin).click();
}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
