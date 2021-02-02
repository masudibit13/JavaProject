package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SmipleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//input[@id='searchBtn']) [1]").click();
		
		String simpleAlertTxt = driver.switchTo().alert().getText();                                    																	
		
		driver.switchTo().alert().accept(); 
			
		
		Thread.sleep(4000); 
		driver.close();
		
		
	}

}
