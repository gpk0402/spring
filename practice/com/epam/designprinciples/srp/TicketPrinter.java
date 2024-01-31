package com.epam.designprinciples.srp;

public class TicketPrinter {
	
	private ReservationService service;

	public TicketPrinter(ReservationService service) {
		super();
		this.service = service;
	}
	public void printTicket() {
		//code to print ticket
		System.out.println("Booked Ticker Details:");
	}

}
