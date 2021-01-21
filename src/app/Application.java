package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.*;
import model.Address;
import model.Agent;
import model.Airline;
import model.Airport;
import model.FlightInstance;
import model.Passenger;
import model.Reservation;
import model.UserType;
import model.Ticket;

public class Application {
	static Scanner sc = new Scanner(System.in);
	private static Passenger passenger;
	private static AdminController adminCtrl = StartUp.getAdminInstance();
	private static Agent agent;
	private static PassengerController passengerCtrl = StartUp.getPassengerInstance();

	public static void main(String[] args) {

		System.out.println("Welcome to FRS");
		new InitDataController();
		// System.out.println(UserType.ADMIN.name());
		mainMenu();
//		passenger = new Passenger("prabhat", "Gyawali", "dsf", null);
//		Airport dest = passengerCtrl.getAirportByAirportCode("FIA");
//		Airport arrival  = passengerCtrl.getAirportByAirportCode("CIA");
//		List<ArrayList<FlightInstance>> flights = passengerCtrl.getListofFlight(dest, arrival, LocalDate.of(2021, 01, 22));
//		Reservation reservation = passengerCtrl.makeReservation(passenger, flights.get(1));
//		System.out.println(reservation);
//		passengerCtrl.cancelReservation(reservation.getCode());
//		System.out.println(passengerCtrl.getAllReservation(passenger));
//		List<Ticket> tickets = passengerCtrl.confirmReservation(reservation.getCode());
//		System.out.println(tickets);

	}

	public static int readInputNumber() {
		String input = sc.nextLine();
		try {
			return Integer.parseInt(input);
		} catch (Exception ex) {
			System.out.println("ERROR:command unknown. Enter Again");
			return readInputNumber();
		}

	}

	public static String readInputText() {
		String input = sc.nextLine();
		try {
			if (input.trim() != null && input.trim() != "")
				return input.trim();
			else {
				System.out.println("Invalid Input Enter Again");
				return readInputText();
			}

		} catch (Exception ex) {
			System.out.println("ERROR:command unknown. Enter again");
			return readInputText();
		}
	}

	static void mainMenu() {
		System.out.println("Select User Role");
		System.out.println("1. for Passenger");
		System.out.println("2. for Admin");
		int input = readInputNumber();
		switch (input) {
		case 1:
			System.out.println("Logged in as Passenger");
			setUpPassenger();
			passenger();
			break;
		case 2:
			System.out.println("Logged in as Admin");
			admin();
			break;
		default:
			System.out.println("Unknown input");
			mainMenu();

		}
	}

	static void setUpPassenger() {
		System.out.println("Enter first name: ");
		String fname = readInputText();
		System.out.println("Enter last name: ");
		String lname = readInputText();
		System.out.println("Enter email address: ");
		String email = readInputText();
		passenger = new Passenger(lname, fname, email, new Address("", "", "", ""));
	}

	static void chooseEnter() {
		System.out.println("--Please press ENTER---");
		sc.nextLine();
	}

	static Airport getValidAirportCode(String str) {
		System.out.println(str);
		String input = readInputText();
		Airport airport = passengerCtrl.getAirportByAirportCode(input);
		if (airport != null && airport.getCode() != null && !airport.getCode().equals("")) {
			return airport;
		} else {
			System.out.println("Airport not in list:");
			return null;
		}

	}

	public static LocalDate getValidFutureDate() {
		System.out.println("Enter flight date(YYYY-MM-DD): ");
		while (true) {
			String input = readInputText();
			String dateFormat = "yyyy-MM-dd";
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat);
			LocalDate date = null;
			try {
				date = LocalDate.parse(input, dateFormatter);
				if (date.compareTo(LocalDate.now()) == 1) {
					return date;
				} else {
					System.out.println("Please enter valid future date");
				}
			} catch (DateTimeParseException e) {
				System.out.println("Invalid Input. Enter date in format(2020-01-22): ");
			}
		}
	}

	static void makeReservation() {
		List<ArrayList<FlightInstance>> flights = viewFlights();
		if (flights.size() > 0) {
			System.out.println("Choose flight");
			int input = readInputNumber();
			if (checkMenuInput(input, 1, flights.size())) {
				System.out.println(passengerCtrl.makeReservation(passenger, flights.get(input - 1)));
			} else {
				System.out.println("no input match");
			}
		} else {
			System.out.println("No flights found");
		}
	}

	static List<ArrayList<FlightInstance>> viewFlights() {
		Airport depature = getValidAirportCode("Enter depature airport code: ");
		Airport destination = getValidAirportCode("Enter arrival airport code: ");
		List<ArrayList<FlightInstance>> flights = passengerCtrl.getListofFlight(depature, destination,
				getValidFutureDate());
		List<String> flightStr = new ArrayList<>();
		for (ArrayList<FlightInstance> instance : flights) {
			String str = "";
			for (FlightInstance ins : instance) {
				str += ins.getDepatureAirport().getCode() + "-->" + ins.getArrivalAirport().getCode()
						+ " Departing Time: " + ins.getDepatureTime().toString();
				str += "\t";
			}
			flightStr.add(str);

		}
		Print.print(flightStr);
		return flights;
	}

	static boolean checkMenuInput(int input, int max, int min) {
		return !(input < min && input > max);
	}

	static List<Reservation> viewAllReservation() {
		List<Reservation> reservations = passengerCtrl.getAllReservation(passenger);
		Print.print(reservations);
		return reservations;
	}

	static void confirmReservation() {
		List<Reservation> reservations = viewAllReservation();
		if (reservations.size() > 0) {
			System.out.println("Choose reservation to confirm");
			int input = readInputNumber();
			if (checkMenuInput(input, 1, reservations.size())) {
				Print.print(passengerCtrl.confirmReservation(reservations.get(input - 1).getCode()));
			} else {
				System.out.println("no input match");
			}
		} else {
			System.out.println("No flights found");
		}

	}
	//static void printTickets(List<Ticket> tickets)

	static void viewDetailOfReservation() {
		List<Reservation> reservations = viewAllReservation();
		if (reservations.size() > 0) {
			System.out.println("Choose reservation to view detail");
			int input = readInputNumber();
			if (checkMenuInput(input, 1, reservations.size())) {
				getDetailReservation((reservations.get(input - 1)));
			} else {
				System.out.println("no input match");
			}
		} else {
			System.out.println("No flights found");
		}
	}

	static void getDetailReservation(Reservation reservation) {
		System.out.println("========================Reservation======================");
		System.out.println("Reservation code : " + reservation.getCode());
		System.out.println("Status: " + reservation.getStatus());
		System.out.println("Passenger Info :\n" + reservation.getPassenger());
		System.out.println("Flight Information");
		Print.print(reservation.getFlightInstances());
		
	}

	static void cancelReservation() {
		List<Reservation> reservations = viewAllReservation();
		if (reservations.size() > 0) {
			System.out.println("Choose reservation");
			int input = readInputNumber();
			if (checkMenuInput(input, 1, reservations.size())) {
				System.out.println((passengerCtrl.cancelReservation(reservations.get(input - 1).getCode()))
						+ " has been cancelled");
			} else {
				System.out.println("no input match");
			}
		} else {
			System.out.println("No flights found");
		}
	}

	static void passenger() {
		while (true) {
			System.out.println("-------------------CHOOSE MENU------------------------------");
			System.out.println("1. View Airports");
			System.out.println("2. Check airlines flying out of an airport ");
			System.out.println("3. View flights between arrival and destination for a date");
			System.out.println("4. View my Reservations");
			System.out.println("5. Make a Reservation");
			System.out.println("6. Confirm a Reservation");
			System.out.println("7. View details of my reservation");
			System.out.println("8. Cancel a Reservation");
			System.out.println("9. EXIT");

			switch (readInputNumber()) {
			case 1:
				Print.print(passengerCtrl.getAllAirport());
				break;
			case 2:
				System.out.println("Enter airport code : ");
				Print.print(passengerCtrl.getAllDepartingAirlines(readInputText()));
				break;

			case 3:
				viewFlights();
				break;
			case 4:
				viewAllReservation();
				break;
			case 5:
				makeReservation();
				break;
			case 6:
				confirmReservation();
				break;

			case 7:
				viewDetailOfReservation();
				break;

			case 8:
				cancelReservation();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("Invalid input Choose again :");
			}
			chooseEnter();

		}
	}

	static void admin() {
		while (true) {
			System.out.println("-------------------CHOOSE MENU------------------------------");
			System.out.println("1. View Airports");
			System.out.println("2. Check airlines flying out of an airport ");
			System.out.println("3. View flights between arrival and destination for a date");
			System.out.println("4. Add Airlines");
			System.out.println("5. Add Airport");
			System.out.println("6. EXIT");

			switch (readInputNumber()) {
			case 1:
				Print.print(adminCtrl.getAllAirport());
				break;
			case 2:
				System.out.println("Enter airport code : ");
				Print.print(adminCtrl.getAllDepartingAirlines(readInputText()));
				break;

			case 3:
				viewFlights();
				break;
			case 4:
				addAirlines();
				break;
			case 5:
				addAirport();
				break;
			case 6:
				System.exit(0);
				break;

			
			default:
				System.out.println("Invalid input Choose again :");
			}
			chooseEnter();

		}
	}

	static void addAirlines() {
		System.out.println("Enter Airline name");
		String name = readInputText();
		System.out.println("Enter Airline code");
		String code = readInputText();
		Airline airline = new Airline(name, code);
		adminCtrl.addAirline(airline);
		System.out.println("Airline added Successfully");
		
		
	}
	
	static void addAirport() {
		System.out.println("Enter Airport name");
		String name = readInputText();
		System.out.println("Enter Airport code");
		String code = readInputText();
		Airport airport = new Airport(code, name, null);
		adminCtrl.addAirport(airport);
		System.out.println("Airport added Successfully");
	}

	public final static void clearConsole() {
		try {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}
}
