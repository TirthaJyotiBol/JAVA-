/*
Need to make synchronization to order goods from different fields at a same time
*/

package projects;
import java.util.*;
public class ordering {
	static Scanner scan;
	
	public boolean Onlinepayment;   // flag if payment is done online -> if not done online then COD
	public String name;
	public String Address;
	public String Phone;
	
	    ordering(){	};
	
		public ordering(String name , String Address , String Phone) {
		  this.name = name;
		  this.Phone = Phone;
		  this.Address = Address;
		}
		  
		  void orderPlaced() {
			  
			  System.out.println("Hello "+name+" Your Order Has been generated and would be delivered to "+Address+", We will contact you at "+Phone);
			  System.out.println("Thank You !");
		  }
		  
		  void orderCancelled() {
			  System.out.println("Hello "+name +" Your Order has been cancelled due to some reasons! We are sorry for this ");
			  System.out.println("Thank You");
		  }
	
	public static void main(String[]args) {
		
		scan = new Scanner(System.in);
		System.out.println("Hello User , please enter the details below : ");
		
		// Enter User Details 
		System.out.println("Enter Your Name : ");
		String name = scan.nextLine();
		System.out.println("Enter Your Phone Number :");
		String Phone = scan.nextLine();
		System.out.println("Enter Your Address : ");
		String Address = scan.nextLine();
		
		
		ordering order = new ordering(name,Address,Phone);
		
		// choose 
		System.out.println("what are you searching for : please select a number  ");
		System.out.println("1. Food Order");
		System.out.println("2. Groceries ");
		System.out.println("3. Clothes ");
		
		int choose = scan.nextInt();
		if(choose == 1) {
			FoodOrder food = new FoodOrder();
			food.menu();
			if(food.payment == true) {
				order.orderPlaced();
			}
		}
		else if(choose == 2) {
			System.out.println("Groceries Shopping");
		}
		else if(choose == 3) {
			System.out.println("Clothes Shopping ");
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		
	}
	
	static class FoodOrder{
		int price;
		String order;
		boolean payment;
		int pay=0;
		
		void menu() {
			System.out.println("Hello User! , Your Menu is Shown Below Please Choose any one from the menu");
			HashMap<String , Integer> menu = new HashMap<>();
			menu.put("Chilly Chicken",250);
			menu.put("Butter Chicken",200);
			menu.put("Naan",5);
			menu.put("Pasta",120);
			menu.put("Macroni",150);
			menu.put("Pizza",299);
			menu.put("Burger",75);
			menu.put("Sushi",1135);
			menu.put("Ginger Lemon tea",150);
			
			for (Map.Entry<String,Integer> entry : menu.entrySet())
	            System.out.println("Dish : " + entry.getKey() + "( Rs." + entry.getValue()+" )");
			
			System.out.println("Enter Your Dish Name : ");
			while(true) {
				
			String orderFood = scan.next();
			if(menu.containsKey(orderFood)){
				pay = pay + menu.get(orderFood);
			}
			
			else{
				System.out.println("Sorry this Dish is not present in the menu");
			}
			
			System.out.println("Press -1 when your Ordering is Over and press any key if you want to Order more ");
			int orderOver = scan.nextInt();
			if(orderOver == -1) {
				System.out.println("You have a total of Rs."+pay+" to be payed");
				System.out.println("Do You Want to pay Online YES or NO ");
				String decision = scan.next();
				if(decision.equalsIgnoreCase("yes")) {
					System.out.println("Press 5 to pay ");
					int payOnline = scan.nextInt();
					if(payOnline == 5) {
						payment = true;
						System.out.println("Paid! congratulations your order has been succesfull ");
					}
					else {
						System.out.println("Payment failed");
					}
				}
				else if(decision.equalsIgnoreCase("no")) {
					System.out.println("Your Food Will be Delivered to you to your Address, You need to opt COD ");
				}
				else {
					System.out.println("invalid ");
				}
				break;
			}
			
			
		}
		}
		 
	}

}
