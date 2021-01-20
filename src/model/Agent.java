package model;

import java.util.List;
import java.util.UUID;

public class Agent {
	private String id;
	private String name;
	private List<Passenger> passengers;
	public Agent(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void addPassenger(Passenger passenger) {
		passengers.add(passenger);
	}
	
	public List<Passenger> getPassengers(){
		return this.passengers;
	}
	
	public String getId() {
		return this.id;
	}

}
