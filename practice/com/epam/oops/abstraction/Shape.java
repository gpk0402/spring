package com.epam.oops.abstraction;

public abstract class Shape {// if one method in a class is abstract then the class must be absstract and vice versa is not true
                                                    // we can have but does not make any sense
                            // similarly an abstarct class or method cannot also be final because final classes cannot be implemented
    protected String type;
    public Shape(String type) {
        this.type = type;
    }

    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Concrete method in the abstract class
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Area: " + calculateArea());
    }
}
