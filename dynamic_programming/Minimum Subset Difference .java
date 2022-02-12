package dynamic_programming;

public class Minimum_Difference_Subset {

	public static void main(String[] args) {
		int[]a = {1,6,11,5};
		int n = a.length;
		int ans = minSubset_difference(a,n);
		System.out.println(ans);
	}
	
	static int minSubset_difference(int[]a,int n) {
		
		// step 1 : find the sum (Target)
		int target = 0;
		for(int i=0;i<n;i++) {
			target = target + a[i];
		}
		
		// step 2 : Minimum Subset Sum 
		boolean[][]dp = new boolean[n+1][target+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i == 0) dp[i][j] = false;
				if(j == 0) dp[i][j] = true;
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(j < a[i-1] ) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
				}
			}
		}
		
		//step 3 : Find min for the first target/2
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=target/2;i++) {
			if(dp[n][i] == true) {
				min = Math.min(min, target - 2*i);
			}
		}
		
		
		return min;
	}

}
