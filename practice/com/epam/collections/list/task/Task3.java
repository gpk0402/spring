package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		int male_employee_ages = 0;
		int male_employee_count=0;
		int female_employee_ages=0;
		int female_employee_count=0;
		for(Employee emp:employeeList) {
			if (emp.gender.equals("Male")){
				male_employee_ages+=emp.age;
				male_employee_count+=1;
			}
			else {
				female_employee_ages+=emp.age;
				female_employee_count+=1;
			}
			
		}
		float male_employees_average_age= (float)male_employee_ages/male_employee_count;
		float female_employees_average_age= (float)female_employee_ages/female_employee_count;
		
		System.out.println("Average age of male Employees is: "+male_employees_average_age);
		System.out.println("Average age of female Employees is: "+female_employees_average_age);

	}

}