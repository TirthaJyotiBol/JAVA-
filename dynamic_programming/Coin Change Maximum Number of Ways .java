/* 
  Given an array of coins and a sum : We need to get the maximum number of ways to get the sum
  
  => Similar to subset sum problem
     But here we can use same coin multiple times thus its an Unbounded Subset Sum Problem
 
  */
package dynamic_programming;

public class Maximum_Ways_Coins {

	public static void main(String[] args) {
		int[]coins = {1,2,3};
		int n = coins.length;
		int sum = 5;
		
		int ans = ways(coins,n,sum);
		System.out.println(ans);

	}
	
	
	static int ways(int coins[],int n,int sum) {
		int[][]dp = new int[n+1][sum+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i == 0) dp[i][j] = 0;
				if(j == 0) dp[i][j] = 1;
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j = 1;j<dp[0].length;j++) {
				if(coins[i-1] > j ) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
				}
			}
		}
		
		return dp[n][sum];
	}

}
