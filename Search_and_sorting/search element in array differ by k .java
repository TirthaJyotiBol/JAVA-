/*  Q. Search element in the Array where elements are differ by atmost k

		1. Search for element in array 
		2. Instead of jumping by 1 , we jump by (search - a[i]) / k
		3. Math.abs() is used so that we can get only positive value => if difference is -ve then it converts it into +ve
		4. Math.max() is used because if the abs value comes to be 0 ; then jump by atleast 1

   
   */

package Search_and_sorting;
import java.lang.Math;
public class Find_element_differ_by_k_difference {
	public static void main(String[]args) {
		int[]a={20, 40, 50, 70, 70, 60};
		int search = 60;
		int diff = 20;
		System.out.println(search(search,diff,a));
	}
	
	
	public static int search(int key,int diff,int a[]) {
		int i =0;
		while( i < a.length ) {
			if( a[i] == key) {
				return i;
			}
			
      // instead of i = i+1 jump 
      // by the current formulae
      // so that  the ans is a little
      // bit optimised
			i = i + ( Math.max( 1 , Math.abs(key-a[i])/diff ) );
		}
		
		
		return -1;
	}
	
}

