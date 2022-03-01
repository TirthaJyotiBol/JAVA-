package Search_and_sorting;

import java.util.Arrays;

public class SAS_10_AggressiveCows {

	public static void main(String[] args) {
		int[]a = {1,2,4,8,9};
		int k = 3;
		int ans = maxDist(a,k);
		System.out.println(ans);
	}
	
	static int maxDist(int[]a,int k) {
		int ans = -1;
		Arrays.sort(a);
		
		int low = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		int high = sum;
		
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(isValid(a,k,mid)) {
				ans = mid;
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		return ans;
	}
	
	
	
	static boolean isValid(int[]a,int k,int mid) {
		int cows = 1;
		int cow_position = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i] - cow_position >= mid) {
				cows++;
				if(cows == k) return true;
				cow_position = a[i];
			}
		}
		
		return false;
	}
	

}
