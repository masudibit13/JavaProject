package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
			
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();			
		
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");             
		
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000); 
				
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000); 
		
		driver.findElementByPartialLinkText("Create Lead").click();
		Thread.sleep(2000); 
		
		
		Thread.sleep(4000); 
		driver.close();
		

	}

}
