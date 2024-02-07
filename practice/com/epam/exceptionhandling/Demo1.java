package com.epam.exceptionhandling;

// Throwable( is a class) extended by Exception class and Error class
// All exceptions except RuntimeException and Error are checked exceptions
// Because Throwable and Exception contains both checked and unchecked exceptions they are partially checked classes
// JVM handles the exceptions via a run time stack called Call Stack
// default methods provided by Throwable class
public class Demo1 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
            String s = null;
            System.out.println(s.length());
        }
        // multiple catch blocks can be combined incase they perform same handling code.
        // differnt exceptions combined cannot have parent child relationship i.e.,
//        catch (ArithmeticException | Exception e)
        catch (ArithmeticException | NullPointerException e){
            e.printStackTrace(); // prints the whole exception along with the path
            System.out.println(e.toString()); // just gives the exception (name and reason)
            System.out.println(e.getMessage()); // gives the exception message only (just cause)
        }

    }
}
