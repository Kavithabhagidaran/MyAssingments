package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBigbasket {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Launch the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Load the URL
				driver.navigate().to("https://www.bigbasket.com/");

				//Action class
				Actions ac = new Actions(driver);
				
				//Click on "Shop by Category".
				
				ac.click(driver.findElement(By.xpath("//button[contains(@id,'headlessui-menu-button-:Ramkj6:')]"))).perform();
				
				ac.pause(1000).moveToElement(driver.findElement(By.xpath("(//div[contains(@id,'headlessui-menu-items-:Rimkj6:')]//a)[6]"))).pause(500).perform();
				ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Rice & Rice Products')]"))).pause(1000).perform();
				ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Boiled & Steam Rice')]"))).click().pause(1000).perform();
				ac.click(driver.findElement(By.id("i-bbRoyal"))).click(driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"))).perform();
				
				//Get windowhandles
				Set<String> bbwindows = driver.getWindowHandles();
				List<String> bblist = new ArrayList<String>(bbwindows);
				
				driver.switchTo().window(bblist.get(1));
				Thread.sleep(1000);
				ac.click(driver.findElement(By.xpath("//span[text()='5 kg']"))).perform();
				
				//Check and note the price of the rice
				String ricePrice = driver.findElement(By.xpath("(//span[contains(@class,'Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5')])[5]")).getText();
				System.out.println("The price of 5kg rice is "+ricePrice);
				
				//Click "Add" to add the bag to your cart
				driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
				Thread.sleep(1000);
				
				//Verify the success message that confirms the item was added to your cart
				String successMessage = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
				System.out.println(successMessage);
				
				// Take a snapshot of the current page
				
				File src = driver.getScreenshotAs(OutputType.FILE);
				File des = new File("./screenshot/bbcartpage.png");
				FileUtils.copyFile(src, des);
				
				//Close the current window
				driver.close();
				
				//Close the main window.
				driver.quit();
				
				
 	}

}
