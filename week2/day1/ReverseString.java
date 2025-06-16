package week2.day1;



public class ReverseString {

	public static void main(String[] args) {
		
		String companyName="TestLeaf";
		char[] characterArray = companyName.toCharArray();
		int length = companyName.length();
		System.out.println("Reversed name is ");
		for (int i = length-1; i >=0; i--) {
			
					System.out.print(characterArray[i]);
		}
		
		
		
	}

}
