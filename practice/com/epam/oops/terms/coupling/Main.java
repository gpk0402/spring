package com.epam.oops.terms.coupling;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor cardPaymentProcessor = new CardPaymentProcessor();
        Order order = new Order(cardPaymentProcessor);
        order.processPayment();
    }
}

