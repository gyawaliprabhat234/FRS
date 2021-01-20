package app;

public  final class Content {
static final String Menu = "\nPLEASE SELECT:"+
			"\n1.View list of airports" + 
			"\n2.View list of airlines flying out of an airport (search by airport three letter code)" +
			"\n3.View list of flights between a departure and destination for a date";
 static final String Admin = Menu + "\n4.View list of reservations";	
 static final String Agent = Menu + "\n4.View list of passengers and reservations";	
 static String  MENU_STRING_2 = "\n5.View details of a reservation"+
								"\n6.Make a reservation"+
								"\n7.Cancel a reservation"+
								"\n8.Confirm and purchase a reservation.";

}
