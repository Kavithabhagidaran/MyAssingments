package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {

		//Array declaration and initiation
		String[] companies={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		//Add collection to the list
		List<String> companyList = new ArrayList<String>(Arrays.asList(companies));
		
		//Arrange the collection in ascending order
		Collections.sort(companyList);
		
		//reverse the Collection
		Collections.reverse(companyList);
	
		//iterate the collection
		
		for (String rvrslist : companyList) {
			System.out.println(rvrslist);		
		
		
		}
	}

	}


