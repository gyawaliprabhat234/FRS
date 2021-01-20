package repository.implementation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

import model.Airport;
import model.Flight;
import model.FlightInstance;
import repository.interfaces.IFlightInstanceRepository;
import repository.interfaces.IFlightRepository;

public class FlightInstanceRepoImpl implements IFlightInstanceRepository {
	private Hashtable<String, FlightInstance> flightInstances;

	FlightInstanceRepoImpl() {
		flightInstances = new Hashtable<>();
	}

	@Override
	public List<Flight> findFlightsFromTo(Airport departure, Airport arrival) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addFlightInstance(FlightInstance instance) {
		boolean result = flightInstances.put(instance.getId(), instance) == null;
		if (result != false) {
			return false;
		}
		return true;
	}

	@Override
	public boolean removeFlightInstance(FlightInstance instance) {
		flightInstances.remove(instance.getId());
		return true;
	}

	@Override
	public boolean updateFlightInstance(FlightInstance instance) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<FlightInstance> getAllFlightInstances() {
		List<FlightInstance> allflightInstances = new ArrayList<FlightInstance>(flightInstances.values());
		return allflightInstances;

	}

}
