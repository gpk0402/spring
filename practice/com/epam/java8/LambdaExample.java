package com.epam.java8;
@FunctionalInterface
interface Shape{
    void draw();
}

// Lambda is an anonymous function with no name and doesn't belong to any class.
// Lambda Expression is a way of implementing functional interfaces
public class LambdaExample {
    public static void main(String[] args) {
        // java compiler automatically infers the return type, so no need to mention while writing.
        Shape rectangle = ()-> {System.out.println("Drawing Rectangle");};
        rectangle.draw();

        // we can even remove the curly braces if only one statement is present.
        Shape square = () -> System.out.println("Drawing square");
        square.draw();

        // passing the lambda
        write(square);
        // Here we are passing the behaviour to the method. This is called as functional programming
        write(()-> System.out.println("Drawing circle"));
    }

    // Lambda can be passed as a method parementer also
    private static void write(Shape shape){
        shape.draw();
    }

}