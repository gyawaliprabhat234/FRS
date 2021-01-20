package repository.interfaces;

import java.util.List;

import model.Agent;
import model.FlightInstance;
import model.Passenger;

public interface IPassengerRepository {

	boolean addPassenger(Passenger passenger);

	boolean removePassenger(Passenger passenger);

	boolean updatePassenger(Passenger passenger);
	
	List<Passenger> getAllPassengers();
	
	Passenger getPassengerById(String id);
}
