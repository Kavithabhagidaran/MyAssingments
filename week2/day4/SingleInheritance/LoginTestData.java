package week2.day4;


//subclass
public class LoginTestData extends TestData{

	
	//Two methods were implemented in subclass LoginTestData
	private void enterUsername() {
		
		System.out.println("Enter the UserName : admin");

	}
	
	private void enterPassword() {
		
		System.out.println("Enter the Password: 09876");
	}
	
	
	public static void main(String[] args) {
		
		//Initializing objects using the new keyword and test the functionality by calling the methods from superclass
		
		TestData test = new TestData();
		System.out.println("SuperClass-TestData methods");
		test.enterCredentials();
		test.navigateToHomePage();
		
		//Initializing objects using the new keyword and test the functionality by calling the methods from SubClass
		
		LoginTestData login = new LoginTestData();
		System.out.println("\nSubclass-LoginTestData methods");
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();

	}

}
