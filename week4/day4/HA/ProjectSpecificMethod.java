package week4.day4.HA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	static ChromeDriver driver;
	@BeforeMethod
	public void preconditions() throws InterruptedException {
		
		//Launch the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//Load the URL and enter username and password
		driver.navigate().to("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@2025");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		
		//Click on the toggle menu button from the left corner
		
		WebElement toggle = driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-context-bar')]"));
		driver.executeScript("arguments[0].click()", toggle);
		Thread.sleep(3000);
		
		//Click View All 
		WebElement viewAll = driver.findElement(By.xpath("//button[contains(text(),'View All')]"));
		driver.executeScript("arguments[0].click()", viewAll);
		Thread.sleep(3000);
		
		//scroll and click Legal Entities from App Launcher
				Actions scroll = new Actions(driver);
				scroll.moveToElement(driver.findElement(By.xpath("//p[text()='Legal Entities']"))).click().perform();
				Thread.sleep(5000);
		//Click on the Dropdown icon in the legal Entities tab
				driver.findElement(By.xpath("((//span[text()='Legal Entities'])[1]/following::lightning-primitive-icon/*[@data-key='chevrondown'])[1]")).click();
				Thread.sleep(5000);
		//Click on New Legal Entity
				driver.findElement(By.xpath("(//*[@data-key='add'])[2]")).click();
				Thread.sleep(5000);
		
			}
	@AfterMethod
	public void postcondition() {


driver.close();

	}





}
