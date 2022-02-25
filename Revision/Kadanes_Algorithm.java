package Revision;

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		int[]a = {2,5,8,-5,-19 ,16};
		int ans = maxSumSubarray(a);
		
		System.out.println(ans);
	}
	
	public static int maxSumSubarray(int[]a) {
		
		int maxSum = 0;
		int currSum = 0;
		
		for(int i=0;i<a.length;i++) {
			currSum = currSum + a[i];
			
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
		}
		
		return maxSum;
	}

}
