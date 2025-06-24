package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		//declare an array
		
		Integer[] arr={3, 2, 11, 4, 6, 7};
		
		//array to list
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(arr));
		
		//sorting
		Collections.sort(list);
		
		//pick second largest element
		
		System.out.println("The second largest number is " +list.get(list.size()-2));

	}

}
