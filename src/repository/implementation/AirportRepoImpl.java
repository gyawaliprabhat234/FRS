package repository.implementation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import model.Airport;
import repository.interfaces.IAirportRepository;

public class AirportRepoImpl implements IAirportRepository{
	private Hashtable<String, Airport> airports;
	AirportRepoImpl(){
		airports = new Hashtable<>();
	}
	@Override
	public boolean addAirport(Airport airport) {
		if (airports.put(airport.getId(), airport) == null)
			return true;
		return false;
	}

	@Override
	public boolean updateAirport(Airport airport) {
		if (airports.containsValue(airport)) {
			return false;

		}
		airports.put(null, airport);
		return true;
	}

	@Override
	public boolean removeAirport(Airport airport) {
		if (airports.contains(airport)) {

			airports.remove(airport);
			return true;
		}
		return false;
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {

		List<Airport> listAllAirports = findAllAirports();
		Airport aptbyCode = null;
		for (Airport apt : listAllAirports) {
			if (apt.getCode() == airportCode)
				aptbyCode = apt;
		}
		return aptbyCode;
	}

	// @Override
	public List<Airport> findAirportsByCity(String city) {
		List<Airport> aro = new ArrayList<Airport>();
		for (Entry<String, Airport> pair : airports.entrySet()) {
			if (airports.contains(city)) {
				aro.add(0, null);

			}
		}
		return aro;
	}

	@Override
	public List<Airport> findAllAirports() {
		return List.copyOf(airports.values());
	}


}
