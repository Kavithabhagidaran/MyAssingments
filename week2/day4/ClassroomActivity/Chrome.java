package week2.day4;

public class Chrome extends Browser{
	
	public void openincognito() {
		System.out.println("cognitive window opened");
	}
public void clearcache() {
	System.out.println("caches are cleared");
}
	public static void main(String[] args) {

		Chrome c= new Chrome();
		c.browserName="Chrome ";
		c.browserVersion="v11";
		
	c.openURL();
	c.openincognito();
	c.clearcache();
	c.navigateBack();
	c.closeBrowser();
		
		
	}

}
