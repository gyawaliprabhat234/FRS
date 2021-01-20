package servicelayer;

import java.util.ArrayList;
import java.util.List;

import model.Agent;
import model.Flight;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Status;
import model.Ticket;
import model.UserType;
import repository.implementation.DataCollection;

public class ReservationServiceImpl implements IReservationService {
	private DataCollection repository;
	
	public ReservationServiceImpl(DataCollection repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Reservation> findReservationsByPassenger(Passenger passenger) {
		return repository.getPassenger().getPassengerById(passenger.getId()).getReservations();
	}

	@Override
	public List<Passenger> findPassengersByAgentCode(String agentCode) {
		return repository.getAgent().getAgentByCode(agentCode).getPassengers();
	}

	@Override
	public Reservation createReservation(Agent agent, Passenger passenger, List<FlightInstance> flights, UserType user ) {
		Reservation reservation = new Reservation(passenger,agent, flights, user);
		passenger.addReservation(reservation);
		if(repository.getPassenger().getPassengerById(passenger.getId()) == null)
			repository.getPassenger().addPassenger(passenger);
		repository.getReservation().addReservation(reservation);
		return reservation;
		
	}
	
	@Override
	public Reservation createReservation(Passenger passenger, List<FlightInstance> flights) {
		return this.createReservation(null,passenger, flights, UserType.PASSENGER);
	}

	@Override
	public List<Ticket> confirmReservation(String reservationCode) {
		Reservation reservation = repository.getReservation().getReservationByCode(reservationCode);
		reservation.setStatus(Status.CONFIRMED);
		return genTickets(reservation);
	}
	
	@Override
	public List<Ticket> genTickets(Reservation reservation) {
		List<Ticket> tickets = new ArrayList<>();
		for(FlightInstance instance : reservation.getFlightInstances()) {
			Ticket ticket = new Ticket(reservation, reservation.getPassenger(), instance);
			repository.getTicket().addTicket(ticket);
			tickets.add(ticket);
		}
		return tickets;
	}

	@Override
	public Reservation cancelReservation(String reservationCode) {
		Reservation reservation = repository.getReservation().getReservationByCode(reservationCode);
		reservation.setStatus(Status.CANCELLED);
		return reservation;
	}

	

}
