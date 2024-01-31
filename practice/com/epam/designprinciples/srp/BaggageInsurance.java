package com.epam.designprinciples.srp;

public class BaggageInsurance implements TravelInsurance{
	@Override
	public void getTravelInsuranceInfo(int ticketId) {
		System.out.println("Loss of baggage insurance insurance coverage details....");
	}
}
