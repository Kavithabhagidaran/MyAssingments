package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.And;

public class HomePage  extends CommonMethods{
	@And("the user clicks the crmsfa link")
	public MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}

}
