package com.epam.oops.polymorphism.overloading;

public class Adder {
    static int add(int a, int b) {
        return a + b;
    }
    // change in number of arguments only
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    // change in argument types
    static float add(float a, float b){
        return a+b;
    }

    // change in only return type but not in argument type and count
    // The below is not possible since it raises an ambiguity and gives below compile time error(method add(int,int) is already defined in class)
//    static float add(int a, int b){
//        return a+b;
//    }

}
