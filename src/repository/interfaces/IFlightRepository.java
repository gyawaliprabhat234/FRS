package repository.interfaces;

import java.util.List;

import model.Airport;
import model.Flight;

public interface IFlightRepository {
	
	boolean addFlight(Flight flight);

	boolean removeFlight(Flight flight);
	
	boolean updateFlight(Flight flight);
	
	List<Flight> getAllFlights();


}
