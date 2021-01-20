package repository;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import model.Airline;
import model.Airport;
import model.Flight;
import model.Passenger;
import model.Reservation;

public class ReservationSystemRepositoryImpl implements ReservationSystemRepository {

	private Hashtable<String, Airport> airports = new Hashtable<>();
	private Hashtable<String, Airline> airlines = new Hashtable<>();
	private Hashtable<String, Flight> flights = new Hashtable<String, Flight>();

	ReservationSystemRepositoryImpl() {
		super();
		setupAirports();
	}

	private void setupAirports() {

		Airport airport;

//		airport = new Airport("CID", "Eastern Iowa Airport", new Address());
//		airports.put(airport.getId(), airport);
//		
//		airport = new Airport("ORD", "Chicago O'Hare International Airport", new Address());
//		airports.put(airport.getId(), airport);
//		
//		airport = new Airport("CLT", "Charlotte Douglas International Airport", new Address());
//		airports.put(airport.getId(), airport);

	}

	@Override
	public List<Airport> findAllAirports() {
		// return airports.values();
		return List.copyOf(airports.values());
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		return airports.get(airportCode.toUpperCase());

	}

	@Override
	public List<Airport> findAirportsByCity(String city) {
		List<Airport> airports = new ArrayList<>();
		for (Airport airport : findAllAirports()) {
			if (airport.getAddress().getCity().equalsIgnoreCase(city)) {
				airports.add(airport);
			}
		}
		return airports;
	}

	@Override
	public List<Airline> findAirlinesByAirportCode(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> findFlightsFromTo(String departure, String arrival) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findReservationsByPassengerId(Integer passengerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> findPassengersByAgentCode(String agentCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAirport(Airport airport) {
		airports.put(airport.getCode(), airport);

	}

}
