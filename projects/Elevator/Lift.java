package Elevator;
import java.util.concurrent.TimeUnit;


public class Lift extends Building{
	int total_floors = super.total_floors;
	int curr_floor;
	
	public Lift(){
		curr_floor = 0;	
	}
	
	
	int MoveTo(int next_floor) throws Exception {
		
		// building size exceed 
		if(next_floor > total_floors ) {
			System.out.println("There Exists a total of "+total_floors+" in the Building");
			return curr_floor;
		}
		
		else if(next_floor < 0) {
			System.out.println("Building floor cannot be negative ");
			return curr_floor;
		}
		
		
		// move to next floor
		// 1. if my next floor is larger than current floor i.e. go upwards
		if(next_floor > curr_floor ) {
			while(curr_floor != next_floor) {
				curr_floor++;
				System.out.println(curr_floor);
				TimeUnit.SECONDS.sleep(1);
			}
		}
		
		// 2. go downwards
		else if(next_floor < curr_floor ) {
			while(curr_floor >=0 && curr_floor!=next_floor  ) {
				curr_floor--;
				System.out.println(curr_floor);
				TimeUnit.SECONDS.sleep(1);
			}
		}
		
		return curr_floor;
	}
	
	int currentFloor() {
		return this.curr_floor;
	}

}
