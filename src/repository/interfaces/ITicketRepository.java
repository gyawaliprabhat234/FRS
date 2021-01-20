package repository.interfaces;

import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;

public interface ITicketRepository {
	
	boolean generateTicket(Passenger passenger, FlightInstance instance, Reservation reservation);
}
