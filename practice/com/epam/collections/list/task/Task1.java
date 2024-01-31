package com.epam.collections.list.task;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
//		System.out.println(employeeList);

		int male_count=0;
		int female_count=0;
		
		for(Employee emp:employeeList) {
			if (emp.gender.equals("Male")){
				male_count+=1;
			}
			else
				female_count+=1;
		}
		System.out.println("Number of male Employees are: "+male_count);
		System.out.println("Number of female Employees are: "+female_count);


	}

}
