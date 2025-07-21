package week5.day1.HA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	static RemoteWebDriver driver;
	
	@Parameters({"url","login","pword",})
	@BeforeMethod
	public void preconditions(String url, String login, String pword) throws InterruptedException {
		//Launch the browser
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL and enter username and password
		driver.navigate().to(url);
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(1000);
		
		//Click View All 
				WebElement viewAll = driver.findElement(By.xpath("//button[contains(text(),'View All')]"));
				driver.executeScript("arguments[0].click()", viewAll);
				Thread.sleep(5000);
				
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


