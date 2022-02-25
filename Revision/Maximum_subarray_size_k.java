/* 
 Q> Given an array , size k
    Find the maximum of subarray of size k
    
    Algo :
    1. Find the sum of first k elements = current sum
    2. Find subarray sum remaining => currsum - a[i-k]  : this removes the previous element from the sum
*/

package Revision;
public class Maximum_subarray_size_k {

	public static void main(String[] args) {
		int[]a = {5,2,3,7,9,7,0,2};
		int k =3;
		
		int maxSum = maxSum(a,k);
		System.out.println(maxSum);
	}
	
	static int maxSum(int[]a,int k) {
		int i=0;
		int currSum = 0;
		int max = 0;
// first  k sum
		for(i=0;i<k;i++) {
			currSum += a[i];
		}
		
		while(i<a.length) {
			currSum = currSum + a[i] -a[i-k];   // current sum + new one - old one
			if(currSum > max) {
				max = currSum;
			}
			i++;
		}
		return max;
	}

}
