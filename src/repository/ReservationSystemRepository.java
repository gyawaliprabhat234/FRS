package repository;

import java.util.List;

import model.Airline;
import model.Airport;
import model.Flight;
import model.Passenger;
import model.Reservation;

public interface ReservationSystemRepository {
	
	List<Airport> findAllAirports();
	
	Airport findAirportByAirportCode(String airportCode);
	
	List<Airport> findAirportsByCity(String city); // Airport(s) of a city, e.g. Chicago has two major airports
	
	List<Airline> findAirlinesByAirportCode(String airportCode);
	
	List<Flight> findFlightsFromTo(String departure, String arrival);
	
	List<Reservation> findReservationsByPassengerId(Integer passengerId);
	
	List<Passenger> findPassengersByAgentCode(String agentCode);
	
	void addAirport(Airport airport);
	
}
