package com.epam.oops.polymorphism.overloading;

public class OverloadingImp {
    void sum(int a,long b){
        System.out.println("int,long arg method invoked");
        System.out.println(a+b);
    }

    void sum(long a,int b){
        System.out.println("long,int arg method invoked");
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        OverloadingImp obj = new OverloadingImp();
        // we have defined methods with int, long but passing int, int but there is no error
        // because if not match is found (int,int) the second will automatically be promoted to long
        // but if there are two methods with arguments like int,long and long,int there is an ambiguity
        // for selecing the method and raises "java: reference to sum is ambiguous"
//        obj.sum(10,10);
        obj.sum(10,10l);


        // NOTE: type de-promotion is not possible
    }
}
