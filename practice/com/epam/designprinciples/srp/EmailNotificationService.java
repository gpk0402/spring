package com.epam.designprinciples.srp;

public class EmailNotificationService implements OtpSender{

	@Override
	public void sendOtp(String medium) {
		// code to send otp to email
		System.out.println("Otp is sent to Email");
		
	}
	

}
