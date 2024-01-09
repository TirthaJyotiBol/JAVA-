package zenmotek;

public class Passenger {
	
	private String name;
	private int age;
	private String email;
	private double ticket_price;
	
	Passenger(String name,int age,String email){
		this.age = age;
		this.name = name;
		this.email = email;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setPrice(double price) {
		this.ticket_price = price;
	}
	
	double getPrice() {
		return this.ticket_price;
	}
	
	String getEmailId() {
		return this.email;
	}
	
	
}
