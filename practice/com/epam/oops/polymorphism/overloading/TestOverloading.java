package com.epam.oops.polymorphism.overloading;

public class TestOverloading{
    public static void main(String[] args){
        System.out.println("From main method: public static void main(String[] args)");
        // change arguments count
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));

        // change argument types
        System.out.println(Adder.add(11.2f,13.5f));
    }
    // overloading the main method
    // overloading main method is possible but JVM only calls main method with String array as arguments
    public static void main(String args){
        System.out.println("From main method: public static void main(String args)");
    }

    public static void main(){
        System.out.println("From main method with no args: public static void main()");
    }
}

