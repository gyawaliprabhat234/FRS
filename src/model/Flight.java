package model;

import java.time.LocalDate;
import java.util.*;


public class Flight {
	private String number;
	private int capacity;
	private Airline airline;
	public Flight(String number, int capacity, Airline airline) {
		super();
		this.number = number;
		this.capacity = capacity;
		this.airline = airline;
	}
	
	public String getId() {
		return number;
	}
	public int getCapacity() {
		return capacity;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public String toString() {
		String str = "Flight Number: " + this.number + "Airline :" + this.airline.getName(); 
		return str;
	}
	
	
	
	
}
