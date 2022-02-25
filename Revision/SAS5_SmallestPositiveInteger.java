// Given an array of positive and negative integers : Find the smallest positive Integer

/*
 1. Take smallest Element = 1
 2. Traverse the array : 
 3. If element == smallest ( means we found the current smallest element) 
 4. Increment smallest element so as to find the next smallest element
 
 */
package Revision;
import java.util.Arrays;

public class SAS5_SmallestPositiveInteger {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int ans = smallest(arr);
		System.out.println(ans);

	}
	
	static int smallest(int[]a) {
		int x = 1;
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == x) {
				x++;
			}
		}
		return x;
	}

}
