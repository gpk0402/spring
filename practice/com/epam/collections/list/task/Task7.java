package com.epam.collections.list.task;

import java.util.*;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		HashMap<String, Integer> department_employee_count = new HashMap<>();
		for (Employee emp: employeeList) {
			if (department_employee_count.containsKey(emp.department)){
				int count = department_employee_count.get(emp.department)+1;
				department_employee_count.put(emp.department, count);
			}
			else {
				department_employee_count.put(emp.department, 1);
			}
		}
		HashMap<String, Double> department_average_age = new HashMap<>();
		for (Employee emp: employeeList) {
			if (department_average_age.containsKey(emp.department)){
				double count = (Double)department_average_age.get(emp.department)+emp.age;
				department_average_age.put(emp.department, count);
			}
			else {
				department_average_age.put(emp.department, (double)emp.age);
			}
				
				
		}
		for (Map.Entry<String, Double> names: department_average_age.entrySet()) {
			//department_average_age.put(names.getKey(), names.getValue())
			System.out.println(names.getKey()+": "+names.getValue()/department_employee_count.get(names.getKey()));
		}
		System.out.println(department_average_age);
		
	}
}

	
