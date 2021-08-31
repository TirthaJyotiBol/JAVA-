/*   
    	
    	ALGO -
    	1. sort the array
    	2. i = 0 ; low = i+1 ;  high = a.length-1
    	3. 1st number = a[i]  
    	    use 2 pointers to find the other numbers
    	4. As soon as we find High + low  >= target we keep decrementing high
    	5. if low + High < target then all the elements from high to low would be smaller 
    	      reason for this is that the array is sorted
    	
     */

package Search_and_sorting;
import java.util.Arrays;

public class ThreeSumLessThan_X {
	public static void main(String arge[]) {
		
		 int a[] = {5, 1, 3, 4, 7};
		   int count = 0;
		   int target = 12;
		   Arrays.sort(a);
		  
		   for(int i=0;i<a.length-2;i++) {
			   int low = i+1;
			   int high = a.length-1;
			   
			   while(low<high) {
			   int sum = a[i]+a[low]+a[high];
			   
			   // If found sum < target then all the elements from
			   // low to high would be less than target
			   // reason -> array is sorted
			   if(sum<target) {
				   count = count + high - low ;
				   low++;
			   }
			   // If found sum > target then decrement high
			   else {
				   high--;
			   }
			   
		   }
		   
	   }
		   
		   System.out.println(count);

		
	}

}
