package com.epam.designprinciples.dip;

public class TicketBookingApp {

	// TicketBookingApp class does not directly instantiate CreditCard or DebitCard classes.
	// Instead it interacts with the PaymentApp class. payment processing are in PaymentApp
	// and TicketBookingApp do not know the specific payment methods used.
	public static void main(String[] args) {
		
		PaymentApp debitCardPayment = new PaymentApp(new DebitCard());
		debitCardPayment.doPayment(4, 50000);
		
		PaymentApp creditCardpayment = new PaymentApp(new CreditCard());
		creditCardpayment.doPayment(2, 43215);
		

	}

}
