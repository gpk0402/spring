package com.epam.designprinciples.ocp;

public class WhatsAppNotificatioService implements NotificationService{
	@Override
	public void sendOtp(String medium) {
		// code to send otp to whats app
		System.out.println("Otp is sent to Whats app");
		
		
	}

}
