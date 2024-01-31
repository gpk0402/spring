package com.epam.designprinciples.dip;

public class PaymentApp {
	// PaymentApp is not directly dependent on specific implementations (CreditCard or DebitCard),
	// but rather on the abstraction (Payment interface)
	private Payment payment;

	public PaymentApp(Payment payment) {
		this.payment = payment;
	}
	
	public void doPayment(int noOfTickets, int amount) {
		payment.doTransaction(amount);
	}

}
