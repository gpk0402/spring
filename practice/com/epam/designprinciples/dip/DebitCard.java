package com.epam.designprinciples.dip;

public class DebitCard implements Payment{
	public void doTransaction(int amount) {
		System.out.println("transaction done with DebitCard");
	}
}
