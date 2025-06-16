package week1.day3;

public class Browser {
	
	 String launchBrowser(String browserName){
		 
	 System.out.println(browserName +" Launched Successfully");
		return(browserName);
	}
	
	 void loadUrl()
	{System.out.println("Application url loaded successfully");
	
	}
	public static void main(String[] args) {
		
		Browser brw = new Browser();
		brw.launchBrowser("Chrome");
		brw.loadUrl();
	}

}
