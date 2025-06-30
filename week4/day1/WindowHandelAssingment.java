package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandelAssingment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		//Initialize ChromeDriver and Load the URL
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter the username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[1]")).click();
		Thread.sleep(1000);
		
		//Get Window list
		Set<String> windowsset = driver.getWindowHandles();
		
		List<String> shiftWindow = new ArrayList<String>(windowsset);
		
		//Shift the focus to new find contact window
		driver.switchTo().window(shiftWindow.get(1));
		
		//Click on the first resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		//Shift focus to parent window
		driver.switchTo().window(shiftWindow.get(0));
		
		//Click on the widget of the "To Contact
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[2]")).click();
		Thread.sleep(1000);
		
		//Get Window list
		Set<String> windowsset2 = driver.getWindowHandles();
		
		List<String> shiftWindow2 = new ArrayList<String>(windowsset2);

		//Shift the focus to new find contact window
		driver.switchTo().window(shiftWindow2.get(1));
		
		//Click on the Second resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[5]")).click();
		
		
		
		//Shift focus to parent window
		driver.switchTo().window(shiftWindow2.get(0));
		
		//Click on the Merge button
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[3]")).click();
		
		//Accept the alert
		driver.switchTo().alert().accept();
		
		//Verify the Title of the page
		System.out.println("The page title is " + driver.getTitle());
		
		driver.quit();
	
	
	}

}
