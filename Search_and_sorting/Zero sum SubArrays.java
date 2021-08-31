/*     
 			Q. Count the number Subarrays having sum = 0
 			
 			ALGO 
 		     	1. Take a HashMap
 		     	2. initially take sum as 0 and put its count as 1
 		     	3. Make a frequency table of sum and its count
 		     	4. Check if the count is alreay present
 		     	5. If present then increase the frequency
 		     	     else put key with its pair as 1
 		     	6. Pepcoding 
  
     
     */

package Search_and_sorting;
import java.util.*;
public class Zero_sum_subarrays {
	public static void main(String[]args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int []a = {0,0,5,5,0,0};
		int sum = 0;
		int count = 0;
		map.put(sum,1);
		for(int i=0; i<a.length ; i++) {
			sum += a[i];
			
			if(map.containsKey(sum)==false) {
				map.put(sum,1);
			}
			
			else {
				int oldValue = map.get(sum);
				map.put(sum,oldValue+1);
				count = count+oldValue+1-1;
			}
		}
		
		System.out.println(count);
	}

}
