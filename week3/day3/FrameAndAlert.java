package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlert {
	public static void main(String[] args) {
		
		//launch the driver and load the url
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//click tryit 
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		//handel alert
		Alert alert = driver.switchTo().alert();
		
		//handel alert action
		//alert.accept();
		alert.dismiss();
		
		//confirming the text
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
		//verification
		if (text.contains("pressed")) {
			System.out.println("Action performed correctly");
		}
		
	}

}
