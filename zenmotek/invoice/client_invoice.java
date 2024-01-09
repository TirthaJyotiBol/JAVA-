import java.util.*;

public class client_invoice {
	
	static HashMap<Integer,Client>database = new HashMap<>();
	static int hourly_pay = 200;
	static Scanner scan = new Scanner(System.in);
	
	static class Client
	{
		private String name;
		private int id;
		private String address;
		private double hours_worked;
		
		Client(String name,int id,String address,double hours_worked){
			this.name = name;
			this.id = id;
			this.address = address;
			this.hours_worked = hours_worked;
		}
		
		String getName() {
			return this.name;
		}
		
		// get id
		int getId() {
			return this.id;
		}
		
		// get Address
		String getAddress() {
			return this.address;
		}
		
		// get hours
		double getHours() {
			return this.hours_worked;
		}
		
	}
	
	
	static class Invoice{
		
		void addClient() {
			System.out.println("Enter name");
			String name = scan.next();
			
			System.out.println("Enter id");
			int id = scan.nextInt();
			
			System.out.println("Enter address");
			String address = scan.next();
			
			System.out.println("Enter number of hours worked");
			double hours = scan.nextDouble();
			
			Client c = new Client(name,id,address,hours);
			database.put(id, c);
			
			System.out.println("Added to  database successfully...");
		}
		
		
		// calculate and display invoice
		void calculateInvoice() {
			System.out.println("Enter client id ");
			int id = scan.nextInt();
			
			if(database.containsKey(id)==false) {
				System.out.println("Client must be added before creating invoice");
				System.out.println(database);
			}
			
			else {
				this.calculateInvoiceHelper(id);
			}
		}
		
		
		private void calculateInvoiceHelper(int id) {
			Client client = database.get(id);
			
			String name = client.getName();
			String address = client.getAddress();
			double hours = client.getHours();
			
			// $200 per hour so for h hours it would be 200*h
			double payment = hours * hourly_pay;
			
			// deduct tax of 8%
			double tax = (0.08*payment);
			payment = (payment - tax );
			
			System.out.println("id: "+id);
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("Total Hours worked: "+hours);
			System.out.println("Payment: "+payment);
			System.out.println("Tax included: "+tax);
		}
		
	}
	
	static void render() {
		
		while(true) {
			System.out.println("Select Options ");
			System.out.println(1+" Add Client");
			System.out.println(2+" Show Invoice");
			System.out.println(3+" Quit");
			
			int option = scan.nextInt();
			Invoice i = new Invoice();
			
			if(option==1) {
				i.addClient();
			}
			
			else if(option==2) {
				i.calculateInvoice();
			}
			
			else if(option==3) {
				System.out.println("Quit! Thank you....");
				break;
			}
			else {
				System.out.println("Invalid Option");
			}
			System.out.println();
		}
	
		
	}

	public static void main(String[] args) {
		render();
	}

}
