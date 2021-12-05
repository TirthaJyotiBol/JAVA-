/*
  Q.  * Given 2 Arrays : petrol pump and Distance 
      * Assume that the driver travels in circular direction
      * What would be the starting point from where he can travel the whole without losing fuel
          if he cant complete then return -1
          
       Algorithm : 
         1. Take start = 0 (the point which we want to return)
         2. Take AvailableFuel = 0 ( AvailableFuel = AvailableFuel + [petrol - distance] )
         3. Take requiredFuel = 0 (whenever AvailableFuel becomes -ve  => put that value of AvailableFuel in requiredFuel)
         4. when Available fuel becomes -ve then make start = i+1
         5. Traverse the whole Array
         6. if the AvailableFuel + requiredFuel > 0 return start
             else return -1
     
  		( If the start point becomes -ve that means it is sure than less then that index the cant exist start point )
  		( The requiredFuel is created just not to traverse the array again )
  
  */

package Queue;
public class CircularTourPetrolPump {
	public static void main(String[]args) {
		int[]petrol= {4 ,6 ,7 ,4};
		int[]distance = {6, 5, 3 ,5};
		
		int ans = tour(distance,petrol);
		System.out.println(ans);
	}
	
	public static int tour(int[]distance,int[]petrol) {
		int start = 0;
		int availableFuel = 0;
		int requiredFuel = 0;
		
		for(int i=0;i<distance.length;i++) {
			availableFuel += (petrol[i] - distance[i]);
			  //if available fuel becomes negative
			if(availableFuel<0) {
				start = i+1;
				requiredFuel += availableFuel;
				availableFuel = 0;
			}
		}
		
		if(availableFuel + requiredFuel >=0) return start;
		
		return -1;
		
		
	}
}
