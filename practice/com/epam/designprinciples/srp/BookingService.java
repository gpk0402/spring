package com.epam.designprinciples.srp;

public class BookingService {
	private ReservationService service;

	public BookingService(ReservationService service) {
		this.service = service;
	}
	
	public String bookTicket(int numberOfSeats) {
		// booking the ticket
		return "Ticket Booked";
	}

	

}
