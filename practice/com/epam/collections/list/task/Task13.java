package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		long total_age = 0;
		long employee_count=0;
		for(Employee emp:employeeList) {
			total_age+=emp.age;
			employee_count+=1;
		}
			
		float employees_average_age= (float)total_age/employee_count;
		
		System.out.println("Total age of Employees is: "+total_age);
		System.out.println("Average age of Employees is: "+employees_average_age);

	}

}