package com.epam.oops.terms.aggregation;

public class Employee {
    private String name;
    private int employeeId;
    private Address address;  // Aggregation: Employee "has-a" relationship with Address

    public Employee(String name, int employeeId, Address address) {
        this.name = name;
        this.employeeId = employeeId;
        this.address = address;
        // composition
        // this.address = new Address(street, city, code)
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Address getAddress() {
        return address;
    }

}
