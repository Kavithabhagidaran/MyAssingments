package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Launch the driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.navigate().to("https://www.amazon.in/");

		//Action class
		Actions ac = new Actions(driver);
		
		//Search for "oneplus 9 pro"
		ac.sendKeys(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")), "oneplus 9 pro")
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//div[@class='puisg-row'])[1]//span[@class='a-price-whole']")).getText();
		System.out.println("The first product price is :"+price);
		
		//Print the number of customer ratings for the first displayed product
		ac.click(driver.findElement(By.xpath("(//i[@data-cy='reviews-ratings-slot'])[1]/span"))).pause(1000).perform();
		String starrating = driver.findElement(By.xpath("//h2[@id='acr-popover-title']/span")).getText();
		System.out.println("The customer star rating for first product: " +starrating);
		
		//Click the first text link of the first image
		ac.click(driver.findElement(By.xpath("(//h2[contains(@class,'a-size-medium a-spacing-none a-color-base a-text-normal')]/span)[1]"))).perform();
		Thread.sleep(1000);
		
		//Take a screenshot of the product displayed
	File src = driver.getScreenshotAs(OutputType.FILE);
	File des = new File("./screenshot/oneplusamz.png");
	FileUtils.copyFile(src,des);
	
	//Click the 'Add to Cart' button
	ac.click(driver.findElement(By.id("add-to-cart-button"))).perform();
	Thread.sleep(1000);
	
	//Get the cart subtotal and verify if it is correct
	String subTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	System.out.println("The cart subtotal is: "+subTotal);
	if (price.equals(subTotal)) {
		System.out.println("The price is matching");
	} else {
System.out.println("The price is not matching");
	}
	driver.close();
		

	}

}
