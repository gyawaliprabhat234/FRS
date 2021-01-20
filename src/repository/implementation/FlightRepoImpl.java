package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Airport;
import model.Flight;
import repository.interfaces.IFlightRepository;

public class FlightRepoImpl implements IFlightRepository {
	private Hashtable<String, Flight> flights;
	FlightRepoImpl(){
		flights = new Hashtable<String, Flight>();
	}

	@Override
	public boolean addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
