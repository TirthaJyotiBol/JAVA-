/* 
  Take the max and min of a[0] and a[1]
  
  		1. Start the loop from a[2] and compare elements of i & i+1 to max and min
  		2. if(a[i]>a[i+1]) => then if exists any max element then it would be a[i] ; hense compare a[i] with max 
  		   for the same reason we compare a[i+1] with min
  		3. Similarly if a[i] < a[i+1] that means if any min element exist it would be at a[i]  so compare elements of a[i] with min
  		   for the same reason we compare a[i+1] with max
  
   */


package Search_and_sorting;
import java.util.*;
public class Maximum_and_minimumElement {

	public static void main(String[] args) {
		int[]a= {6,5,7,10,4,1,10,7,23,43,6,0,9,1,3};
		int max=Math.max(a[0],a[1]);
		int min = Math.min(a[0],a[1]);
		
		// counter counts the number of times its compared
		int c1=0;
		int c2=0;
		
		int i=2;
		while(i<a.length-1){
			// if a[i] < a[i+1] then obviously a[i] cannot be max ; hense for max
			// we only compare a[i+1] 
			// similarly min would only be a[i] ; hense we compare min with element of a[i] , not a[i+1]
			if(a[i]<a[i+1]) {
				if(a[i+1]>max) {
					max=a[i+1];
					c1++;
				}
				if(a[i]<min) {
					min=a[i];
					c2++;
				}
			}
			
			
			// here if a[i] > a[i+1] that means if max exists then it would only be the value in a[i] 
			// and min would only be at a[i+1]
			// hense compare for ,max at a[i] && min at a[i+1]
			if(a[i+1]<a[i]) {
				if(a[i+1]<min) {
					min=a[i+1];
					c2++;
				}
				if(a[i]>max) {
					max=a[i];
					c1++;
				}
			}
			
			
			i=i+1;
			
		}
		
		
		
		System.out.println(max+" "+c1);
		System.out.println(min+" "+c2);
		
		
	}
	
}
