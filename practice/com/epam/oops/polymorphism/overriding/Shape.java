package com.epam.oops.polymorphism.overriding;

// Base class
public class Shape { // Interface can also be used in the place of class with the same result
    protected String type = "General Shape";
    public void draw() {
        System.out.println("Shape");
    }
    // Final method that cannot be overridden by subclasses
    public final void finalMethod() {
        System.out.println("This is a final method from Shape:: Parent");
    }

}

// Derived class 1
class Circle extends Shape {
    protected String type = "circle";
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    // we get a compile time error if we try to override a final method
//    public final void finalMethod() {
//        System.out.println("This is a final method");
//    }
}

// Derived class 2
class Square extends Shape {
    protected String type = "square";
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

class TestOverriding {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        // The draw() method from parent class is choosen at runtime
        shape1.draw();  // Output: Drawing a circle
        shape2.draw();  // Output: Drawing a square

        // clearly the variables in the parent class cannont be overriddern
        // Even though the objects are instantiated to Circle and Square but the reference of them is Shape
        // Hence "type" from parent will be printed out
        System.out.println(shape1.type);  // Output: General Shape
        System.out.println(shape2.type);  // Output: General Shape

        shape1.finalMethod();
    }
}