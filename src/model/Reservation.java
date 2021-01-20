package model;

import java.util.List;

public class Reservation {
	private Passenger passenger;
	private List<Ticket> tickets;
	private Agent agent;
	private String code;
	
	public Reservation(Passenger passenger, Agent agent, String code) {
		super();
		this.passenger = passenger;
		this.agent = agent;
		this.code = code;
	}
	
	public Passenger getPassengers() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
