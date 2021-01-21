package app;

import controller.PassengerController;
import servicelayer.ServiceFactory;

public class StartUp {
	private static PassengerController passenger = new PassengerController(ServiceFactory.getReservationService(),ServiceFactory.getAirportService(), ServiceFactory.getFlightService());
	
	public static PassengerController getPassengerInstance() {
		return passenger;
	}
}
