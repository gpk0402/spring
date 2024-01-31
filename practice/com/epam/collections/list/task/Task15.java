package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		Employee employee = new Employee(0,"",Integer.MIN_VALUE,"","",0,0);
		for(Employee emp:employeeList)
			if (emp.age>employee.age)
				employee=emp;
		
		System.out.println("The age of oldest employee is: "+employee.age+" and his/her department is: "+employee.department);
	}

	
}
