package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.Comparator;
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
		Employee employee1 = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.findFirst().orElse(null);

		System.out.println("Highest paid employee is: "+employee);

		
		
	
	}

}
