package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		Employee employee = new Employee(0,"",0,"","",0,0);
		for(Employee emp:employeeList) {
			if (emp.salary>employee.salary) {
				employee=emp;
			}
			
		}
		System.out.println("Highest paid employee is: "+employee);

		
		
	
	}

}
