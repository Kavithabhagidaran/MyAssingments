package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo{

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.navigate().to("https://finance.yahoo.com/"); 

		//Action class
		Actions ac = new Actions(driver);
		
		//Click on “Crypto” tab
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Markets']"))).click().perform();
		ac.click(driver.findElement(By.xpath("//span[text()='Crypto']"))).perform();
		Thread.sleep(2000);
		//Locate the table in the dom page
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'table-container')]"))).perform();
		
		//Locate the cryptocurrency names in the table using specific row and column
		
		List <WebElement> name =driver.findElements(By.xpath("//div[contains(@class,'table-container')]/table//tbody/tr"));
		
		System.out.println("Cryptocurrency names from table\n");
		for (int i = 1; i <=name.size(); i++) {
			
			String namelist = driver.findElement(By.xpath("//div[contains(@class,'table-container')]/table//tbody/tr["+ i +"]/td[2]/div")).getText();
			System.out.println(namelist);
		}
		
	driver.close();
		
		
		
		
	}

}
