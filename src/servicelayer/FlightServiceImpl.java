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

	@Override
	public List<FlightInstance> findFlightsFromTo( String departure, String arrival, LocalDate flightDate) {
		
		List<FlightInstance> listAllFlightInstances = new ArrayList<>();
		listAllFlightInstances = repository.getFlightInstance().getAllFlightInstances();
		List<FlightInstance> listFlightsFromTo = new ArrayList<>();
		for(FlightInstance flightInst : listAllFlightInstances) {
			
			if(flightInst.getDepatureAirport().getId() == departure 
					&& flightInst.getArrivalAirport().getId() == arrival 
					&& flightInst.getDate()==flightDate) {
				listFlightsFromTo.add(flightInst);
			}
		} 
		
		return listFlightsFromTo;
	}

}
