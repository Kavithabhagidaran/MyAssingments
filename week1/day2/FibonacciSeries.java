package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=8;
		int f=0;
		int s=1;
		int t;
		System.out.print("The Fibonacci Series is- ");

		for (int i = 1; i <=range; i++) {
			
			System.out.print(" "+f);
			
			t=f+s;
			f=s;
			s=t;
			
		}
			
		}

	}


