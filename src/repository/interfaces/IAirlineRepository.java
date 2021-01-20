package repository.interfaces;

import java.util.List;

import model.Airline;

public interface IAirlineRepository {

	boolean addAirline(Airline airline);

	boolean updateAirline(Airline airline);

	boolean removeAirline(Airline airline);
	
	List<Airline> findAllAirlines();

	List<Airline> findAirlinesByAirportCode(String airportCode);

}
