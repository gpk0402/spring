package com.epam.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000, Color.RED));
        employees.add(new Employee(2, "Alice", 60000, Color.BLUE));
        employees.add(new Employee(3, "Bob", 70000,  Color.GREEN));
        employees.add(new Employee(4, "Emily", 55000,  Color.RED));
        employees.add(new Employee(5, "David", 65000,  Color.RED));

        // Use stream to filter employees with favorite color RED, convert their names to uppercase
        List<String> modifiedEmployees = employees.stream()
                .filter(employee -> employee.getFavoriteColor() == Color.RED)
                .map(employee -> {
//                    employee.setName(employee.getName().toUpperCase());
                    return employee.getName().toUpperCase();
//                    return employee;
                })
                .collect(Collectors.toList());

        // Print the modified employees
        System.out.println("Modified employees with favorite color RED:");
        modifiedEmployees.forEach(System.out::println);
    }
}

