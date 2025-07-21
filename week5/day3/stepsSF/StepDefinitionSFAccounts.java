package stepsSF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSFAccounts extends ProjectSpecificMethod {

	@Given("User launch the browser")
	public void user_launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

	@Given("user loads the url")
	public void user_loads_the_url() {
		driver.navigate().to("https://login.salesforce.com/");
    
	}

	@When("user enters the username")
	public void user_enters_the_username_as() {
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");

	}

	@When("user enters the password")
	public void user_enters_the_password_as() {
		driver.findElement(By.id("password")).sendKeys("Leaf@2025");
	}

	@When("user clicks the Login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("Login")).click();
	    }

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
	   }

	@Then("user clicks the toggle button")
	public void user_clicks_the_toggle_button() throws InterruptedException {
		WebElement toggle = driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-context-bar')]"));
		driver.executeScript("arguments[0].click()", toggle);
		Thread.sleep(3000);
	   }

	@Then("user clicks view all")
	public void user_clicks_view_all() throws InterruptedException {
		WebElement viewAll = driver.findElement(By.xpath("//button[contains(text(),'View All')]"));
		driver.executeScript("arguments[0].click()", viewAll);
		Thread.sleep(3000);
	}

	@Then("user clicks sales from the App launcher")
	public void user_clicks_sales_from_the_app_launcher() throws InterruptedException {
		Actions scroll = new Actions(driver);
		scroll.moveToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).click().perform();
		Thread.sleep(5000);
	}

	@Then("user clicks on Accounts tab")
	public void user_clicks_on_accounts_tab() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[@title='Accounts']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
        Thread.sleep(2000);
	}

	@Then("user clicks on New tab")
	public void user_clicks_on_new_tab() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='New']")).click();
		Thread.sleep(2000);
	
	}

	@Then("user enter name")
	public void user_enter_name_as() {
		
	driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys("Kavitha");

	}

	@Then("user select ownership as public")
	public void user_select_ownership_as_public() {
		WebElement dd = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	driver.executeScript("arguments[0].click()", dd);
	 driver.findElement(By.xpath("//span[@title='Public']")).click();
	
	}

	@Then("user clicks save")
	public void user_clicks_save() {
	     driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("user verify the account name")
	public void user_verify_the_account_name() {
		String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains("Kavitha"),"Verify the Account name");
		
        driver.close();
	}


	
	
}
