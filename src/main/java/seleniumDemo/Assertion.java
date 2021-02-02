package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion {
	
	@Test
	
	public void googletest() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google", "Asserting the title");
	

	
	boolean searchbox = driver.findElementByName("q").isDisplayed();
	Assert.assertTrue("Verify if the serachbox displayed", searchbox);
	
	driver.close();
	
	
	
	
	
	
	
	
	}

}
