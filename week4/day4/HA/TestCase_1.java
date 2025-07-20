package week4.day4.HA;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase_1 extends ProjectSpecificMethod {
	@Test
	public void TC001() {
		
		//Enter Name as 'Salesforce Automation by *Your Name*'
		driver.findElement(By.xpath("//input[contains(@name,'Name')]")).sendKeys("Salesforce Automation by Kavitha");
		
		//Click save
		driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")).click();
		
		//verify Legal Entity Name
		String text = driver.findElement(By.xpath("(//span[contains(@class,'test-id__field-value')])[1]")).getText();
		System.out.println(text);
		if (text.contains("Kavitha")) {
			System.out.println("Legal Entity Name Verified");
		} else {
			System.out.println("Enter the correct name");
		}
		
	}

}
