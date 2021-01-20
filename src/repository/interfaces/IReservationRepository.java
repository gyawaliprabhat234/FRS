package repository.interfaces;

import java.util.List;

import model.Agent;
import model.Passenger;
import model.Reservation;

public interface IReservationRepository {
	boolean addReservation(Reservation reservation);

	boolean removeReservation(Reservation reservation);

	List<Reservation> findReservationsByPassengerId(Passenger passenger);
	
	List<Reservation> findReservationByAgent(Agent agent);
}
