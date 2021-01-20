package servicelayer;

import java.util.List;

import model.Agent;
import model.Flight;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;
import model.UserType;

public interface IReservationService {
	
	List<Reservation> findReservationsByPassenger(Passenger passenger);

	List<Passenger> findPassengersByAgentCode(String agentCode);

	Reservation createReservation(Passenger passenger, List<FlightInstance> flights);

	Reservation createReservation(Agent agent, Passenger passenger, List<FlightInstance> flights, UserType userType);

	List<Ticket> confirmReservation(String reservationCode);
	
	Reservation cancelReservation(String reservationCode);
	
	List<Ticket> genTickets(Reservation reservation);
}
