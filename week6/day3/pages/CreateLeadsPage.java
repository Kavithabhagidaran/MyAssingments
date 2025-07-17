package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.And;


public class CreateLeadsPage extends CommonMethods{
	@And("the user fills the company name")
	public CreateLeadsPage enterCname() {
		
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}
	@And("the user fills the firstname")
	public CreateLeadsPage enterFname() {
		
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("bhuvanesh");
	return this;
	}
	@And("the user fills the lastname")
	
	public CreateLeadsPage enterLname() {
	getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("moorthy");
	return this;
}
	@And("the user fills the phonenumber")
	public CreateLeadsPage enterPhno() {
	getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98127");
	return this;	
}
	@And("the user clicks the Submit button")
	public ViewLeadsPage clickSubmitButton() {
	getDriver().findElement(By.name("submitButton")).click();
	return new ViewLeadsPage();

}
	
}
