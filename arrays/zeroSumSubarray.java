/*Q. Zero sum subarrray [if the array is having subarrays whose sum is 0]



=>code
OPTIMIZED:
Time -> O(n)     space->O(n)
use set->
*/

public class zeroSumSubarray 
{
	
	public static void main(String[]args)
	{
		Set <Integer> newset = new HashSet<>();
		
		int[]a= {2,1,3,-4,-2};
		int sum=0;
		boolean found =false;
		for(int element : a) {
			newset.add(sum);
			sum+=element;
			if(newset.contains(sum)) {
				found=true;
				break;
			}

		}
		
		if(found) {System.out.println("Yes");}
		else {System.out.println("No");}
}

}








/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[]a={1,2,-2,-4,9};
		boolean isThere =false;
		
		for(int i=0;i<a.length;i++){
		    int sum=a[i];
		    for(int j=i+1;j<a.length;j++){
		        sum=sum+a[j];
		        if(sum==0){
		            isThere =true;
		        }
		}
	}
	if(isThere){
	    System.out.println("yes");
	}
	if(!isThere){
	    System.out.println("no");
	}
}
}
