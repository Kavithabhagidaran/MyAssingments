package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver fb = new ChromeDriver();
		fb.navigate().to("https://en-gb.facebook.com/");
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		fb.findElement(By.linkText("Create new account")).click();
		fb.findElement(By.name("firstname")).sendKeys("AAru");
		fb.findElement(By.name("lastname")).sendKeys("dran");
		fb.findElement(By.name("reg_email__")).sendKeys("aaru@gmail.com");
		fb.findElement(By.name("reg_passwd__")).sendKeys("1234567890");
		
		WebElement day = fb.findElement(By.id("day"));
		Select dd1 = new Select(day);
		dd1.selectByValue("16");
		Thread.sleep(1000);
		
		WebElement month = fb.findElement(By.id("month"));
		Select dd2 = new Select(month);
		dd2.selectByVisibleText("Nov");
		Thread.sleep(1000);
		
		WebElement year = fb.findElement(By.id("year"));
		Select dd3 = new Select(year);
		dd3.selectByVisibleText("1997");
		Thread.sleep(1000);
		
		fb.findElement(By.id("sex")).click();
		Thread.sleep(1000);
		
		fb.manage().window().fullscreen();
		fb.close();
		
		
		
	}

}
