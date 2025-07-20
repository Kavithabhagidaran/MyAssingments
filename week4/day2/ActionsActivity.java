package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsActivity {
	public static void main(String[] args) throws IOException {
		
		//Launch the driver and URL
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Perform scroll down mouse action
		Actions ac = new Actions(driver);
		ac.scrollToElement(driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"))).perform();
		
		//print the text
		String text = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']")).getText();
		System.out.println("The displayed text is: "+text);
		
		//Take screenshot and store it in a folder
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/amazonscreenshot.png");
		FileUtils.copyFile(src, des);
		
		driver.quit();
	}

}
