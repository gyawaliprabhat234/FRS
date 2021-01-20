package repository.implementation;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import model.Agent;
import model.Airline;
import model.Airport;
import model.Crew;
import model.Flight;
import model.FlightInstance;
import model.Passenger;
import model.Pilot;
import model.Reservation;
import model.Ticket;
import repository.interfaces.IAgentRepository;
import repository.interfaces.IAirlineRepository;
import repository.interfaces.IAirportRepository;
import repository.interfaces.ICrewRepository;
import repository.interfaces.IFlightInstanceRepository;
import repository.interfaces.IFlightRepository;
import repository.interfaces.IPassengerRepository;
import repository.interfaces.IPilotRepository;
import repository.interfaces.IReservationRepository;
import repository.interfaces.ITicketRepository;

public final class DataCollection {

	private static IAirlineRepository airline ;
	private static IAirportRepository airport;
	private static ICrewRepository crew;
	private static IFlightInstanceRepository flightInstance ;
	private static IFlightRepository flight;
	private static IPassengerRepository passenger;
	private static IPilotRepository pilot;
	private static IReservationRepository reservation;
	private static ITicketRepository ticket;
	private static IAgentRepository agent;

	DataCollection() {
		airline = new AirlineRepoImpl();
		airport = new AirportRepoImpl();
		crew = new CrewRepoImpl();
		flightInstance = new FlightInstanceRepoImpl();
		flight = new FlightRepoImpl();
		passenger = new PassengerRepoImpl();
		pilot = new PilotRepoImpl();
		reservation = new ReservationRepoImpl();
		ticket = new TicketRepoImpl();
		agent = new AgentRepoImpl();

	}

	public IAirlineRepository getAirline() {
		return airline;
	}

	public IAirportRepository getAirport() {
		return airport;
	}

	public ICrewRepository getCrew() {
		return crew;
	}

	public IFlightInstanceRepository getFlightInstance() {
		return flightInstance;
	}

	public IFlightRepository getFlight() {
		return flight;
	}

	public IPassengerRepository getPassenger() {
		return passenger;
	}

	public IPilotRepository getPilot() {
		return pilot;
	}

	public IReservationRepository getReservation() {
		return reservation;
	}

	public ITicketRepository getTicket() {
		return ticket;
	}
	public IAgentRepository getAgent() {
		return agent;
	}

}
