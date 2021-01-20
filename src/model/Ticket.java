package model;

import java.util.UUID;

import utility.Generator;

public class Ticket {
	private String number;
	private Reservation reservation;
	private Passenger passenger;
	private FlightInstance flightInstance;

	public Ticket(Reservation reservation, Passenger passenger, FlightInstance flightInstance) {
		super();
		this.number = Generator.genTicketNumber();
		this.reservation = reservation;
		this.passenger = passenger;
		passenger.addTicket(this);
		this.flightInstance = flightInstance;
	}

	public String getId() {
		return number;
	}

	public void setNumber(String number) {
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

	@Override
	public String toString() {
		String str = "\n Ticket Number: " + this.getId();
		str += "\nPassenger Info : " + this.passenger.toString();
		str += "\n Flight Info :" + this.flightInstance.toString();
		return str;
	}

}
