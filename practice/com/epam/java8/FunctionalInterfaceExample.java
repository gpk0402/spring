package com.epam.java8;

// An interface with only one abstract method is functional interface
// Any number of static or default methods are allowed
@FunctionalInterface
public interface FunctionalInterfaceExample {
    void execute();

    default void write(String text){
        System.out.println(text);
    }

    static void write(String text, int number ){
        System.out.println(text+ " "+ number);
    }
}
