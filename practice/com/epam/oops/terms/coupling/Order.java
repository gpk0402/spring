package com.epam.oops.terms.coupling;

public class Order {

    private PaymentProcessor paymentProcessor;

    public Order(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment() {
//         Tightly coupled
//        Payment payment = new Payment();
//        payment.makePayment();

        // Loosely coupled
        paymentProcessor.processPayment();
    }


}
