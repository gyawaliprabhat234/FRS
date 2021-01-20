package servicelayer;

import java.util.List;

import model.Agent;
import model.Flight;
import model.Passenger;
import model.Reservation;

public interface IReservationService {
	
	List<Reservation> findReservationsByPassengerId(Integer passengerId);

	List<Passenger> findPassengersByAgentCode(String agentCode);

	Reservation createReservation(Passenger passenger, List<Flight> flights);

	Reservation createReservation(Agent agent, Passenger passenger, List<Flight> flights);

	void confirmReservation(String reservationCode);

	void confirmReservation(String reservationCode, String agentCode);

	void cancelReservation(String reservationCode);
}
