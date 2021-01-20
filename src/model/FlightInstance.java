package model;

import java.time.LocalDate;
import java.util.*;

public class FlightInstance {
	private String id;
	private LocalDate date;
	private List<Pilot> pilots;
	private List<Crew> crews;
	private List<Passenger> passengers;
	private LocalDate depatureTime;
	private LocalDate arrivalTime;
	private Airport depatureAirport;
	private Airport arrivalAirport;
	private Flight flight;
	public FlightInstance(String id, LocalDate date, Flight flight) {
		super();
		this.id = UUID.randomUUID().toString();
		this.date = date;
		this.flight = flight;
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
	public LocalDate getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(LocalDate depatureTime) {
		this.depatureTime = depatureTime;
	}
	public LocalDate getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDate arrivalTime) {
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
	
	
	

}
