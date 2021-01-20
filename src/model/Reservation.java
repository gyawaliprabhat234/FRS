package model;

import java.util.List;

import utility.Generator;

public class Reservation {
	private Passenger passenger;
	private List<Ticket> tickets;
	private List<FlightInstance> flightInstances;
	private Agent agent;
	private String code;
	private UserType userType;
	private Status status;
	
	public Reservation(Passenger passenger, Agent agent, List<FlightInstance> flightInstances, UserType userType) {
		super();
		this.passenger = passenger;
		this.agent = agent;
		this.code = Generator.genReservationCode();
		this.flightInstances = flightInstances;
		this.userType = userType;
	}
	public List<FlightInstance> getFlightInstances(){
		return this.flightInstances;
	}
	
	public UserType getUserType() {
		return this.userType;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}
	public Agent getAgent() {
		return agent;
	}
	public String getCode() {
		return code;
	}
	
	public String toString() {
		String str = "Reservation [Code : "+this.code+" Status: "+this.status.toString()+" ]"; 
		return str;
	}
	
	
	

}
