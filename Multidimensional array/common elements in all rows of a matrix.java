/*
put the 0th row into the hashMap
put other row elements into the table if its already present
thus we can get the common elements
*/
package trial;
import java.util.*;

public class convertor {
	public static void main(String[]args) { 
		HashMap<Integer,Boolean>hm2 = new HashMap<>();
		int a[][] =
		    {
		        {1, 2, 1, 4, 8},
		        {3, 7, 8, 5, 1},
		        {8, 7, 7, 3, 1},
		        {8, 1, 2, 7, 9},
		    };
		


	     	for(int i=0;i<a.length;i++) {         
				hm2.put(a[i][0],null);   			//put  the 1st row elements at the hashmap
				i++;                               // since we need to compare from 1st row thus we increase i->0 to 1
			for(int j=0;j<a[0].length;j++) {
				if(hm2.containsKey(a[i][j])) {
					hm2.put(a[i][j], null);
				}
				
		
			}
		}
	     	
	     	for (Map.Entry<Integer,Boolean> entry : hm2.entrySet())
	            System.out.print(entry.getKey()+" ");
	    }
	     	
	     	
		
	
	}
	

