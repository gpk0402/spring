package com.epam.java8.methodreference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void write(String input);
}
public class MethodReferenceDemo {

    public void display(String message){
        System.out.println(message.toUpperCase());
    }

    public static int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        // Method Reference to a static method
        Function<Integer,Double> function = input->Math.sqrt(input);
        System.out.println(function.apply(4));
        // Method Reference
        // No need to write any arguments or any return
        Function<Integer,Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        BiFunction<Integer, Integer, Integer> biFunctionLambda = MethodReferenceDemo::addition;
        System.out.println(biFunctionLambda.apply(10,20));

        // 2. Method Reference to an instance method of an object
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        // lambda
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.write("prasanth");
        // method refernce
        Printable printableMethodRef = methodReferenceDemo::display;
        printableMethodRef.write("prasanth");

        // 3. Method reference for instance method of an arbitrary object
        Function<String,String> stringFunction = (input) -> input.toUpperCase();
        System.out.println(stringFunction.apply("prasanth"));

        // method reference
        Function<String,String> stringFunctionMethodRef = String::toUpperCase;
        stringFunctionMethodRef.apply("prasanth");

        // 4. Method Reference to a consructor
        List<String> fruitsList = Arrays.asList("banana","apple","guava");
        Function<List<String>, Set<String>> functionSet = list -> new HashSet<>(list);
        System.out.println(functionSet.apply(fruitsList));

        // method reference
        Function<List<String>,Set<String>> functionSetMethodRef = HashSet::new;
        System.out.println(functionSetMethodRef.apply(fruitsList));
    }


}
