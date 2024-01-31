package com.epam.designprinciples.lsp;

public class SmartPhone extends Mobile{
	// Subtypes must be substitutable for their base types without altering the correctness of the program.
// Here Ipod and Mobile both can be used for substituition
	@Override
	public void sendSMS() {
		System.out.println("Sending SMS...");
	}

	@Override
	public void call() {
		System.out.println("Calling...");
	}

	@Override
	public void playVideo(String fileName) {
		System.out.println("Playing Music"+fileName);
	}

	@Override
	public void playMusic(String fileName) {
		System.out.println("Playing video"+fileName);
	}

}
