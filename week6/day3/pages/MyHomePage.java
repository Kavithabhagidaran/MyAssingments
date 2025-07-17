package pages;

import org.openqa.selenium.By;


import base.CommonMethods;
import io.cucumber.java.en.And;

public class MyHomePage extends CommonMethods {
	

	@And("the user clicks the Leadmodule")
	public LeadsPage clickLeadsModule() {
		getDriver().findElement(By.linkText("Leads")).click();
		
		return new LeadsPage();
	}

}
