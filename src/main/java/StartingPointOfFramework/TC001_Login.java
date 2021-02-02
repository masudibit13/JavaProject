package StartingPointOfFramework;

import org.testng.annotations.Test;

public class TC001_Login extends GerericWrapper {
	
	
	@Test
	
	public void login () {
		
		launchBrowser("http://leaftaps.com/opentaps/control/main");
		
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByCalssName("decorativeSubmit");
		clickByLinkText("crmsfa");
		
		
		
	}

	
}

