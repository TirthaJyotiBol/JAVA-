/*  	
   			ALGO ->
   			1. Take 2 for loops from 0 -> n to find sum of 2 numbers
   			3. Take     Low = j+1;
   			 			high = a.length-1;
   			 			
   			3. Find the two_sum of the other 2 numbers using 2 pointers algorithm 
   			4. if sum of a[low] a[high] a[i] a[j]  equals the target 
   			5. Add these numbers into the list
   			6. return the list of lists
   			
   			Upto this we will get all the element list of 4 that would make a total of sum == target
   			But there are many duplicate list in the answer list
   			To redcuce we either use HashSet instead of arraylist
   			
   			here we use another method
   			-> as soon as any duplicate element is found we skip the element
   			
    */

package Search_and_sorting;
import java.util.*;
public class FourSum {
	public static void main(String[]args) {
		int[]a= {10,2,3,4,5,7,8};
		int target = 23;
		
		ArrayList<ArrayList>list = new ArrayList<>();
		Arrays.sort(a);
		
		// This a[i] and a[j] would give us the first 2 elements
		for(int i = 0 ; i<a.length ; i++) {
			for(int j = i+1 ; j<a.length ; j++) {
				
				int sum_one = a[i] + a[j];
				int low = j+1;
				int high = a.length-1;
				
				while(low<high) {
					int target2 = target - sum_one;
					int sum_two = a[low]+a[high];
					
					if(sum_two<target2) {
						low++;
					}
					else if(sum_two>target2) {
						high--;
					}
					else {
						ArrayList<Integer>quad = new ArrayList<>();
						quad.add(a[i]);     // 0 (index)
						quad.add(a[j]);     // 1
						quad.add(a[low]);   // 2
						quad.add(a[high]);  // 3
						list.add(quad);
						
						//Remove duplicates -> if low == low+1 
						//then skip the duplicates as the array is sorted
						// 2 -> low index at quad
						// 3 -> high index at quad
						while(low<high  && a[low]==quad.get(2))low++;
						while(low<high && a[high]==quad.get(3))high--;
						
					}	
				}
				
				// Remove the duplicates in between first sum
				while(i<a.length-1 && a[i]==a[i+1])  i++;
				
				while(j<a.length-1 && a[j]==a[j+1]) j++;

			}
		}
		
		System.out.println(list);
		
	}
	

}
