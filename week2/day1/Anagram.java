package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		if (text1.length()==text2.length()) {
			
		char[] ChracterArray1 = text1.toCharArray();
		char[] ChracterArray2 = text2.toCharArray();
		 Arrays.sort(ChracterArray1);
		 Arrays.sort(ChracterArray2);
		
		if (Arrays.equals(ChracterArray1, ChracterArray2)) {
			
			System.out.println("The given strings are Anagram");
			
		} else {

			System.out.println("The given strings are not an Anagram");
		}
			
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

		}

	}

}
