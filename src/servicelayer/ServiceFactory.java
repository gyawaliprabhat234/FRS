package servicelayer;

import repository.implementation.RepositoryFactory;

public class ServiceFactory {
	
	public static IAirportService airport = new 
			 AirportServiceImpl(RepositoryFactory.getDbObj());
	public static IFlightService flight = new 
			 FlightServiceImpl(RepositoryFactory.getDbObj());
	public static IReservationService reservation = new 
			 ReservationServiceImpl(RepositoryFactory.getDbObj());
	
	public static IReservationService getReservationService() {
		return reservation;		
	}
	
	public static IAirportService getAirportService() {
		return airport;		
	}
	
	public static IFlightService getFlightService() {
		return flight;		
	}
}
