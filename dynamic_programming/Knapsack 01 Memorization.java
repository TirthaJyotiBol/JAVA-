package dynamic_programming;

public class Knapsack_01_Memorization {

	public static void main(String[] args) {
		int w = 50;
		int wt[] = {10,20,30};
		int val[] = {60,100,120};
		int n = val.length;
		
		int[][]dp = new int[n+1][w+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = -1;
			}
		}
		
		int ans = knapsack(val,wt,w,n,dp);
		System.out.println(ans);	
	}
	
	static int knapsack(int[]val,int[]wt,int w,int n,int[][]dp) {
		if(n == 0 || w == 0) return 0;
		
		if(dp[n-1][w-1]!=-1) {
			return dp[n-1][w-1];
		}
		
		if(wt[n-1] > w ) {
			// dont include
			return dp[n][w] = knapsack(val,wt,w,n-1,dp);
		}
		
		else {
			return dp[n][w] = Math.max((val[n-1]+knapsack(val,wt,w-wt[n-1],n-1,dp) ), knapsack(val,wt,w,n-1,dp));
		}
	}

}
