package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Agent;
import model.FlightInstance;
import model.Passenger;
import repository.interfaces.IPassengerRepository;

public class PassengerRepoImpl implements IPassengerRepository {
	private Hashtable<String, Passenger> passengers;
	
	PassengerRepoImpl(){
		passengers = new Hashtable<String, Passenger>();
	}
	@Override
	public boolean addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Passenger> findPassengersByAgent(Agent agent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> findPassengerByFlightInstance(FlightInstance instance) {
		// TODO Auto-generated method stub
		return null;
	}

}
