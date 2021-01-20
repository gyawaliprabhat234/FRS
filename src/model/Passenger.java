package model;

import java.util.List;

public class Passenger extends Person {
	private List<Ticket> tickets;
	private List<Reservation> reservations;
	public Passenger(String id, String lname, String fname, String email) {
		super(id, lname, fname, email);
	}
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}

}
