package tagName;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
			
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(4000); 
		
		
		
		
		driver.close();
		
		/*driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");             //Multiple xpath on user name
		
		
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000); 
				
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);  */

	}

}
