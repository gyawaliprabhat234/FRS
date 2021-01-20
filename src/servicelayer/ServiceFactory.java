package servicelayer;

import repository.RepositoryFactory;

public class ServiceFactory {
	
	public static IAirportService airport = new 
			 AirportServiceImpl(RepositoryFactory.getReservationSystemRepository());
	public static IFlightService flight = new 
			 FlightServiceImpl(RepositoryFactory.getReservationSystemRepository());
	public static IReservationService reservation = new 
			 ReservationServiceImpl(RepositoryFactory.getReservationSystemRepository());
	
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
