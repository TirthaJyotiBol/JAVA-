package dynamic_programming;

public class Knapsack_01_SpaceOptimization {

	public static void main(String[] args) {
		int w = 50;
		int wt[] = {10,20,30};
		int val[] = {60,100,120};
		int n = val.length;
		
		int ans = knapsack(val,wt,w,n);
		System.out.println(ans);
		
	}
	
	static int knapsack(int[]val,int[]wt,int w,int n) {
		
		// in the recursive solution we saw that W and n are changing thus we make a matrix of n*w
		int[][]dp = new int[n+1][w+1];
		
		
		
		for(int i=1;i<n+1;i++) {  // n->i
			for(int j=1;j<w+1;j++) {  // w->j
				
				if(wt[i-1] > j ) {
					// donot include
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = Math.max( val[i-1] + dp[i-1][j-wt[i-1]] , dp[i-1][j]);   // w - wt[n-1] as  " j - wt[i-1] "
				}
			}
		}		
		
		return dp[n][w];
	}
	

}
