package servicelayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Airport;
import model.Flight;
import model.FlightInstance;

public interface IFlightService {
	
	List<ArrayList<FlightInstance>> findFlightFromTo(Airport depature, Airport arrival,LocalDate flightDate);
	
	boolean addFlightInstance(FlightInstance flightInstance);
	
}
