package com.epam.designprinciples.srp;

public class PersonalAccidentInsurance implements TravelInsurance{

	@Override
	public void getTravelInsuranceInfo(int ticketId) {
		System.out.println("Personal Accident insurance coverage details are...");
		
	}

}
