package testCases_InheritanceForCon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper {
	
		//public ChromeDriver driver;


		@Test(priority = 1)
		public void editLead() {
			// click leads link
			driver.findElementByLinkText("Leads").click();
			// click Find leads link
			driver.findElementByLinkText("Find Leads").click();
			// Enter first name
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
			// click Find lead button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
		}

		
}

			


