package servicelayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Agent;
import model.Airline;
import model.Airport;
import model.Flight;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import repository.implementation.DataCollection;

public class FlightServiceImpl implements  IFlightService {
	
	private DataCollection repository;
	
	FlightServiceImpl(DataCollection repository) {
		super();
		this.repository = repository;
	}

	/*
	 * @Override public List<FlightInstance> findFlightsFromTo( String departure,
	 * String arrival, LocalDate flightDate) {
	 * 
	 * List<FlightInstance> listAllFlightInstances = new ArrayList<>();
	 * listAllFlightInstances =
	 * repository.getFlightInstance().getAllFlightInstances(); List<FlightInstance>
	 * listFlightsFromTo = new ArrayList<>(); for(FlightInstance flightInst :
	 * listAllFlightInstances) {
	 * 
	 * if(flightInst.getDepatureAirport().getId() == departure &&
	 * flightInst.getArrivalAirport().getId() == arrival &&
	 * flightInst.getDate()==flightDate) { listFlightsFromTo.add(flightInst); } }
	 * 
	 * return listFlightsFromTo; }
	 */

	@Override
	public List<ArrayList<FlightInstance>> findFlightFromTo(Airport depature, Airport arrival, LocalDate flightDate) {
		List<ArrayList<FlightInstance>> flights = new ArrayList<ArrayList<FlightInstance>>();
		List<FlightInstance> all = repository.getFlightInstance().getAllFlightInstances();
		ArrayList<FlightInstance> instances;
		//finding without transit
		for(FlightInstance instance:all ) {
			 instances = new ArrayList<>();
			if(flightDate.equals(instance.getDate()) 
					&& depature.getCode().equalsIgnoreCase(instance.getDepatureAirport().getCode())
					&& arrival.getCode().equalsIgnoreCase(instance.getArrivalAirport().getCode())) {
				instances.add(instance);
				flights.add(instances);
			}
			
		}
		
		//finding flight with one transit
		ArrayList<FlightInstance> departFromDepature = new ArrayList<>();
		for(FlightInstance instance : all) {
			if(flightDate.equals(instance.getDate()) 
					&& instance.getDepatureAirport().getCode().equalsIgnoreCase(depature.getCode())) {
				departFromDepature.add(instance);
			}
		}
		for(FlightInstance depart: departFromDepature) {
			for(FlightInstance instance: all) {
				if(flightDate.equals(instance.getDate()) 
						&& instance.getDepatureAirport().getCode().equalsIgnoreCase(depart.getArrivalAirport().getCode())
						&& instance.getArrivalAirport().getCode().equalsIgnoreCase(arrival.getCode())) {
					ArrayList<FlightInstance> transitFlight = new ArrayList<>();
					transitFlight.add(depart);
					transitFlight.add(instance);
					flights.add(transitFlight);
					
				}
			}
		}
		return flights;
	}
	


	@Override
	public boolean addFlightInstance(FlightInstance flightInstance) {
		return repository.getFlightInstance().addFlightInstance(flightInstance);
	}

}
