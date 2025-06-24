package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		//Declaration and initiation
		Integer[] arr1= {3, 2, 11, 4, 6, 7};
		Integer[] arr2= {1, 2, 8, 4, 9, 7};
		
		//Add array to a list
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(arr2));
		
		//Iterate the values through the length of the list
		for (Integer li : list2) {
			if (list1.contains(li)) {
				
				System.out.println(li);
				
			} 
			}
				}
	
	}

