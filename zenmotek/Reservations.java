package zenmotek;
import java.util.*;

public class Reservations {

	private HashMap<String,ArrayList<Passenger>> database = new HashMap<>();
	private HashMap<String,ArrayList<Flight>> flight_database = new HashMap<>();
	public String booking_email;
	public String booking_name;
	
	private Scanner scan = new Scanner(System.in);
	
	void bookTicket() {
		System.out.println("Enter the number of Passengers ");
		int n = scan.nextInt();
		
		
		ArrayList<Passenger> passengerLists = new ArrayList<>();
		ArrayList<Flight> flightLists = new ArrayList<>();
		
		System.out.println("Enter Email with which booking would take place");
		booking_email = scan.next();
		
		System.out.println("Enter the name of the user under which tickets need to be booked");
		this.booking_name = scan.next();
		
		while(n-->0) {
			Passenger p = fillPassengerDetail();
			passengerLists.add(p);
			
			Flight f = fillFlightDetail();
			flightLists.add(f);
		}
		
		// Add Passenger Details
		if(database.containsKey(booking_email)) {
			database.get(booking_email).addAll(passengerLists);
		}
		else {
			database.put(booking_email, passengerLists);
		}
		
		// Add Flight Details
		if(flight_database.containsKey(booking_email)) {
			flight_database.get(booking_email).addAll(flightLists);
		}
		else {
			flight_database.put(booking_email, flightLists);
		}
		
	}
	
	private Passenger fillPassengerDetail() {
		
		System.out.println("Enter Passenger Details ");
		
		System.out.println("Name: ");
		String name = scan.next();
		
		System.out.println("Age: ");
		int age = scan.nextInt();
		
		System.out.println("Email");
		String email = scan.next();
		
		Passenger p = new Passenger(name,age,email);
		return p;
	}
	
	private Flight fillFlightDetail() {
		
		System.out.println("Enter Flight Details");
		
		System.out.println("Enter Source");
		String src = scan.next();
		
		System.out.println("Enter Destination");
		String des = scan.next();
		
		System.out.println("Is it an International Flight : Y/N ");
		char ch = Character.toLowerCase(scan.next().charAt(0));
		

		double ticket_price;
		int flight_number;
		String airlineName;
		Flight flight;
		
		if(ch=='y') {
			ticket_price = 25760;
			flight_number= 7640;
			airlineName = "Vistara";
			flight = new International(flight_number,airlineName,src,des,ticket_price);
		}
		
		else {
			ticket_price = 2900;
			flight_number= 8860;
			airlineName = "Air Asia";
			flight = new Domestic(flight_number,airlineName,src,des,ticket_price);
		}
		
		
		return flight;
	}
	
	void showMyTicket(String email) {
		if(database.containsKey(email)==false) {
			System.out.println("No Booking has been made using the email");
			return;
		}
		ArrayList<Passenger> passengers = database.get(email);
		
		for(Passenger p:passengers) {
			System.out.println("Name: "+p.getName());
			System.out.println("Age: "+p.getAge());
			System.out.println("Email: "+p.getEmailId());
			System.out.println("Booking Email: "+email);
			System.out.println("Ticket ID "+(p.getAge() + p.getName().substring(2))+p.getEmailId().substring(0,2));
			System.out.println();
		}
	}
	
	
	void showMyFlight(String email) {
		if(!this.flight_database.containsKey(email)) {
			System.out.println("This Email Has not booked any Flight ");
			return;
		}
		
		ArrayList<Flight>flights = this.flight_database.get(email);
		for(Flight x : flights) {
			System.out.println("Source: "+x.getSource()+", Destination: "+x.getDestination());
			System.out.println("Flight name: "+x.getFlightName()+" ("+x.getFlightNumber()+")");
			System.out.println("Ticket Price: "+x.getTicketPrice());
			System.out.println();
		}
	}
	
	void cancelTicket(String email) {
		if(!this.flight_database.containsKey(email)) {
			System.out.println("This Email Has not booked any Flight ");
			return;
		}
		this.flight_database.remove(email);
		this.database.remove(email);
		System.out.println("Your Booking has been cancelled");
	}
	
	
	HashMap<String,ArrayList<Passenger>> reservations(){
		return this.database;
	}
	
	HashMap<String,ArrayList<Flight>> flights(){
		return this.flight_database;
	}
	
}
