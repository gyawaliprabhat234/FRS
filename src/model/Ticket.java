package model;

import java.util.UUID;

public class Ticket {
	private String id;
	private long number;
	private Reservation reservation;
	private Passenger passenger;
	private FlightInstance flightInstance;
	
	
	public Ticket(String id, long number, Reservation reservation, Passenger passenger, FlightInstance flightInstance) {
		super();
		this.id = UUID.randomUUID().toString();
		this.number = number;
		this.reservation = reservation;
		this.passenger = passenger;
		this.flightInstance = flightInstance;
	}
	public String getId() {
		return id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public FlightInstance getFlightInstance() {
		return flightInstance;
	}
	public void setFlightInstance(FlightInstance flightInstance) {
		this.flightInstance = flightInstance;
	}
	
	

}
