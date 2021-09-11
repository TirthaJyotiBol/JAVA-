// Minimize the maximum books read by k students
/*  
 
 		1. Take low = max(a);
 		2. Take high = sumOf(a);
 		3. if the mid is the one having Minimum maximumSum then return mid
 		   if we found sum of books and the student value is less than equal to k that means we donot need to increase ; decrement high -> mid -1;
 		   if not found any element in that range for k students then increment low -> mid + 1
 
     */
package Search_and_sorting;
public class BookAllocation {
	//Driver code
	public static void main(String[]args) {
		int[]a = {10,10,20,30};
		int k =2 ;
		int ans = Book(a,k);
		System.out.println(ans);
	}
	
	// Returns the maximum element in the array -> low
	static int max(int[]a) {
		int max =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	// Returns the sumof all the elements in array -> high
	static int sum(int[]a) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static int Book(int[]a,int k) {
		int ans =0;
		int low = max(a);
		int high = sum(a);
		while(low <= high) {
			int mid =(low+high)/2;
			if(isValid(a,mid,k)) {
				// if we find the answer then no need to move above
				// decrement high because we need to Minimize the maximum
				ans = mid;
				high = mid - 1 ;
			}else {
				low = mid + 1;
			}
			
		}
		return ans;
	}
  
  
  // check if sum is found for k students
	static boolean isValid(int[]a, int mid, int k) {
		int student = 1;
		int sum =0;
		for(int i=0;i<a.length;i++) {
			if(sum+a[i]>mid) {
				// if sum > mid that means 1 student cannot handle 
				// all these , then we need to increase the students
				student++;
				sum = a[i];
			}else {
				sum = sum + a[i];
			}
		}
		
		// if students after increment < = the given number of students ;  return true 
		// else return false
		return student<=k;
		
		
	}

}
