package repository.interfaces;

import java.util.List;

import model.Airport;

public interface IAirportRepository {
	boolean addAirport(Airport airport);
	
	boolean updateAirport(Airport airport);

	boolean removeAirport(Airport airport);

	Airport findAirportByAirportCode(String airportCode);

	List<Airport> findAirportsByCity(String city);

	List<Airport> findAllAirports();
}
