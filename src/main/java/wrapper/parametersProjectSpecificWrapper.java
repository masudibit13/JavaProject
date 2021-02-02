package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class parametersProjectSpecificWrapper {
	
public ChromeDriver driver;     // We creating this section after annotate BeoforeMethod and AfterMethod
	
	
	@Parameters({"url", "uname", "pwd"})
	

	@BeforeMethod 
	public void login(String url, String uname, String pwd) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver()
	driver = new ChromeDriver();   			// We remove Chrome becasue we have already declare ChromDriver under the class. So we dont need to declare here.  
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get(url);             // if that was a double " " it wont work...
	
	driver.findElementByXPath("//input[@name='USERNAME']").sendKeys(uname); 
	
	driver.findElementByXPath("//input[@type='password']").sendKeys(pwd);
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	
@AfterMethod
public void closeBrowser() {
	driver.close();

}
/*

@DataProvider
//public void getdata []
public String[][] getData() {
	// Declare 2D Array
	String [][] data = new String [2][3] ;
	
	data [0][0] ="TCS";
	data [0][1] ="Omar";
	data [0][2] ="Basith";
	
	data [1][0] ="ABC";
	data [1][1] ="Lovely";
	data [1][2] ="Rawshan";
	
	return data;     // when i write return data it will ask to change the original void method. 

}

*/

}
