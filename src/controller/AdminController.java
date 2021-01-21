package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Airline;
import model.Airport;
import model.FlightInstance;
import servicelayer.IAirportService;
import servicelayer.IFlightService;
import servicelayer.IReservationService;

public class AdminController {
	private IAirportService airportService;
	private IFlightService flightService;
	public AdminController(IReservationService reserveService, IAirportService airportService, IFlightService flightService){
		this.airportService = airportService;
		this.flightService = flightService;
	}
	public List<Airline> getAllAirlines(){
		return airportService.findAllAirlines();
	}
	
	public List<Airport> getAllAirport(){
		return airportService.findAllAirports();
	}
	
	public List<Airline> getAllDepartingAirlines(String airportCode){
		return airportService.findAirlinesFlyingOut(airportCode);
	}
	public Airport getAirportByAirportCode(String code) {
		return airportService.findAirportByAirportCode(code);
	}
	public List<ArrayList<FlightInstance>> getListofFlight(Airport depature,Airport destination, LocalDate flightDate){
		return flightService.findFlightFromTo(depature, destination ,flightDate);
	}
	public boolean addAirport(Airport a) {
		return airportService.addAirport(a);
	}
	
	public boolean addAirline(Airline airline) {
		return this.airportService.addAirline(airline);
	}
}
