package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Airline;
import repository.interfaces.IAirlineRepository;

public class AirlineRepoImpl implements IAirlineRepository {
	private Hashtable<String, Airline> airlines;
	AirlineRepoImpl(){
		airlines = new Hashtable<>();
	}
	@Override
	public boolean addAirline(Airline airline) {
		boolean result =  airlines.put(airline.getId(), airline) == null;
		return !result;
	}

	@Override
	public boolean updateAirline(Airline airline) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAirline(Airline airline) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Airline> findAllAirlines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airline> findAirlinesByAirportCode(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}
	void add() {
		
	}

}
