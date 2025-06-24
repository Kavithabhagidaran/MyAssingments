package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioLinkInterface {
	public static void main(String[] args) throws InterruptedException {
		
	//launching browser and load the url
	ChromeDriver ajio = new ChromeDriver();
	ajio.manage().window().maximize();
	ajio.navigate().to("https://www.myntra.com/");
	ajio.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	//Search for bags
	ajio.findElement(By.className("desktop-searchBar")).sendKeys("Bags");
	ajio.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	Thread.sleep(1000);
	
	//Click on Men under Gender
	ajio.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	Thread.sleep(1000);
	
	//click on LaptopBags under Category
	ajio.findElement(By.xpath("//label[contains(text(),'Laptop Bag')]")).click();
	Thread.sleep(1000);
	
	//print the count of items found
	String count = ajio.findElement(By.className("title-count")).getText();
	System.out.println("Count of items: "+count);
	
	//print the list of product's brand from the page
	
	List<WebElement> brand = ajio.findElements(By.className("product-brand"));
	System.out.println("\nThe products brandlist from the page:\n");

	for (WebElement brandlist : brand) {
		
		System.out.println( brandlist.getText());
		
	}
	
	//print the list of bags name from the page
	
	List<WebElement> bagname = ajio.findElements(By.xpath("//h4[@class='product-product']"));
	System.out.println("\n\nList of name of the bags from the page:\n");
	for (WebElement namelist : bagname) {
		
		System.out.println(namelist.getText());
	}
	
	
}
	
}