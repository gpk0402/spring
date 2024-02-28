package com.epam.collections.list.task;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();

		List<Employee> emoloyees_after_2015 = new ArrayList<Employee>();
		for(Employee emp:employeeList) {
			if (emp.yearOfJoining>2015)
				emoloyees_after_2015.add(emp);
		}
		System.out.println("Details of all employees who joined after 2015 are:");
		
		Iterator<Employee> iter = emoloyees_after_2015.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());

		ListIterator<Employee> listIterator = emoloyees_after_2015.listIterator();
	}

}
