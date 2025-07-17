package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.And;

public class LeadsPage extends CommonMethods {

	@And("the user clicks the createLeadShortcut")
	public CreateLeadsPage clickCreateLeadShortcutButton() {

		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadsPage();

	}

}
