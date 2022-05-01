/*
 
 		1
 	 1     1
   1    2     1
 1   3     3     1
 
 - At ith row there should be i columns
 - curr row = Addition(prevRow column-1 , prevRows's column)
  
  */

package Arrays;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		int n = 6;
		print(n);
	}
	
	static void print(int n) {
		ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
		ArrayList<Integer>prev = new ArrayList<>();
		// Traverse each rows
		for(int i=0;i<n;i++) {
			ArrayList<Integer> currRow = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {		// first and last element in the column is always 1
					currRow.add(1);
				}
				else {
					currRow.add(prev.get(j-1) + prev.get(j) );
				}
			}
			
			// update the prev row each time
			prev = currRow;
			ans.add(currRow);
		}
		
		System.out.println(ans);
	}

}
