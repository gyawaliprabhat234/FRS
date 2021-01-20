package model;

import java.time.LocalDate;
import java.util.*;

public class FlightInstance {
	private String id;
	private LocalDate date;
	private List<Pilot> pilots;
	private List<Crew> crews;
	private List<Passenger> passengers;
	public FlightInstance(String id, LocalDate date) {
		super();
		this.id = UUID.randomUUID().toString();
		this.date = date;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
