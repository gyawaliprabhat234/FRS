package controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Address;
import model.Airline;
import model.Airport;
import model.Crew;
import model.Flight;
import model.FlightInstance;
import model.Pilot;
import servicelayer.IAirportService;
import servicelayer.IFlightService;
import servicelayer.ServiceFactory;

public class InitDataController {
	List<Airport> airports = new ArrayList<>();
	List<Airline> airlines = new ArrayList<>();
	List<Address> address = new ArrayList<>();
	List<Pilot> pilots = new ArrayList<>();
	List<FlightInstance> instances = new ArrayList<FlightInstance>();
	List<Crew> crews = new ArrayList<>();
	IAirportService airportService;
	IFlightService flightService;


	public InitDataController() {
		airportService = ServiceFactory.getAirportService();
		flightService = ServiceFactory.getFlightService();
		setUpData();
		initializeData();

	}
	
	public void initializeData() {
		addAirport();
		addAirline();
		addFlightInstance();
	}

	public void addAirport() {
		for (Airport a : airports) {
			airportService.addAirport(a);
		}
		System.out.println("......Added " + airports.size() + " Airports ......");
	}

	public void addAirline() {
		for (Airline a : airlines) {
			airportService.addAirline(a);
		}
		System.out.println("......Added " + airlines.size() + " Airline ......");
	}
	
	public void addFlightInstance() {
		for(FlightInstance instance : instances) {
			flightService.addFlightInstance(instance);
		}
		System.out.println("......Added " + instances.size() + " Flight Instance ......");
	}

	public void setUpData() {
		Address add1 = new Address("11000 Terminal Access Rd", "Fort Myers", "fl", "33913");
		Address add2 = new Address("1 Jeff Fuqua Blvd", "Orlando", "fl", "32827");
		Address add3 = new Address("2121 Arthur Collins Pkwy SW", "Cedar Rapids", "IA", "52404");

		Airport a1 = new Airport("FIA", "Florida International Airport", add1);
		airports.add(a1);
		Airport a2 = new Airport("OIA", "Orlando International Airport", add2);
		airports.add(a2);
		Airport a3 = new Airport("CID", "Cedar Raipid airp", add3);
		airports.add(a3);
		Airport a4 = new Airport("CIA", "Chicago International Airport", new Address("201 S. Clinton", "Iowa City", "IA", "52240"));
		airports.add(a4);
		Airport a5 = new Airport("DSM", "Des Moines DM",
				new Address("2325 SE Delaware Ave", "Andrews ", "Texas", "52221"));
		airports.add(a5);
		Airport a6 = new Airport("DIA", "DALAS International airport",
				new Address("800 SE HWERBE Ave", "DALAS ", "Texas", "32112"));
		airports.add(a6);
		Airline air1 = new Airline("AA23", "Alaska Airlines", "AL001");
		airlines.add(air1);
		Airline air2 = new Airline("AA23", "Alaska Airlines", "AL001");
		Airline air3 = new Airline("AAW2", "American Airlines", "AAM10");
		Airline air4 = new Airline("QWS1", "JetBlue Airway", "JBU");
		Airline air5 = new Airline("AWE11", "Spirit Airlines", "NSKS");
		Airline air6 = new Airline("CAP", "Cape Air", "CAP11");
		Airline air7 = new Airline("MESA", "Mesa Airlines", "MES11");
		airlines.add(air2);
		airlines.add(air3);
		airlines.add(air4);
		airlines.add(air5);
		airlines.add(air6);
		airlines.add(air7);
		Pilot P1 = new Pilot("MIKE", "ALEX", "", new Address("22101 abds", "Dalles", "TX", "12333"));
		pilots.add(P1);
		Pilot P2 = new Pilot("ABRER", "RWET", "", new Address("22101 abds", "Dalles", "TX", "12333"));
		pilots.add(P2);
		Crew c1 = new Crew("ALEV", "DLOT", "", new Address("1223abds", "NY", "NY", "1OO33"));
		crews.add(c1);
		Crew c2 = new Crew("ABEL", "DER", "", new Address("23DDE", "JACK", "FL", "1104"));
		crews.add(c2);
		Flight f1 = new Flight("us22", 30, air1);
		FlightInstance fi1 = new FlightInstance(LocalDate.of(2021, 01, 22), f1, LocalTime.of(12,00), LocalTime.of(13,00), a1, a3);
		fi1.setCrews(crews);
		Flight f2 = new Flight("uk23", 50, air2);
		FlightInstance fi2 = new FlightInstance(LocalDate.of(2021, 01, 22), f2, LocalTime.of(15,00), LocalTime.of(15,00), a1, a4);
		
		Flight f3 = new Flight("us23", 30, air3);
		FlightInstance fi3 = new FlightInstance(LocalDate.of(2021, 01, 22), f3, LocalTime.of(17,00), LocalTime.of(18,00), a6, a1);
	
		Flight f4 = new Flight("vwek", 47, air4);
		FlightInstance fi4 = new FlightInstance(LocalDate.of(2021, 01, 22), f4, LocalTime.of(17,00), LocalTime.of(18,00), a3, a4);
		fi1.setCrews(crews);
		fi2.setCrews(crews);
		fi3.setCrews(crews);
		fi4.setCrews(crews);
		
		fi1.setPilots(pilots);
		fi2.setPilots(pilots);
		fi3.setPilots(pilots);
		fi4.setPilots(pilots);
		
		instances.add(fi1);
		instances.add(fi2);
		instances.add(fi3);
		instances.add(fi4);

	}

}
