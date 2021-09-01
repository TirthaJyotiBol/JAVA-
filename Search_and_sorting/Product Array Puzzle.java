/* 			 
   				time -> O(n)  space -> o(n)
   				
   			Solve without divide operator 
   			1. Use two Auxiliary Space of O(N)
   			2. Take left[0] = 1     && Right[n-1] = 1;
   			3. right[i] = right[i+1] * nums[i+1];
   			4. left[i] = left[i-1] * nums[i-1];
   			5. ans[] = left[i] * right[i]
   			
   			*/

package Search_and_sorting;
public class Product_array_puzzle {
	public static void main(String[]args) {
		long[]nums = {1,2,3,4};
		int n = nums.length;
		
		long[]a = new long[n];
		long[]left = new long[n];
		long[]right = new long[n];
		
		// Left Suffix
		left[0]=1;
		for(int i =1;i<n;i++) {
			left[i] = left[i-1] * nums[i-1];     // Just Dry Run ocne u will get it
		}
		
		// Right Suffix
		right[n-1]=1;
		for(int i = n-2 ; i>=0 ; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		
		for(int i =0;i<n ; i++) {
			a[i] = left[i] * right[i];
		}
		
		
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

		
	}
	


}
