package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marathon {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver pvr = new ChromeDriver();
		pvr.manage().window().maximize();
		pvr.navigate().to("https://www.pvrcinemas.com/");
		pvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//pvr.findElement(By.xpath("//h6[text()='Chennai']")).click();
	//	Thread.sleep(2000);
		pvr.findElement(By.xpath("//span[text()='Cinema']")).click();
		pvr.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		Thread.sleep(1000);
		
		pvr.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai'][1]")).click();
		Thread.sleep(1000);
		
		pvr.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1000);
		
		pvr.findElement(By.xpath("//span[text()='HOW TO TRAIN YOUR DRAGON']")).click();
		Thread.sleep(1000);
		
		pvr.findElement(By.xpath("(//span[text()='10:40 PM'])[1]")).click();
		Thread.sleep(1000);
		
		pvr.findElement(By.xpath("//button[@class='p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn']/span[text()='Book']")).click();
		Thread.sleep(1000);
		pvr.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click();
		pvr.findElement(By.id("CL.CLUB|H:4")).click();
		pvr.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		String seatno = pvr.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("The seat number is " + seatno);
		String grandtotal=pvr.findElement(By.xpath("//span[text()='255.40']")).getText();
		System.out.println("The grand total is "+grandtotal);
		
		pvr.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(1000);
		pvr.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String Title = pvr.getTitle();
		System.out.println("The displayed title page is "+Title);
		pvr.close();
	
	}

}
