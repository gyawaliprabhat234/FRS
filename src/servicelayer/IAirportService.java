package servicelayer;

import java.util.List;

import model.Airline;
import model.Airport;

public interface IAirportService {
	List<Airport> findAllAirports();

	List<Airline> findAllAirlines();

	Airport findAirportByAirportCode(String airportCode);

	List<Airport> findAirportsByCity(String city);

	List<Airline> findAirlinesByAirportCode(String airportCode);

}
