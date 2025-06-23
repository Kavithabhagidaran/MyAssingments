package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	
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
		leaftaps.findElement(By.linkText("Find Leads")).click();
		leaftaps.findElement(By.xpath("//span[text()='Phone']")).click();
		leaftaps.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456");
		leaftaps.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String id=leaftaps.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();	
		System.out.println("The first lead id is: "+id);
		leaftaps.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		Thread.sleep(1000);
		leaftaps.findElement(By.className("subMenuButtonDangerous")).click();
		leaftaps.findElement(By.linkText("Find Leads")).click();
		leaftaps.findElement(By.name("id")).sendKeys(id);
		leaftaps.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		String record = leaftaps.findElement(By.xpath("//div[contains(@class,'x-paging')]")).getText();
if (record.equalsIgnoreCase("No records to display")) {
	
	System.out.println("The data has been deleted");
	
	
} else {
System.out.println("The data has been not deleted");


}
Thread.sleep(1000);
leaftaps.close();
}
}