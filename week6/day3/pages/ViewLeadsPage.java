package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.And;

public class ViewLeadsPage extends CommonMethods{
	
	@And("the user verify the created Lead from view leads page")
	
	public void Leadcreated() {

	String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
	
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
		
		
	}}
}
