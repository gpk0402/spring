package com.epam.oops.terms.coupling;

public class CashPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment...");
    }
}
