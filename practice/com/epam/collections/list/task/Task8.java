package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		Employee employee = new Employee(0,"",Integer.MAX_VALUE,"","",0,0);
		for(Employee emp:employeeList)
			if (emp.department.equals("Product Development") && emp.gender.equals("Male"))
				if (emp.age<employee.age)
					employee=emp;
		System.out.println("The details of the youngest Male employee in the Production Developement are:");
		System.out.println(employee);
	}

	
}
