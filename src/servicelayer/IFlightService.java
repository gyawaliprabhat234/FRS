package servicelayer;

import java.time.LocalDate;
import java.util.List;

import model.Flight;

public interface IFlightService {
	List<Flight> findFlightsFromTo(String departure, String arrival, LocalDate flightDate);
}
