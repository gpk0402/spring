package com.epam.exceptionhandling.methodoverriding;

import java.io.IOException;

// if super class does not declare any exception
class SuperClass {

    // SuperClass doesn't declare any exception
    void method() {
        System.out.println("SuperClass");
    }
}
class Subclass extends SuperClass{
    // method() declaring Checked Exception
//    void method() throws IOException {
//
//        // IOException is of type Checked Exception
//        // so the compiler will give Error
//
//        System.out.println("SubClass");
//    }
//    with unchecked exception we get no exception i.e., code compiles and runs fine
    void method() throws RuntimeException {

        // RuntimeException is of type unchecked Exception
        // so the compiler will not give Error

        System.out.println("SubClass");
    }

}

public class Demo1 {
    public static void main(String args[]) {
        SuperClass s = new Subclass();
        s.method();
    }
}

