package repository.implementation;

import java.util.Hashtable;
import java.util.List;

import model.Airport;
import repository.interfaces.IAirportRepository;

public class AirportRepoImpl implements IAirportRepository{
	private Hashtable<String, Airport> airports;
	AirportRepoImpl(){
		airports = new Hashtable<>();
	}
	@Override
	public boolean addAirport(Airport airport) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAirport(Airport airport) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAirport(Airport airport) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> findAirportsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> findAllAirports() {
		// TODO Auto-generated method stub
		return null;
	}

}
