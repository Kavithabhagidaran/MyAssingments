package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkInterface {

	public static void main(String[] args) throws InterruptedException {
		
		//launching driver and url
		ChromeDriver amz=new ChromeDriver();
		amz.manage().window().maximize();
		amz.navigate().to("https://www.amazon.in/");
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search for phones
		amz.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		amz.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		
		//getting common locator to fetch the price and print the prices
		
		List<Integer> lowestPrice = new ArrayList<Integer>();
		List<WebElement> pricelist = amz.findElements(By.className("a-price-whole"));
		int numberOfPhonesPrices = pricelist.size();
		System.out.println("Number of Prices "+numberOfPhonesPrices);
		
		for (WebElement list : pricelist) {
			lowestPrice.add(Integer.parseInt(list.getText().replace(",", "")));
			
		}
		Collections.sort(lowestPrice);
		System.out.println(lowestPrice);
		System.out.println("LowestPrice is :"+lowestPrice.get(0));
		
		
		
	}}


