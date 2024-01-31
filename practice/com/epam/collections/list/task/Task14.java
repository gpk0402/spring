package com.epam.collections.list.task;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		List<Employee> emoloyees_younger_25 = new ArrayList<Employee>();
		List<Employee> emoloyees_older_25 = new ArrayList<Employee>();
		for(Employee emp:employeeList) {
			if (emp.age>25)
				emoloyees_older_25.add(emp);
			else
				emoloyees_younger_25.add(emp);
		}
		
		System.out.println("Details of all employees who are younger than 25:");
		Iterator<Employee> iter = emoloyees_younger_25.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("\n------------------------------------\n");
		System.out.println("Details of all employees who are older than 25:");
		
		Iterator<Employee> iter1 = emoloyees_older_25.iterator();
		while(iter1.hasNext())
			System.out.println(iter1.next());
		
	}

}
