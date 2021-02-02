package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		//Way 1
		driver.switchTo().frame("iframeResult");
		
		//Way2
		driver.switchTo().frame(1);
		
		//way3
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		driver.switchTo().parentFrame();  //OR
		//driver.switchTo().defaultContent();
				
		Thread.sleep(4000); 
		driver.close();

	}

}
