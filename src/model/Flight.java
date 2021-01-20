package model;

import java.time.LocalDate;
import java.util.*;


public class Flight {
	private String id; 
	private int number;
	private int capacity;
	private LocalDate depatureTime;
	private LocalDate arrivalTime;
	private List<FlightInstance> flightInstances;
	private Airport depature;
	private Airport arrival;
	private Airline airline;
	public Flight(int number, int capacity) {
		super();
		this.id = UUID.randomUUID().toString();
		this.number = number;
		this.capacity = capacity;
		
	}
	
	public String getId() {
		return id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
	public Airport getDepature() {
		return depature;
	}
	public void setDepature(Airport depature) {
		this.depature = depature;
	}
	public Airport getArrival() {
		return arrival;
	}
	public void setArrival(Airport arrival) {
		this.arrival = arrival;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	
	
	
	
}
