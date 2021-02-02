package StartingPointOfFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GerericWrapper implements WrapperMethods {

	ChromeDriver driver;
	
	public void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}

	public void enterById(String locatorValue, String data) {
		
		driver.findElementById(locatorValue).sendKeys(data);
		
	}

	public void enterByName(String locatorValue, String data) {
		
		driver.findElementByName(locatorValue).sendKeys(data);	
		
	}

	public void enterByXpath(String locatorValue, String data) {
		
		driver.findElementByXPath(locatorValue).sendKeys(data);		
		
	}

	public void enterByClassName(String locatorValue, String data) {
		
		driver.findElementByClassName(locatorValue).sendKeys(data);		
		
	}

	public void enterByLinkText(String locatorValue, String data) {
		
		driver.findElementByLinkText(locatorValue).sendKeys(data);		
		
	}

	public void cssSelector(String locatorValue, String data) {
		
		driver.findElementByCssSelector(locatorValue).sendKeys(data);	
		
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);		
	}

	public void clickById(String locatorValue) {
		
		driver.findElementById(locatorValue).click();		
	}

	public void clickByName(String locatorValue) {
		
		driver.findElementByName(locatorValue).click();				
	}

	public void clickByCalssName(String locatorValue) {
		
		driver.findElementByClassName(locatorValue).click();		
	}

	public void clickByXpath(String locatorValue) {
		
		driver.findElementByXPath(locatorValue).click();		
	}

	public void clickByLinkText(String locatorValue) {
		
		driver.findElementByLinkText(locatorValue).click();		
	}

	public void selectVisibleTextById(String Id, String value) {
		
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
			
	}

	public void selectVisibleTextByName(String Name, String value) {
		
		WebElement ele = driver.findElementById(Name);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);		
		
	}

	public void selectIndexById(String Id, int value) {
		
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.deselectByIndex(value);
		
	}

	public void selectValueById(String Id, String value) {
		
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByValue(value);		
		
	}
	
	
public void takesnap() {
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File tar = new File("./snap/image.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public void getTextById(String Id) {
		
		WebElement text = driver.findElementById(Id);
		System.out.println("text");
	}

	public void closeBrowser() {
		
		driver.close();
		
	}
	
	
	

}
