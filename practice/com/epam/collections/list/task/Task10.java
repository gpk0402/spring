package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		int sales_and_marketing_males_count=0;
		int sales_and_marketing_females_count=0;
		for(Employee emp:employeeList) {
			if (emp.department.equals("Product Development")) {
				if (emp.gender.equals("Male")) {
					sales_and_marketing_males_count+=1;
				}
				else {
					sales_and_marketing_females_count+=1;
				}
			}
		}

		System.out.println("The number of male employees in Sales And Marketing team are: "+ sales_and_marketing_males_count);
		System.out.println("The number of female employees in Sales And Marketing team are: "+ sales_and_marketing_females_count);
	}

	
}
