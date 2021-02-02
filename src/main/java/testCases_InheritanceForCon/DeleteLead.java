package testCases_InheritanceForCon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class DeleteLead extends ProjectSpecificWrapper {
	
	  //  public ChromeDriver driver;
	
		@Test(priority = 2)
		public void deleteLead() {
			// click Leads
					driver.findElementByLinkText("Leads").click();
			// click Find lead link
					driver.findElementByLinkText("Find Leads").click();
			// click on phone
					driver.findElementByXPath("//span[text()='Phone']").click();
			// click on email
			// driver.findElementByXPath("//span[text()='Email']").click();
			// enter phone number(areaCode)
					driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
			// enter phone number
					driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
			// enter email address
			// driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
		}
		
	
	
 
}
