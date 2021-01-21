package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class FlightInstance {
	private String id;
	private LocalDate date;
	private List<Pilot> pilots;
	private List<Crew> crews;
	private List<Passenger> passengers;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private Airport depatureAirport;
	private Airport arrivalAirport;
	private Flight flight;
	public FlightInstance(LocalDate date, Flight flight, LocalTime departureTime, LocalTime arrivalTime, Airport departure, Airport arrival) {
		super();
		this.id = UUID.randomUUID().toString();
		this.date = date;
		this.flight = flight;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.arrivalAirport = arrival;
		this.depatureAirport = departure;
	}
	public String getId() {
		return id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getDepatureTime() {
		return departureTime;
	}
	public void setDepatureTime(LocalTime depatureTime) {
		this.departureTime = depatureTime;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Airport getDepatureAirport() {
		return depatureAirport;
	}
	public void setDepatureAirport(Airport depatureAirport) {
		this.depatureAirport = depatureAirport;
	}
	public Airport getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public List<Pilot> getPilots() {
		return pilots;
	}
	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}
	public List<Crew> getCrews() {
		return crews;
	}
	public void setCrews(List<Crew> crews) {
		this.crews = crews;
	}
	
	public Flight getFlight() {
		return this.flight;
	}
	public String toString() {
		String str = this.flight.toString();
		str += "\nFlight Date     : "+this.date.toString()+" \nArrival Time: "+ this.arrivalTime.toString() + " Depature Time: " + this.departureTime.toString();
		str += "\nDepature Airport: "+this.depatureAirport.getCode()+"  Arrival Airport: " + this.arrivalAirport.getCode();
		return str;
	}
	
	

}
