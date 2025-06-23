package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

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
		leaftaps.findElement(By.xpath("//a[text()='Create Lead']")).click();
		leaftaps.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("company1");
		leaftaps.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aaru");
		leaftaps.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("dran");
		leaftaps.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Aara");
		leaftaps.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		leaftaps.findElement(By.id("createLeadForm_description")).sendKeys("khihieujakdjjsajgkj");
		leaftaps.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaru@gmail.com");
		 WebElement dd = leaftaps .findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select opt =new Select(dd);
		opt.selectByVisibleText("New York");
		leaftaps.findElement(By.xpath("//input[@name='submitButton']")).click();
		leaftaps.findElement(By.xpath("//a[text()='Edit']")).click();
		leaftaps.findElement(By.id("updateLeadForm_description")).clear();
		leaftaps.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated");
		leaftaps.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String title = leaftaps.getTitle();
		Thread.sleep(1000);
		System.out.println("The displayed page is "+title);
leaftaps.close();
		
	}

}
