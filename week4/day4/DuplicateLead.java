package week4.day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class DuplicateLead extends ProjectSpecificMethods {
	@Test
	public  void duplicateLeadModule() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The lead is duplicated ");
	
}
}






