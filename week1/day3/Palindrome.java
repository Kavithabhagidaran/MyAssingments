package week1.day3;


public class Palindrome {
	
	public static void main(String[] args) {
		
		int input=34567890,output=0,rem;
		
		for (int i = input; i >0; i=i/10) {
			
			rem=i%10;
			output=output*10+rem;
			
		}
			if (input==output) {
				
				System.out.println("The Given Number is a palindrome" );
			}else {
				System.out.println("The Given Number is not a palindrome" );
				
			}
			
		}
		
}
	

