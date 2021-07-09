package trial;
import java.util.*;

public class nono {
	public static void main(String[]args) {
		int[]a= {1, 2, 3};
		int k=2;
		
		Arrays.sort(a);
		//initial minimum and maximum value 
    
		 int  min = 0;
		 int  max = 0;
		 
		
		int answer =a[a.length-1]-a[0];
		 
		       //consider minimum and maximum in each case by adding and subtracting each element by k ;
	       //if min after +-k  value is less than the initial then update min by teh current min value
  		  //do the same for max
	     
		for(int i=1;i<a.length;i++) {                                   
			if(a[i]>=k) {
			 min = Math.min(a[i]-k,a[0]+k);
			 max = Math.max(a[i-1]+k, a[a.length-1]-k);
			 answer = Math.min(answer, max-min);
			}
			else {
				continue;
			}
			
			
		}
		System.out.println(answer);	
			
	}
}
