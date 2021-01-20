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
		return passengers.put(passenger.getId(), passenger) != null;
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		return passengers.remove(passenger.getId()) != null;
	}

	@Override
	public boolean updatePassenger(Passenger passenger) {
		return false;
	}
	@Override
	public List<Passenger> getAllPassengers() {
		return List.copyOf(this.passengers.values());
		
	}
	@Override
	public Passenger getPassengerById(String id) {
		return passengers.get(id);
	}
	
	

	
}
