package repository.implementation;

import java.util.Hashtable;

import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;
import repository.interfaces.ITicketRepository;

public class TicketRepoImpl implements ITicketRepository {
	private Hashtable<String, Ticket> tickets;
	
	TicketRepoImpl(){
		tickets = new Hashtable<>();
	}
	
	@Override
	public boolean generateTicket(Passenger passenger, FlightInstance instance, Reservation reservation) {
		
		return false;
	}

}
