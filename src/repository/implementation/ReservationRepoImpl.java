package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Agent;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;
import repository.interfaces.IReservationRepository;

public class ReservationRepoImpl implements IReservationRepository {
	private Hashtable<String, Reservation> reservations;
	
	ReservationRepoImpl(){
		reservations = new Hashtable<>();
	}
	@Override
	public boolean addReservation(Reservation reservation) {
		return reservations.put(reservation.getCode(), reservation) != null;
	}

	@Override
	public boolean removeReservation(Reservation reservation) {
		return reservations.remove(reservation.getCode()) != null;
	}

	@Override
	public Reservation getReservationByCode(String code) {
		return reservations.get(code);
	}
	

}
