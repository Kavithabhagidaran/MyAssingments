package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Launch the driver
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Load the URL
				driver.navigate().to("https://www.snapdeal.com/"); 

				//Action class
				Actions ac = new Actions(driver);
				
				//Go to "Men's Fashion
				ac.moveToElement(driver.findElement(By.xpath("(//span[@class='catText'])[1]"))).click().perform();
				Thread.sleep(1000);
				
				//Go to "Sports Shoes
				ac.click(driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"))).click().perform();
				Thread.sleep(1000);
				
				//Get the count of sports shoes.
				String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
				System.out.println("The count of Shoes: "+count);
				
				//Click on "Training Shoes
				ac.click(driver.findElement(By.xpath("//div[text()='Training Shoes']"))).perform();
				ac.click(driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"))).perform();
				ac.click(driver.findElement(By.xpath("//li[@class='search-li' and @data-index='1']"))).perform();
				
				//Check if the displayed items are sorted correctly				
				 List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='lfloat marR10']"));
				    List<Integer> priceValues = new ArrayList<>();
			        Thread.sleep(3000);
			        List<Integer> sortedPrices = new ArrayList<>(priceValues);
			        Collections.sort(sortedPrices);

			        if (priceValues.equals(sortedPrices)) {
			            System.out.println("Items are sorted from Low to High.");
			        } else {
			            System.out.println("Items are NOT sorted correctly.");
			        }
				
			        //Select any price range ex:(500-700).
			        WebElement minval = driver.findElement(By.name("fromVal"));
			        minval.clear();
			        minval.sendKeys("500");
			   
			        WebElement maxval = driver.findElement(By.name("toVal"));
			        maxval.clear();
			        maxval.sendKeys("700");
			        ac.click(driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn btn-line btn-theme-secondary')]"))).perform();
			        Thread.sleep(1000);
			        
			        //Filter by any colour.
			        ac.click(driver.findElement(By.xpath("//span[@class='filter-color-tile White&Blue ']"))).perform();
			        Thread.sleep(1000);
			        
			        //Verify all the applied filters
			        List<WebElement> filters = driver.findElements(By.xpath("(//div[@class='filters'])[1]"));
			        if(!filters.contains("filters")) {
			              System.out.println("Applied Filters");
			        }
			        else {
			        	System.out.println("Applied Filters Not Found");
			        }
				
			        //Mouse hover on the first resulting "Training Shoes
			        ac.moveToElement(driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"))).perform();
			        
			        //Click the "Quick View" button
			        ac.click(driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]/div"))).perform();
			        
			        //Print the cost and the discount percentage
			        
			        String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
			        String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
			        System.out.println("The price and discount is:"+ price +"and"+discount);
			        
			        //Take a snapshot of the shoes
			        File src = driver.getScreenshotAs(OutputType.FILE);
			    	File des = new File("./screenshot/snapdealshoes.png");
			    	FileUtils.copyFile(src,des);
			    	
			    	//Close the current window
			    	ac.click(driver.findElement(By.xpath("//div[@class='close close1 marR10']"))).perform();
			    	
			    	//Close the main window.
			    	driver.quit();
	
	}

}
