
package Revision;
import java.util.*;
public class Zero_sum_subsrray_count {

	public static void main(String[] args) {
		int[]a = {10, 2, -2, -20, 10};
		zss(a);
	}
	
	public static void zss(int[]a) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			
			sum = sum + a[i];
			
			if(!map.containsKey(sum)) {
				map.put(sum, 1);
				
			}
			else {
				int oldCounter = map.get(sum);
				int newCounter = oldCounter + 1;
				map.put(sum, newCounter);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> set : map.entrySet() ) {
			if(set.getValue()>1) {
				System.out.println(set.getValue());
			}
		}
		
	}

}
