package zenmotek;
import java.util.*;

public class Payments {
	
	private Scanner scan = new Scanner(System.in);
	private Reservations r;
	Payments(Reservations r){
		this.r = r;
	}
	
	void yourTotal() {
		
		HashMap<String,ArrayList<Flight>> flight_database = r.flights();	
		ArrayList<Flight> flights = flight_database.get(r.booking_email);
		
		
		// calculate price
		double total_price = 0;
		
		for(Flight f:flights) {
			total_price += f.getTicketPrice();
		}
		
		// shows detail about confirmation
		showConfirmation(total_price);
			
		boolean success = pay();
		
		if(success) {
			System.out.println("Congratulations! Your booking has been successful, you will soon receive an email regarding this");
		}
		else {
			System.out.println("Your Booking has been cancelled !!");
			
			if(flight_database.containsKey(r.booking_email)) {
				flight_database.remove(r.booking_email);
			}
			
			HashMap<String,ArrayList<Passenger>> pass = r.reservations();
			if(pass.containsKey(r.booking_email)) {
				pass.remove(r.booking_email);
			}
		}
		
	}
	
	private void showConfirmation(double totalPrice) {
		// confirmation detail
		System.out.println("Booking Name: "+r.booking_name);
		System.out.println("Booking Email: "+r.booking_email);
		System.out.println();
				
		r.showMyTicket(r.booking_email);
		r.showMyFlight(r.booking_email);
				
				
		System.out.println("Total Ticket Price :"+totalPrice);
				
		System.out.println("You are one step behind booking");
					
	}
	
	
	// it proceeds with the payment detail
	// returns false if payment is cancelled
	private boolean pay() {
		System.out.println("Press :");
		System.out.println("1 upi");
		System.out.println("2 net banking");
		System.out.println("3 pay later");
		System.out.println("4 Cancel");
		System.out.println("Any other key to pay by cash");
		
		int opt = scan.nextInt();
		
		if(opt==1) {
			System.out.println("UPI Initiating....");
		}
		
		else if(opt==2) {
			System.out.println("Redirecting to net banking website ....");
		}
		
		else if(opt==3) {
			System.out.println("EMI option : Redireting to EMI Bank...");
		}
		
		else if(opt==4)
		{
			System.out.println("Cancelling the Ticket...");
			return false;
		}
		else {
			System.out.println("Yaah ! You choose cash");
		}
		
		return true;
	}
	
}
	

