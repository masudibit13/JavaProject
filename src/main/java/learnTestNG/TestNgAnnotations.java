package learnTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
	@BeforeMethod
	public void beforeTest () {
		System.out.println("BeforeTest");
	}
		
	@Test  													 // 			***MUST NEED @TEST***  			 for creating TestNG file
	public void test1 () {
		System.out.println("test1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeSuite
	public void beforeSuite () {
		System.out.println("BeforeSuite");
	}
	
	

}
