package week2.day5;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMarathon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver amz=new ChromeDriver();
		amz.manage().window().maximize();
		amz.navigate().to("https://www.amazon.in/");
		amz.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		amz.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		Thread.sleep(1000);

		amz.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		Thread.sleep(1000);
		String result = amz.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[1]")).getText();
		System.out.println("The total number of results :  "+result);
		amz.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i)[3]")).click();
		Thread.sleep(1000);
		amz.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//i)[5]")).click();
		Thread.sleep(1000);
		amz.findElement(By.xpath("//span[text()='Featured']")).click();
		Thread.sleep(1000);
		amz.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(1000);
		String name = amz.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])[1]/span")).getText();
		String	amt = amz.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();

		System.out.println("The first resulting bag info : " +name + " and "  +amt);
		String title = amz.getTitle();
		
		System.out.println("The page title is "+title);
		Thread .sleep(1000);
		amz.close();
	}

}
