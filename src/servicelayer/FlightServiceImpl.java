package servicelayer;

import java.time.LocalDate;
import java.util.List;

import model.Agent;
import model.Airline;
import model.Airport;
import model.Flight;
import model.Passenger;
import model.Reservation;
import repository.ReservationSystemRepository;

public class FlightServiceImpl implements  IFlightService {
	
	private ReservationSystemRepository repository;
	
	FlightServiceImpl(ReservationSystemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Flight> findFlightsFromTo(String departure, String arrival, LocalDate flightDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
