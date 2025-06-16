package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] chr = test.toCharArray();
		int len = chr.length;
		for (int i = 0	; i < len; i++) {
			if (i%2!=0) {
			
				chr[i]=Character.toUpperCase(chr[i]);
			}
		}
		System.out.println(chr);
		
	}

}
