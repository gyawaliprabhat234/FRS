package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;
import repository.interfaces.ITicketRepository;

public class TicketRepoImpl implements ITicketRepository {
	private Hashtable<String, Ticket> tickets;

	TicketRepoImpl() {
		tickets = new Hashtable<>();
	}

	@Override
	public boolean addTicket(Ticket ticket) {
		return tickets.put(ticket.getId(), ticket) != null;
	}

	@Override
	public boolean removeTicket(Ticket ticket) {

		return tickets.remove(ticket.getId()) != null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		return List.copyOf(tickets.values());
	}

}
