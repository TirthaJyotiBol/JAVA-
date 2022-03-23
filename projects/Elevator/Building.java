package Elevator;
public class Building {
	
	int total_floors = 25;
	String building_name = "Tirtha";
	
}



/*	protected static Scanner scan = new Scanner(System.in);
	static int total_floors;
	String Building_name;
	
	// constructor to set building 
	Building(){};
	Building(int total_floors,String Building_name)
	{
		this.total_floors = total_floors;
		this.Building_name = Building_name;
	}
	
	
	 int buildingSize() {
		return total_floors;
	}
	
	 
	 // method to set building
	static void setBuilding() 
	{	
		
		try {
			System.out.println("Enter the Name of the Building");
			String building_name = scan.nextLine();
			
			System.out.println("Enter the total number of floors ");
			int total_floors = scan.nextInt();

			Building building  = new Building(total_floors,building_name);
			System.out.println(building.Building_name+" "+building.total_floors);
		}
		catch(Exception e) {
			System.out.println("Error in name or integer");
		}
			
	}*/