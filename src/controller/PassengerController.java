package controller;

import java.util.List;

import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;
import servicelayer.IReservationService;

public class PassengerController {
	private IReservationService reserve;
	public PassengerController(IReservationService service){
		this.reserve = service;
	}
	
	public Reservation makeReservation(Passenger passenger, List<FlightInstance> flightInstances) {	
		return reserve.createReservation(passenger, flightInstances);
	}
	
	public List<Ticket> confirmReservation(String reservationCode){
		return reserve.confirmReservation(reservationCode);
	}

}
