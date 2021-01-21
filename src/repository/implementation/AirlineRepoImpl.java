package repository.implementation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import model.Airline;
import repository.interfaces.IAirlineRepository;

public class AirlineRepoImpl implements IAirlineRepository {
	private Hashtable<String, Airline> airlines;
	AirlineRepoImpl(){
		airlines = new Hashtable<>();
	}
	@Override
	public boolean addAirline(Airline airline) {
		if (airlines.put(airline.getId(), airline) == null)
			return false;
		return true;
	}

	// @Override,
	public boolean updateAirline(Airline airline) {
		if (airlines.containsValue(airline)) {
			return false;
		}
		airlines.put(null, airline);
		return true;
	}

	@Override
	public boolean removeAirline(Airline airline) {
		if (airlines.contains(airline)) {

			airlines.remove(airline);
			return true;
		}
		return false;
	}

	@Override
	public List<Airline> findAllAirlines() {
		return List.copyOf(airlines.values());
	}

}
