package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		//Declare an array
		
		Integer[] arr= {1, 2, 3, 4, 10, 6, 8};
		
		//array to list
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		//sorting
		Collections.sort(list);
		
		//looping to check the sequence of numbers
		System.out.println("The missing numbers are:\n");
			for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i)!=i+1) {
				list.add(i,i+1);
				
				System.out.println(list.get(i));
			}
			
		}

	}}


