package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		Employee employee = new Employee(0,"",0,"","",Integer.MAX_VALUE,0);
		for(Employee emp:employeeList)
			if (emp.yearOfJoining<employee.yearOfJoining)
				employee=emp;
		System.out.println("The details of the most experienced employee in the organisation are:");
		System.out.println(employee);
	}

	
}
