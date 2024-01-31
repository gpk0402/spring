package com.epam.designprinciples.srp;

public class SearchBus {
	private String source;
	private String destination;

	public String SearchBus(String source, String destination) {
		this.source = source;
		this.destination = destination;
		// code to search bus
		return "Bus Found";
	}
	

}
