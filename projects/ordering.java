/*
   Name : Ordering System
   @author : Tirtha Jyoti Bol
   Version : 1.1
   
   Needs to be done : 
		1. Need to make synchronization to order goods from different fields at a same time
   Bugs :
        1. 
*/

package projects;
import java.util.*;
public class ordering {
	static Scanner scan;
	
	public boolean Onlinepayment;   // flag if payment is done online -> if not done online then COD
	public String name;
	public String Address;
	public String Phone;
	public static boolean cancel;
	public static int total = 0;
	
	    ordering(){	};
	
		public ordering(String name , String Address , String Phone) {
		  this.name = name;
		  this.Phone = Phone;
		  this.Address = Address;
		}
		  
		  void orderPlaced() {
			  
			  System.out.print("Hello "+name+" Your Order Has been generated and would be delivered to "+Address+", We will contact you at "+Phone);
			  System.out.println(" Total : Rs"+total);
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
		
		// Food Order
		if(choose == 1) {
//			FoodOrder food = new FoodOrder();
//			food.menu();
//			if(food.payment == true) {
//				order.orderPlaced();
//			}
//			else {
//				order.orderCancelled();
//			}
			food f = new food();
			f.list();
			if(f.payment == true) {
				order.orderPlaced();
			}
			else {
				order.orderCancelled();
			}
		}
		
		// Groceries Order
		else if(choose == 2) {
			Groceries gro = new Groceries();
			gro.list();
			if(gro.payment == true) {
				order.orderPlaced();
			}
			else {
				order.orderCancelled();
			}
		}
		else if(choose == 3) {
			clothes clo = new clothes();
			clo.list();
			if(clo.payment == true) {
				order.orderPlaced();
			}
			else {
				order.orderCancelled();
			}
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		
	}
	
	static class FoodOrder{
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
			
			System.out.println("Type -1 when your Ordering is Over and press any key if you want to Order more ");
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
						total = pay;
						System.out.println("Paid! congratulations your order has been succesful ");
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
	
	static class food{
		boolean payment;
		int pay = 0;
		void list() {
			System.out.println("Your Food Dishes list is shown below, select what you want to Order");
			HashMap<String , Integer> list = new HashMap<>();
			list.put("Chilly Chicken",250);
			list.put("Butter Chicken",200);
			list.put("Naan",5);
			list.put("Pasta",120);
			list.put("Macroni",150);
			list.put("Pizza",299);
			list.put("Burger",75);
			list.put("Sushi",1135);
			list.put("Ginger Lemon tea",150);
			for(Map.Entry<String,Integer> lists : list.entrySet()) {
				System.out.println("Item : "+lists.getKey() +" ("+lists.getValue()+")");
			}
			
			System.out.println("What you want to order ");
			
			while(true) {
			
			String ord = scan.next();
			if(list.containsKey(ord)) {
				pay = pay + list.get(ord);
			}
			else {
				System.out.println("Item Not found");
			}
			
			System.out.println("Type -1 to Order , Type 0 to cancel and type any other key to order more ");
			int choose = scan.nextInt();
			
			// Customer has finished shopping and has to order
			if(choose == -1) {
				
				System.out.println("You have a total of Rs"+ pay +" to pay Do You Want to pay Online ");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("yes")) {
					System.out.println("Press 5 to pay");
					int onlinePay = scan.nextInt();
					if(onlinePay == 5) {
						payment = true;
						total = pay;
						System.out.println("Paid Successfully ");
					}
					else {
						payment = false;
						System.out.println("Transaction Error ");
					}
				}
				else {
					total = pay;
					payment = true;
					System.out.println("Your order has been taken into action , you have choosen COD ");
				}
				
				break;
		  }
			
			if(choose == 0) {
				payment = false;
				cancel = true;
				System.out.println("Your Order has been cancelled");
				break;
			}
			
	   }
				
    }
 }
	
	
	
	static class Groceries{
		boolean payment;
		int pay = 0;
		void list() {
			System.out.println("Your Grocery item list is shown below, select what you want to purchase");
			HashMap<String , Integer> list = new HashMap<>();
			list.put("Rice", 60);
			list.put("Sugar", 40);
			list.put("Salt", 20);
			list.put("Dal", 50);
			for(Map.Entry<String,Integer> lists : list.entrySet()) {
				System.out.println("Item : "+lists.getKey() +" ("+lists.getValue()+")");
			}
			
			System.out.println("What you want to order ");
			
			while(true) {
			
			String ord = scan.next();
			if(list.containsKey(ord)) {
				pay = pay + list.get(ord);
			}
			else {
				System.out.println("Item Not found");
			}
			
			System.out.println("Type -1 to Order , Type 0 to cancel and type any other key to order more ");
			int choose = scan.nextInt();
			
			// Customer has finished shopping and has to order
			if(choose == -1) {
				
				System.out.println("You have a total of Rs"+ pay +" to pay Do You Want to pay Online ");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("yes")) {
					System.out.println("Press 5 to pay");
					int onlinePay = scan.nextInt();
					if(onlinePay == 5) {
						payment = true;
						total = pay;
						System.out.println("Paid Successfully ");
					}
					else {
						payment = false;
						System.out.println("Transaction Error ");
					}
				}
				else {
					total = pay;
					payment = true;
					System.out.println("Your order has been taken into action , you have choosen COD ");
				}
				
				break;
		  }
			
			if(choose == 0) {
				payment = false;
				cancel = true;
				System.out.println("Your Order has been cancelled");
				break;
			}
			
	   }
			
			
    }
 }
	
	
	
	static class clothes{
		boolean payment;
		int pay = 0;
		void list() {
			System.out.println("Your clothes item list is shown below, select what you want to purchase");
			HashMap<String , Integer> list = new HashMap<>();
			list.put("Sports", 1999);
			list.put("Jeans", 1700);
			list.put("Shirt", 900);
			list.put("Joggers", 899);
			list.put("Shorts", 600);
			list.put("Underwears", 500);
			for(Map.Entry<String,Integer> lists : list.entrySet()) {
				System.out.println("Item : "+lists.getKey() +" ("+lists.getValue()+")");
			}
			
			System.out.println("What you want to order ");
			
			while(true) {
			
			String ord = scan.next();
			if(list.containsKey(ord)) {
				pay = pay + list.get(ord);
			}
			else {
				System.out.println("Item Not found");
			}
			
			System.out.println("Type -1 to Order , Type 0 to cancel and type any other key to order more ");
			int choose = scan.nextInt();
			
			// Customer has finished shopping and has to order
			if(choose == -1) {
				
				System.out.println("You have a total of Rs"+ pay +" to pay Do You Want to pay Online ");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("yes")) {
					System.out.println("Press 5 to pay");
					int onlinePay = scan.nextInt();
					if(onlinePay == 5) {
						payment = true;
						total = pay;
						System.out.println("Paid Successfully ");
					}
					else {
						payment = false;
						System.out.println("Transaction Error ");
					}
				}
				else {
					payment = true;
					System.out.println("Your order has been taken into action , you have choosen COD ");
				}
				
				break;
		  }
			
			if(choose == 0) {
				payment = false;
				cancel = true;
				System.out.println("Your Order has been cancelled");
				break;
			}
			
	   }
			
			
    }
 }
	
	
	

}
