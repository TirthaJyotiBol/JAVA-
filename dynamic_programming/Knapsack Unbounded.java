/* Knapsack with duplicate items => i.e. here items can be repeated */

package dynamic_programming;

public class Knapsack_Unbounded {

	public static void main(String[] args) {
		int n = 4;
		int w = 8;
		int val[] = {1, 4, 5, 7};
		int wt[] = {1, 3, 4, 5};
		
		int ans = knapsack(val,wt,w,n);
		System.out.println(ans);
	}
	
	static int knapsack(int val[],int wt[],int w,int n) {
		
		int[][]dp = new int[n+1][w+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i == 0) dp[i][j] = 0;
				if(j == 0) dp[i][j] = 0;
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j = 1;j<dp[0].length;j++) {
				if(wt[i-1] > j ) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], val[i-1]+dp[i][j-wt[i-1]]);   // The only change is in here => duplicates allowed
				}
			}
		}
		
		return dp[n][w];
	}

}
