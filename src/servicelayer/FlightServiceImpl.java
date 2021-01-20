package servicelayer;

import java.time.LocalDate;
import java.util.List;

import model.Agent;
import model.Airline;
import model.Airport;
import model.Flight;
import model.Passenger;
import model.Reservation;
import repository.implementation.DataCollection;

public class FlightServiceImpl implements  IFlightService {
	
	private DataCollection repository;
	
	FlightServiceImpl(DataCollection repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Flight> findFlightsFromTo(String departure, String arrival, LocalDate flightDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
