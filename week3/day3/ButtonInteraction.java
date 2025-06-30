package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		
		//Launching browser and leafground url
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/button.xhtml");
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		
		//Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("dashboard")) {
			
			System.out.println("The Title is Verified");
			
		} else {
			
			System.out.println("The Title is not Verified");

		}
		//Navigate to previous page
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		
	WebElement disableButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']/span"));
	if (disableButton.isEnabled()) {
		System.out.println("The Button is disabled");
	}else {
		System.out.println("The Button is enabled");
	}
	
	//Find and print the position of the button with the text ‘Submit.’
	WebElement submitButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']/span[2]"));
	Point location = submitButton.getLocation();
	System.out.println("The position of Submit Button "+location);
	
	//Find and print the background color of the button with the text ‘Find the Save button color.’
	WebElement color = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']/span[2]"));
	String bgColor = color.getCssValue("background-color");
	System.out.println("The Background Color of the button is "+bgColor);
	
	//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
	WebElement hw = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']/span[2]"));
	Dimension size = hw.getSize();
	System.out.println("The Height and Width of this button"+size);
	
	//Close the browser window
	driver.close();
	
	}
	
	
	
}
