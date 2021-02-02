package learnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumScript {
	
	

	public static void main(String[] args) throws InterruptedException {                                  // It is called Main Method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		//System of object creation
		//Class name object = new class name();        Chrome driver is a class.
		ChromeDriver driver = new ChromeDriver(); 
			
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();			
		
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");                             // this is call Test data
		//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");             //Multiple xpath on user name
		
		
		//driver.findElement(By.id("password")).sendKeys("crmsfa");										//Call Test data
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000); 
				
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000); 
		
		driver.findElementByPartialLinkText("Create Lead").click();
		//driver.findElementByLinkText("//a[text()='Create Lead']").click();
		Thread.sleep(2000); 
		
		WebElement source = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd= new Select(source);
		dd.deselectByVisibleText("LEAD_EMPLOYEE");
		Thread.sleep(2000); 
	
		/*WebElement source = driver.findElementById("createLeadForm_dataSourceId"); 									//Drop Down line   CTRL +2,L
		Select dd = new Select(source);
		dd.deselectByVisibleText("Word of Mouth"); */
	
	     WebElement MKTCampain = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");              // select by using Value
	    Select dd1 = new Select (MKTCampain);
	    dd1.selectByValue("9002");
	    Thread.sleep(2000); 
	    
	    
	    WebElement Industry = driver.findElementByXPath("(//select[@class='inputBox'])[4]");
	    Select dd2 = new Select (Industry);
	    dd2.selectByIndex(7);  
	    Thread.sleep(2000); 
	    
		//driver.findElementByLinkText("Create Lead").click();
	    
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(4000); 
		driver.close();
	  		

		
	}

}
	