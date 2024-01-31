package com.epam.designprinciples.ocp;

public class EmailNotificationService implements NotificationService{

	@Override
	public void sendOtp(String medium) {
		// code to send otp to email
		System.out.println("Otp is sent to Email");
		
	}
	

}
