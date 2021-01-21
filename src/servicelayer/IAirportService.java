package servicelayer;

import java.util.List;

import model.Airline;
import model.Airport;

public interface IAirportService {
	boolean addAirport(Airport airport);
	
	boolean addAirline(Airline airline);

	boolean removeAirport(Airport airport);
	

	List<Airport> findAllAirports();

	List<Airline> findAllAirlines();

	Airport findAirportByAirportCode(String airportCode);

	List<Airport> findAirportsByCity(String city);

	List<Airline> findAirlinesFlyingOut(String airportCode);

}
