package week3.day4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) {
		
		//Lauching the driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch ServiceNow application
		driver.navigate().to("https://dev217936.service-now.com/ ");
		
		//Login with valid credentials username as admin and password 

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("ulJ8fB5Cd!/M");
		driver.findElement(By.id("sysverb_login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launching Shadow dom
		Shadow shadowDriver = new Shadow(driver);
		shadowDriver.setImplicitWait(20);
		
		//Click All and click service catalog
		shadowDriver.findElementByXPath("//div[text()='All']").click();
		shadowDriver.setImplicitWait(10);
		shadowDriver.findElementByXPath("//span[contains(text(),'Service Catalog')]").click();
		shadowDriver.setImplicitWait(10);
		
		//switch to frame
		driver.switchTo().frame(shadowDriver.findElementByXPath("//iframe[@id='gsft_main']"));
		
		//Click on mobiles
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//click on apple iphone 13 pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		//Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		
		//Select Unlimited from the dropdown in Monthly data allowance
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option ')]"));
		Select dd=new Select(dropdown);
		dd.selectByValue("unlimited");
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'512 GB [add $300.00]')]")).click();
		driver.findElement(By.id("oi_order_now_button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = driver.findElement(By.xpath("//div[contains(@class,'notification notification-success')]/span[2]")).getText();
		if (text.contains("Thank you")) {
			System.out.println(text);
			System.out.println("The Order Placed Successfully");
			
		} else {
System.out.println("The Order is Not Placed");
		}
		String reqId = driver.findElement(By.id("requesturl")).getText();
		System.out.println("The Request Number is.. "+reqId);
		driver.close();
	}

}
