package com.epam.designprinciples.isp;

public class PaytmUPI implements Payment,CashBack{
	// instead of writing scratch card in combined, we wrote in a seperate interface so that it can be omitted in not required
	@Override
	public Boolean isPaymentSuccessful() {
		return true;
	}

	@Override
	public void getCashBackAsCreditBalance() {
		// logic to credit cash back
	}

	@Override
	public void payMoney() {
		// logic to pay money
	}

}
