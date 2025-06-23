package week2.day4;

public class Edge extends Browser {
	
	public void takeSnap() {
		
		System.out.println("Snap taken for "+ browserName +browserVersion );
		
	}
public void clearCookies() {
	System.out.println("cookies cleared");
}
	public static void main(String[] args) {
		Edge e= new Edge();
		e.browserName="Edge ";
		e.browserVersion="v10";
		
	e.openURL();
	e.takeSnap();
	e.clearCookies();
	e.navigateBack();
	e.closeBrowser();
	}

}
