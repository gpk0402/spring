package com.epam.designprinciples.isp;

public class GooglePayUPI implements Payment,CashBack,ScratchCard{

	@Override
	public Boolean isPaymentSuccessful() {
		return true;
	}

	@Override
	public void getScratchCard() {
		// logic to give a scratch card
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
