package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;     // We creating this section after annotate BeoforeMethod and AfterMethod
	
	
	@BeforeMethod 
	public void login() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver()
	driver = new ChromeDriver();   			// We remove Chrome becasue we have allredy declare ChromDriver under the class. So we dont need to declare here.  
	
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager"); 
	
	driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	driver.findElementByLinkText("CRM/SFA").click();

	}
	
@AfterMethod
public void closeBrowser() {
	driver.close();

	
  }
}
