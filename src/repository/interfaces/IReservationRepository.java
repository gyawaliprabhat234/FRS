package repository.interfaces;

import java.util.List;

import model.Agent;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;

public interface IReservationRepository {
	boolean addReservation(Reservation reservation);

	boolean removeReservation(Reservation reservation);

	Reservation getReservationByCode(String code);


}
