package com.epam.oops.terms.aggregation;

public class Main {
    public static void main(String[] args) {

        // creating address through the employee class instead in a differnet class demostrates composition(stronger aggregation)
        Address employeeAddress = new Address("gardenst", "guntur", "522002");

        Employee employee = new Employee("gpk", 1, employeeAddress);

        // Accessing Employee details and Address details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());

        // Accessing Address details through Employee
        System.out.println("\nEmployee Address Details:");
        System.out.println("Street: " + employee.getAddress().getStreet());
        System.out.println("City: " + employee.getAddress().getCity());
        System.out.println("Zip Code: " + employee.getAddress().getZipCode());
    }
}
