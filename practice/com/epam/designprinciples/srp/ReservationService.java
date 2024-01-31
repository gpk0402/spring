package com.epam.designprinciples.srp;

public class ReservationService {
	
	private String source;
	private String destination;
	private int numberOfSeats;
	public ReservationService(String source, String destination, int numberOfSeats) {

		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
	}
	

}
