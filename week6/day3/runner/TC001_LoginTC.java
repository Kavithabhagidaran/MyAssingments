package runner;

import org.testng.annotations.Test;

import base.CommonMethods;
import pages.LoginPage;

public class TC001_LoginTC extends CommonMethods {

	
	@Test
	public void runLogin() {

		LoginPage user = new LoginPage();
		user.enterUsername().enterPassword().clickLoginButton().clickCRMSFA();
	}
}
