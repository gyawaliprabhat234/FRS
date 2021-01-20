package servicelayer;

import java.time.LocalDate;
import java.util.List;

import model.Flight;
import model.FlightInstance;

public interface IFlightService {
	List<FlightInstance> findFlightsFromTo(String departure, String arrival, LocalDate flightDate);
}
