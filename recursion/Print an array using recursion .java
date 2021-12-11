/* Print an array from 0 to n */

package Recursion;
public class print_array {
	public static void main(String[]args) {
		int[]a = {1,2,3,4,5};
		print(a,a.length);
	}
	
	static void print(int[]a,int n) {
		if(n==0) 
			return;

		print(a,n-1);
		System.out.println(a[n-1]);
		
	}
	
}
