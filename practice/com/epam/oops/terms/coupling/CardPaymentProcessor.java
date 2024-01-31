package com.epam.oops.terms.coupling;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {

        System.out.println("Processing card payment...");
    }
}
