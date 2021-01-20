package repository.interfaces;

import java.util.List;

import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;

public interface ITicketRepository {

	boolean addTicket(Ticket ticket);

	boolean removeTicket(Ticket ticket);

	List<Ticket> getAllTickets();

}
