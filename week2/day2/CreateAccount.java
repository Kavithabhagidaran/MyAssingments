package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
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
		
		leaftaps.findElement(By.id("accountName")).sendKeys("Aaaru");
		leaftaps.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		leaftaps.findElement(By.id("numberEmployees")).sendKeys("500");
		leaftaps.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		leaftaps.findElement(By.className("smallSubmit")).click();
		leaftaps.findElement(By.id("numberEmployees")).sendKeys("500");
		
		String title =leaftaps.getTitle();
		if (title.contains("Account")) {
			
			System.out.println("Title is verified");
			
		} else {

			System.out.println("Title is not verified");
		}

		leaftaps.close();
	}

}
