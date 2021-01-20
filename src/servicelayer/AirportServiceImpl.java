package servicelayer;

import java.time.LocalDate;
import java.util.List;

import model.Agent;
import model.Airline;
import model.Airport;
import model.Flight;
import model.Passenger;
import model.Reservation;
import repository.ReservationSystemRepository;

public class AirportServiceImpl implements IAirportService{
	
	private ReservationSystemRepository repository;
	
	AirportServiceImpl(ReservationSystemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Airport> findAllAirports() {
		return repository.findAllAirports();
	}

	@Override
	public Airport findAirportByAirportCode(String airportCode) {
		return repository.findAirportByAirportCode(airportCode);
	}

	@Override
	public List<Airport> findAirportsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airline> findAirlinesByAirportCode(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airline> findAllAirlines() {
		// TODO Auto-generated method stub
		return null;
	}

}
