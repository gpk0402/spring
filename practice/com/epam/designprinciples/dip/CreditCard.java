package com.epam.designprinciples.dip;

public class CreditCard implements Payment{
	public void doTransaction(int amount) {
		System.out.println("transaction done with CreditCard");
	}
}