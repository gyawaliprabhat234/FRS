package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Airport;
import model.Flight;
import model.FlightInstance;
import repository.interfaces.IFlightInstanceRepository;
import repository.interfaces.IFlightRepository;

public class FlightInstanceRepoImpl implements IFlightInstanceRepository {
	private Hashtable<String, FlightInstance> flightInstances;
	
	FlightInstanceRepoImpl(){
		 flightInstances = new Hashtable<>();
	}

	@Override
	public List<Flight> findFlightsFromTo(Airport departure, Airport arrival) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addFlightInstance(FlightInstance instance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFlightInstance(FlightInstance instance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateFlightInstance(FlightInstance instance) {
		// TODO Auto-generated method stub
		return false;
	}
	



}
