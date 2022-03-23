package Elevator;
import java.util.*;
public class Operate {
	public static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws Exception {
		Lift lift = new Lift();
		
		// Before Starting the Lift 
		int currentFloor = lift.currentFloor();
		System.out.println(currentFloor);
		
		
		// Move to the Floor
		int c = lift.MoveTo(10);
		System.out.println("Current floor : "+c);
		
		c = lift.MoveTo(1);
		System.out.println("Current floor : "+c);
	}
	
	
	


}
