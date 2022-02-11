package dynamic_programming;

public class Check_Subset_sum_Memorization {

	public static void main(String[] args) {
		int[]a = {2,3,7,8,10};
		int sum = 12;
		
		// sum and n is changing thus : 
		boolean[][]dp = new boolean[a.length+1][sum+1];
		System.out.println(ssp_dp(a,sum,a.length,dp));

	}
	
	static boolean ssp_dp(int[]a,int sum,int n,boolean dp[][]) {
		if(sum == 0) return true;
		if(n==0 && sum>0) return false;
		
		if(dp[n-1][sum] == true) {
			return dp[n-1][sum-1];
		}
		
		if(a[n-1] > sum ) {
			return dp[n][sum] = ssp_dp(a,sum,n-1,dp);
		}
		
		boolean p = ssp_dp(a,sum-a[n-1],n-1,dp);   // include
		boolean q = ssp_dp(a,sum,n-1,dp);  			// dont include
		
		return dp[n][sum] = p || q;
		
	}

}
