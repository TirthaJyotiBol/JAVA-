package zenmotek;

public class Implement {

	void render() {
		Reservations r = new Reservations();
		r.bookTicket();
		
		Payments p = new Payments(r);
		p.yourTotal();
		
		r.showMyTicket("hhhh");
	}
	
	public static void main(String[] args) {
		
	}

}
