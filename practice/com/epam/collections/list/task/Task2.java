package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
        

		List<String> departmentNames = new ArrayList<String>();
		for(Employee emp:employeeList) {
			if (departmentNames.contains(emp.department)) {
				continue;
			}
			else
				departmentNames.add(emp.department);
		}
		System.out.println("DEpartments in the organisation: "+departmentNames);

	}

}
