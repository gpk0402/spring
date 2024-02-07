package com.epam.exceptionhandling.methodoverriding;

class Parent {

    // SuperClass declare any exception
    void method() throws RuntimeException{
        System.out.println("SuperClass");
    }
}
class Child extends Parent{
//    // SubClass declaring an exception which are not a child exception of Super class method exception
//    void method() throws Exception {
//
//        // Exception is not a child exception of the RuntimeException
//        // So the compiler will give an error
//
//        System.out.println("SubClass");
//    }

//    // SubClass declaring an exception which are child exception of Super class method exception
//    void method() throws ArithmeticException {
//
//        // ArthemeticException is a child exception of the RuntimeException
//        // So the compiler will not give an error
//
//        System.out.println("SubClass");
//    }

    // SubClass not declaring any exception
    void method() {
        // The compiler will not give an error
        System.out.println("SubClass");
    }

}
public class Demo2 {
    public static void main(String args[]) {
        Parent p = new Child();
        p.method();
    }
}
