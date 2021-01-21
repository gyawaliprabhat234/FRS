package servicelayer;

import repository.implementation.RepositoryFactory;

public class ServiceFactory {
	
	private static IAirportService airport = new 
			 AirportServiceImpl(RepositoryFactory.getDbObj());
	private static IFlightService flight = new 
			 FlightServiceImpl(RepositoryFactory.getDbObj());
	private static IReservationService reservation = new 
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
