package zenmotek;

public class Flight {
	protected int flight_number;
	protected String airline_name;
	protected String source;
	protected String destination;
	protected double ticket_price;
	
	Flight(int flight_number, String airline_name, String source, String destination, double ticket_price ){
		this.airline_name = airline_name;
		this.flight_number = flight_number;
		this.source = source;
		this.destination = destination;
		this.ticket_price = ticket_price; 
	}
	
	int getFlightNumber() {
		return this.flight_number;
	}
	
	String getFlightName() {
		return this.airline_name;
	}
	
	String getSource() {
		return this.source;
	}
	
	String getDestination() {
		return this.destination;
	}
	
	
	double getTicketPrice() {
		return this.ticket_price;
	}
	
	void showFlightDetail() {
		System.out.println("Flight Number "+this.flight_number);
		System.out.println("Airline "+this.airline_name);
	}
	
}	
