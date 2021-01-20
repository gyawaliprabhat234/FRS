package repository.interfaces;

import java.util.List;

import model.Airport;
import model.Flight;
import model.FlightInstance;

public interface IFlightInstanceRepository {
	
	List<Flight> findFlightsFromTo(Airport departure, Airport arrival);

	boolean addFlightInstance(FlightInstance instance);

	boolean removeFlightInstance(FlightInstance instance);

	boolean updateFlightInstance(FlightInstance instance);

}
