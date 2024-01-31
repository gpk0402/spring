package com.epam.collections.list.task;

import java.util.ArrayList;
import java.util.List;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		double male_employee_salary = 0;
		int male_employee_count=0;
		double female_employee_salary=0;
		int female_employee_count=0;
		for(Employee emp:employeeList) {
			if (emp.gender.equals("Male")){
				male_employee_salary+=emp.salary;
				male_employee_count+=1;
			}
			else {
				female_employee_salary+=emp.salary;
				female_employee_count+=1;
			}
			
		}
		float male_employees_average_salary= (float)male_employee_salary/male_employee_count;
		float female_employees_average_salary= (float)female_employee_salary/female_employee_count;
		
		System.out.println("Average salary of male Employees is: "+male_employees_average_salary);
		System.out.println("Average salary of female Employees is: "+female_employees_average_salary);

	}

}