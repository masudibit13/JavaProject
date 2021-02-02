package parametersTestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;
import wrapper.parametersProjectSpecificWrapper;

public class CreateLead extends parametersProjectSpecificWrapper {
	
	
		//public ChromeDriver driver;

		
		@Test(priority = 0)
		public void createLead() throws InterruptedException {
			// click leads
			driver.findElementByLinkText("Leads").click();
			// click create lead link
			driver.findElementByLinkText("Create Lead").click();
			// enter company name
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			// enter firstName
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
			Thread.sleep(3000);
						
			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();
		}
		

	
	
	
	
	
	
	
		

}
