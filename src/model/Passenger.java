package model;

import java.util.List;

public class Passenger extends Person {
	private List<Ticket> tickets;
	private List<Reservation> reservations;
	public Passenger(String id, String lname, String fname, String email, Address address) {
		super(id, lname, fname, email, address);
	}
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}
	
	public List<Reservation> getReservations(){
		return this.reservations;
	}
}
