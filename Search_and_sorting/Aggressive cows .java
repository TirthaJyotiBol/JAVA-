/*      Find the largest of minimum distance alocated to cows    => similar to Book allocation problem       */


package Search_and_sorting;
import java.util.Arrays;
public class AggressivsCows {
	public static void main(String[] args) {
		int[]a = {1,2,4,8,9};
		int maxCows = 3;
		Arrays.sort(a);
		
		int res = aggCows(a,maxCows);
		System.out.println(res);
		
	}
	
	static int aggCows(int[]a, int maxCows) {
		int low = 0;         // Min distance is 0 i.e. all the cows are placed at the same place
		int high = a[a.length-1] - a[0];     // Max distance 
		int res =0;
		
		while(low <= high ) {
			int mid = low + (high - low)/2;
			if(isValidate(a,maxCows,mid)) {
				// if the condition is satisfied then search for higher distance
				res = mid;
				low = mid + 1;
			}
			// If not satisfied for a particular distance , that means it wont satisfy for higher distance too
			// so decrement high to mid -1
			else {
				high = mid - 1;
			}
		}
		
		return res;
	}
	
	static boolean isValidate(int[]a, int maxCows, int dist) {
		int cow =1;  // Initially 1 cow is kept at 1st position
		int coOrdinate = a[0];
		
		for(int i=1;i<a.length;i++) {
			if((a[i] - coOrdinate) >= dist ) {
				cow++;
				coOrdinate = a[i];
			}
			
			// if all the cows are allocated at a particular distance that means we can return true
			if(cow == maxCows) return true;
		}
		
		return false;
	}
	

}
