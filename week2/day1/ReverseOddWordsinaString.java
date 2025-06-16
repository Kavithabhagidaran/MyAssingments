package week2.day1;



public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			
			if (i%2!=0) {
				
				char[] odd = split[i].toCharArray();
		
			for (int j = odd.length-1; j >=0; j--) {
			
			System.out.print(odd[j]);
			
			}
		}else {
			System.out.print(" "+split[i]);
		}
	}

}}
