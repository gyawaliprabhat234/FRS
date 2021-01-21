package servicelayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Agent;
import model.Airline;
import model.Airport;
import model.Flight;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import repository.implementation.DataCollection;

public class AirportServiceImpl implements IAirportService{
	
	private DataCollection repository;
	
	AirportServiceImpl(DataCollection repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Airport> findAllAirports() {
		return repository.getAirport().findAllAirports();
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		return repository.getAirport().findAirportByAirportCode(airportCode);
	}

	@Override
	public List<Airport> findAirportsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Airline> findAirlinesFlyingOut(String airportCode) {
		List<Airline> departingAirlines = new ArrayList<Airline>();
		List<FlightInstance> flights = repository.getFlightInstance().getAllFlightInstances();
		for(FlightInstance instance: flights) {
			if(instance.getDepatureAirport().getCode().equalsIgnoreCase(airportCode) && !departingAirlines.contains(instance.getFlight().getAirline())) {
				departingAirlines.add(instance.getFlight().getAirline());
			}
		}
		return departingAirlines;
	}

	@Override
	public List<Airline> findAllAirlines() {
		return repository.getAirline().findAllAirlines();
	}

	@Override
	public boolean addAirport(Airport airport) {
		return repository.getAirport().addAirport(airport);
	}

	@Override
	public boolean addAirline(Airline airline) {
		return repository.getAirline().addAirline(airline);
	}

	@Override
	public boolean removeAirport(Airport airport) {
		// TODO Auto-generated method stub
		return false;
	}

}
