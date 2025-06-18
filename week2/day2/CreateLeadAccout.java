package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAccout {

	public static void main(String[] args) {
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			ChromeDriver leaftaps = new ChromeDriver(options);
			
			leaftaps.manage().window().maximize();
			leaftaps.navigate().to("http://leaftaps.com/opentaps/");
			
			
			leaftaps.findElement(By.id("username")).sendKeys("demosalesmanager");
			leaftaps.findElement(By.id("password")).sendKeys("crmsfa");
			leaftaps.findElement(By.className("decorativeSubmit")).click();
			
			leaftaps.findElement(By.partialLinkText("CRM/SFA")).click();
			leaftaps.findElement(By.linkText("Leads")).click();
			leaftaps.findElement(By.linkText("Create Lead")).click();
			
			leaftaps.findElement(By.id("createLeadForm_firstName")).sendKeys("Aaaaru");
			leaftaps.findElement(By.id("createLeadForm_lastName")).sendKeys("dran");
			leaftaps.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
			leaftaps.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA");
			leaftaps.findElement(By.name("submitButton")).click();
			
			String title =leaftaps.getTitle();
			if (title.contains("Lead")) {
				
				System.out.println("Title is verified");
				
			} else {

				System.out.println("Title is not verified");
			}
			leaftaps.close();
	}

}
