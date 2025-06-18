package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver leaftaps = new ChromeDriver(options);
		
		leaftaps.navigate().to("http://leaftaps.com/opentaps/");
		leaftaps.manage().window().maximize();
		
		leaftaps.findElement(By.id("username")).sendKeys("demosalesmanager");
		leaftaps.findElement(By.id("password")).sendKeys("crmsfa");
		leaftaps.findElement(By.className("decorativeSubmit")).click();
		
		leaftaps.findElement(By.partialLinkText("CRM/SFA")).click();
		leaftaps.findElement(By.linkText("Accounts")).click();
		leaftaps.findElement(By.linkText("Create Account")).click();
		
		leaftaps.findElement(By.id("accountName")).sendKeys("aaruraaaa");
		leaftaps.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		  WebElement Industry = leaftaps.findElement(By.name("industryEnumId"));
		  Select ind = new Select(Industry);
		  ind.selectByVisibleText("Computer Software");
		  Thread.sleep(1000);
		  
		  WebElement Ownership = leaftaps.findElement(By.name("ownershipEnumId"));
		  Select own = new Select(Ownership);
		  own.selectByVisibleText("S-Corporation");
		  Thread.sleep(1000);
		  
		  WebElement Source = leaftaps.findElement(By.id("dataSourceId"));
		  Select src = new Select(Source);
		  src.selectByValue("LEAD_EMPLOYEE");
		  Thread.sleep(1000);
		  
		  WebElement MarkCamp = leaftaps.findElement(By.id("marketingCampaignId"));
		  Select mc = new Select(MarkCamp);
		  mc.selectByIndex(6);
		  Thread.sleep(1000);
		  
		  WebElement State = leaftaps.findElement(By.id("generalStateProvinceGeoId"));
		  Select st = new Select(State);
		  st.selectByValue("TX");
		  Thread.sleep(1000);
		  
			leaftaps.findElement(By.className("smallSubmit")).click();
			
			String title =leaftaps.getTitle();
			if (title.contains("Account Details")) {
				
				System.out.println("Title is verified");
				
			} else {

				System.out.println("Title is not verified");
			}
		  
		  leaftaps.close();
	}

}
