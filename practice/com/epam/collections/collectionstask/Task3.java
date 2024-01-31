package com.epam.collections.collectionstask;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee(1,"Sanvi Pandey"));
		employeesList.add(new Employee(3,"Paul Niksui"));
		employeesList.add(new Employee(4,"Manu Sharma"));
		employeesList.add(new Employee(2,"Amelia Zoe"));
		employeesList.add(new Employee(6,"Nitin Joshi"));
		employeesList.add(new Employee(7,"Ali Baig"));
		employeesList.add(new Employee(5,"Anuj Chettiar"));
		
		Collections.sort(employeesList,new SortString());
		System.out.println(employeesList);

		Collections.sort(employeesList,Collections.reverseOrder());
		System.out.println(employeesList);
		

	}

}
