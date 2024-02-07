package com.epam.java8.predefinedfunint;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer consumer = new ConsumerImpl();
//        consumer.accept("prasanth");

        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("prasanth");
    }
}
