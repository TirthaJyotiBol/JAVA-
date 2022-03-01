/*
 If possible => get the answer and reduec the size ( high = mid - 1)  " Since we want the minimum "
 else Increase the size
 
 // If possible Function() 
       * Find sum of pages
       * If (sum <= mid) ->  sum the pages
       * else increment the student count
             if student count > k   => return false
 	   * return true 
 */

package Revision;
public class SAS_9_minBookAllocation {

	public static void main(String[] args) {
		int[]pages = {10,20,30,40};
		int n = pages.length;
		int k = 2;
		int ans = minAllocaiton(pages,k,n);
		System.out.println(ans);
		
	}
	
	static int minAllocaiton(int[]a,int k,int n) {
		int ans = -1;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		int low = 0;
		int high = sum;
		
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(isPossible(a,k,mid)) {
				ans = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
			
		}
		
		return ans;
	}	
	
	static boolean isPossible(int[]a,int k,int mid) {
		
		int student_count = 1; // initially 1 student
		int page_sum = 0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(page_sum + a[i] <= mid ) {
				page_sum = page_sum + a[i];
			}
			else {
				student_count++;
				page_sum = a[i];		// page sum starts from the current page
				if(student_count > k) {
					return false;
				}
			}
		}
		
		return true;
	}

}
