package projects;
import java.util.Scanner;
public class Atm {
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		Registered reg = new Registered();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello User !");
		System.out.println("Are you a registered user ");
		String s = scan.nextLine();
		
		if(s.equalsIgnoreCase("no")){
			
			System.out.println("Do you want to register : ");
			String decision = scan.nextLine();
			
				if(decision.equalsIgnoreCase("yes")) {

					System.out.println("Enter Your name ");
					String name = scan.next();
					System.out.println("Please enter a 10 digit card number of your choice ");
					String cardNum = scan.next();
					if(cardNum.length()!=10  &&  cardNum.equals(reg.cardNum) ) {
						System.out.println("Your card number is Invalid ");
					}
					
					else {
					System.out.println("Please enter a 4 digit PIN number : this would be your PIN number");
					String pin = scan.next();
					if(pin.length()!=4) {
						System.out.println("Your pin is Invalid ");
					}
					else {
						
						newRegistration newReg = new newRegistration(name , cardNum , pin);
						newReg.operations();
						
					}
					
			}
	}
			
				if(!decision.equalsIgnoreCase("yes")) {
				System.out.println("Thank you user,now you can leave! ");
			}
			
		}
		
		if(s.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter Your card number : ");
			String cardNumber = scan.next();
			
			if(cardNumber.length() != 10) 
			{
				System.out.println("Invalid Card Number ");
			}
			
			else 
			{
				int count = 0;
				if(cardNumber.equals(reg.cardNum)) {
					
					System.out.println("Enter your 4 digit pin :");
					while(count <=3) {
						
						count++;
						String pin = scan.next();
						
						if(pin.equalsIgnoreCase(reg.pin)) {
							// enter login details for oldly registered
							oldRegistraionDetails obj = new oldRegistraionDetails();
							obj.showDetailsOldRegistered();
							break;
						}
						
						if(!pin.equalsIgnoreCase(reg.pin) && count!=3 ) {
							System.out.println("Wrong pin , you can enter your pin again ");
						}
						
						if(count == 3) {
							System.out.println("Your card has been blocked due to multiple wrong inputs");
							break;
						}
						
					}

				}
				else {
					System.out.println("card not found");
				}
			}
		}
	}
	
}

class Registered{
	String name = "Tirtha";
	String cardNum = "1234567890";
	String pin = "2468";
	double bankBalance = 25000;
	double lastTranscation = 0;
	double withdraw = 0;
	double deposit = 0;
}

class newRegistration{
	String name;
	String cardNum;
	String pin ;
	double bankBalance ;
	double lastTranscation;
	double withdraw;
	double deposit;
	
	newRegistration(String name , String cardNum , String pin) {
		this.name = name;
		this.cardNum = cardNum;
		this.pin = pin;
		
		details();
	}
	
	void details() {
		System.out.println("Details : ");
		System.out.println("   Name : "+ name);
		System.out.println("   Card Number : "+ cardNum);
		System.out.println("   Bank Balance : "+ (int)bankBalance);
		System.out.println("   PIN : "+ pin);
	}
	
	void deposit(double amount) {
		double newBal = 0;
		newBal = amount + bankBalance; 
		bankBalance = newBal;
		
		System.out.println("An amount of "+amount+" has been credited in your account ; Available balance : "+ bankBalance);
	}
		
	void operations() {
		Scanner scan = new Scanner(System.in);
		System.out.println("press 1 for details , press 2 for deposit and 3 to leave : ");
		int dec = scan.nextInt();
		if(dec == 1) {
			details();
		}
		
		else if(dec == 2) {
			System.out.println("Enter the amount you want to deposit : ");
			double amount = scan.nextDouble();
			deposit(amount);
		}
		else if(dec == 3) {
			System.out.println("Thank You "+ name);
		}
		else {
			System.out.println(" Invalid ");
		}
	}
}

class oldRegistraionDetails{
	Registered regObj = new Registered();
	void showDetailsOldRegistered() {
		System.out.println("Name : "+ regObj.name);
		System.out.println("Card Number : "+ regObj.cardNum);
		System.out.println("Bank Balance : "+ (int)regObj.bankBalance);
		System.out.println("PIN : "+ regObj.pin);
	}

}
