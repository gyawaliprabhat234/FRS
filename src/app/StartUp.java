package app;

import controller.AdminController;
import controller.PassengerController;
import servicelayer.ServiceFactory;

public class StartUp {
	private static PassengerController passenger = new PassengerController(ServiceFactory.getReservationService(),ServiceFactory.getAirportService(), ServiceFactory.getFlightService());
	private static AdminController admin = new AdminController(ServiceFactory.getReservationService(),ServiceFactory.getAirportService(), ServiceFactory.getFlightService());
	
	public static PassengerController getPassengerInstance() {
		return passenger;
	}
	
	public static AdminController getAdminInstance() {
		return admin;
	}
}
