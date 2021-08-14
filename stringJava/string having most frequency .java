package trial;
import java.util.*;

public class convertor {
	public static void main(String[]args) { 
		String[] a = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa","aaa","Tirtha",
				"lol","Tirtha","Tirtha","Tirtha","Tirtha","Tirtha","Tirtha"};

		HashMap<String,Integer> hm = new HashMap<>();  //key -> String   value->Integer
		
		
		// this loop right there is used to 
		// put counts of each element of the array 
		// along with its count
		for(int i=0;i<a.length;i++) {
			
			if(!hm.containsKey(a[i])) {
			hm.put(a[i], 1);
			}
			if(hm.containsKey(a[i])) {
				int oldValue = hm.get(a[i]);
				int newValue  = oldValue+1;
				
				hm.put(a[i], newValue);
			}
			
			}
		
		


		int max =0;

		// this loop is used to find the count of the maximum value [here 7 (Tirtha)]
		   for (Map.Entry<String,Integer> entry : hm.entrySet()) {
			if(entry.getValue()>max )
				max = entry.getValue();	
		   }
		   
		   
		   // this loop is used to iterate the hashTable and see 
		   // if any value matches max then print its key
		   for (Map.Entry<String,Integer> entry : hm.entrySet()) {
				int ans_value = entry.getValue();
				if(ans_value == max) {
					System.out.println(entry.getKey());
				}
			   }
		   

	}
	
}
