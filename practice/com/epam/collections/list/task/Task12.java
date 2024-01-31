package com.epam.collections.list.task;

import java.util.*;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		HashMap<String, String> department_employee_names = new HashMap<>();
		for (Employee emp: employeeList) {
			if (department_employee_names.containsKey(emp.department)){
				String names = department_employee_names.get(emp.department)+","+emp.name;
				department_employee_names.put(emp.department, names);
			}
			else {
				department_employee_names.put(emp.department, emp.name);
			}
				
				
		}for (Map.Entry<String, String> names: department_employee_names.entrySet()) {
			System.out.println(names.getKey()+": "+names.getValue());
		}		
	}
}