package week4.day4.HA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_2 extends ProjectSpecificMethod {
	
	@Test
	public  void TC002() throws InterruptedException {
		
	//Enter the Company name as'TestLeaf'.
		
	driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
	
	//Enter the Company name as'TestLeaf'.
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
	Thread.sleep(5000);

	//Move to dropdown
	WebElement element = driver.findElement(By.xpath("//span[@class='slds-truncate' and @part='input-button-value']"));
	driver.executeScript("arguments[0].click()", element);
	driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
	
	//Select Status as 'Active'
	driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_brand')]")).click();
	
	//Close the popup
	driver.findElement(By.xpath("(//*[@data-key='close'])[2]")).click();
	String text = driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__help slds-m-left_none')])[2]")).getText();
	System.out.println(text);
	if (!text.equalsIgnoreCase("Complete this field")) {
		System.out.println("The Alert message is verified");
		
	} else {
		System.out.println("The Alert message is not verified");

	}
}

	
	
}
