package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Airline;
import model.Airport;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.Ticket;
import servicelayer.IAirportService;
import servicelayer.IFlightService;
import servicelayer.IReservationService;

public class PassengerController {
	private IReservationService reserveService;
	private IAirportService airportService;
	private IFlightService flightService;
	public PassengerController(IReservationService reserveService, IAirportService airportService, IFlightService flightService){
		this.reserveService = reserveService;
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
	
	public List<Reservation> getAllReservation(Passenger passenger){
		return this.reserveService.findReservationsByPassenger(passenger);
	}
	
	public Reservation makeReservation(Passenger passenger, List<FlightInstance> flightInstances) {	
		return reserveService.createReservation(passenger, flightInstances);
	}
	
	public List<Ticket> confirmReservation(String reservationCode){
		return reserveService.confirmReservation(reservationCode);
	}
	public Reservation cancelReservation(String reservationCode){
		return reserveService.cancelReservation(reservationCode);
	}

}
