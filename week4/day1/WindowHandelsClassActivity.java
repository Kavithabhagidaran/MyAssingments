package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelsClassActivity {

	public static void main(String[] args) {
		
		
		//Initialize ChromeDriver and Load the URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/");
		
		//Add an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the IRCTC webpage and click on the "FLIGHTS" link.
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		//Get windows list
		Set<String> activeWindowsFromBrowsers = driver.getWindowHandles();
		
		List<String> shiftWindow= new ArrayList<String>(activeWindowsFromBrowsers);
		
		//shift the focus to new window
		WebDriver newWindow = driver.switchTo().window(shiftWindow.get(1));
		
		//print title of new window
		System.out.println("The Title of New Window is: "+newWindow.getTitle());
		
		//close the parent window
		driver.switchTo().window(shiftWindow.get(0));
		driver.close();		
	}

}
