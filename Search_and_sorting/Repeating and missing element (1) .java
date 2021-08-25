/*    
   		Repeating 
   		   a[i] == a[i+1] -> repeat
   	
   		   
   		   
   		   
   		Missing 
   		    Total sum of size     = n*(n+1) / 2
   		    
   		    Sum of unique element = sum of all elements - Repeating element
   		    
   		    Missing Element =       Total sum of size -  Sum of unique element
  
 */


package Search_and_sorting;
public class Missing_and_repeating_met1 {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5,6,6,8};
		int n = a.length;
		
		
		// Repeat Element
		int repeat = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				repeat =a[i];
			}
		}
		
		
		
		// Missing Element
		int miss = 0;
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];		// Sum of all the elements
		}
		
		sum = sum - repeat;    // This would give us the sum of the unique elements
		
		int totSum = n*(n+1)/2;
		miss = totSum - sum;
		
		
		System.out.println("Repeating Element : "+ repeat);
		System.out.println("Missing Element : "+ miss);

	}

}
