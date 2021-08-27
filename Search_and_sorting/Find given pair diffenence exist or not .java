/*
  		This can be done with 2 pointers algorithm  (2 element sum)
  		With previous method of 2 pointer all the test cases are not passed
  		
  		Algo
  		1. Take i=0 ; j=1;
  		2. diff = a[j]-a[i]
  		3. Increment j until diff is lesser than target
  		4. If diff is greater than target then increment i
  		5. If not found return false
  
  
  */


package Search_and_sorting;
import java.util.Arrays;

public class pair_of_elements_having_difference_k {
	public static void main(String[]args) {
		int[]a= {1,2,5,7,8,45,65};
		int target = 21;
		System.out.println(pair(a,target));
	}
	
	public static boolean pair(int[]a,int target) {
		Arrays.sort(a);
		int i=0;
		int j=1;
		while(i<a.length && j<a.length) {
			
			int diff = a[j]-a[i];
			if(diff==target) return true;
			if(diff<target) {
				j++;
			}
			if(diff>target) {
				i++;
			}
		}
		
		return false;
	}

}
