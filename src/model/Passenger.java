package model;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {
	private List<Ticket> tickets;
	private List<Reservation> reservations;
	public Passenger( String lname, String fname, String email, Address address) {
		super( lname, fname, email, address);
		reservations = new ArrayList<>();
		tickets = new ArrayList<>();
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
