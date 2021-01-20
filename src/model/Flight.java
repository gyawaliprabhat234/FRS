package model;

import java.time.LocalDate;
import java.util.*;


public class Flight {
	private String id; 
	private int number;
	private int capacity;
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
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	
	
	
	
}
