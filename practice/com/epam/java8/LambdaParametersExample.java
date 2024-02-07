package com.epam.java8;

@FunctionalInterface
interface Addabable{
    int add(int a, int b);
}
public class LambdaParametersExample {
    public static void main(String[] args) {
        Addabable additon = (int a, int b) -> {
            return a+b;
        };
        int result = additon.add(1,2);
        System.out.println(result);
        // compiler can infer both the parameters type and return type automatically and
        // no need to write return keyword if only one statament is present
        Addabable adding = (a,b) -> a+b;
        result = adding.add(1,2);
        System.out.println(result);
    }
}
