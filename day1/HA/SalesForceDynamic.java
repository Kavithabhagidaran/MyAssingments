package week5.day1.HA;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamic extends ProjectSpecificMethod {
	
	@DataProvider(name = "getData")
	
	public String[][] sendData() {
		
	String data[][]=new String[1][3];
	data[0][0]="Salesforce Automation by Kavitha";
	data[0][1]="TestLeaf";
	data[0][2]="Salesforces";
	return data;
		
	}
	
	@Test(dataProvider = "getData")
	public void TC001(String fname, String cname, String desc) throws InterruptedException {
		
		//Enter Name as 'Salesforce Automation by *Your Name*'
		driver.findElement(By.xpath("//input[contains(@name,'Name')]")).sendKeys(fname);
		
		//Enter the Company name as'TestLeaf'.
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(cname);
				
		//Enter Description as 'Salesforces
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(desc);
		Thread.sleep(5000);

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

