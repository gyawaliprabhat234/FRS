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
			return true;
		return false;
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
		List<Airline> airlinelist = new ArrayList<Airline>();
		for (Entry<String, Airline> pair : airlines.entrySet()) {
			airlinelist.add((Airline) airlines.entrySet());
		}
		return airlinelist;
	}

	@Override
	public List<Airline> findAirlinesByAirportCode(String airportCode) {
		List<Airline> Airlis = new ArrayList<Airline>();
		AirportRepoImpl air = new AirportRepoImpl();
		if (air.findAirportByAirportCode(airportCode).getCode().equalsIgnoreCase(airportCode)) {
			Airlis.addAll(0, Airlis);
		}
		return Airlis;
	}

}
