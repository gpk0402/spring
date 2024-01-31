package com.epam.collections.collectionstask;

import java.util.*;


public class Task8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> employeesList = new ArrayList<>();
		employeesList.add("Sanvi Pandey");
		employeesList.add("Paul Niksui");
		employeesList.add("Manu Sharma");
		employeesList.add("Amelia Zoe");
		employeesList.add("Nitin Joshi");
		employeesList.add("Ali Baig");
		employeesList.add("Anuj Chettiar");
		

		Collections.sort(employeesList,Collections.reverseOrder());
		System.out.println("Reversed employee list is: "+employeesList);
		
	}
}
