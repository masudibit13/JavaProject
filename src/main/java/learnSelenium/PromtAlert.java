package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		
		Alert promtAlert = driver.switchTo().alert();
		System.out.println(promtAlert.getText());
		Thread.sleep(3000);
		
		promtAlert.sendKeys("I am the mastermind");
		Thread.sleep(3000);
		promtAlert.accept();
		
		System.out.println(driver.findElement(By.id("Result")).getText());
		
		driver.close();

	}

}
