/*
 Given an array of coins and a value => find the minimum number of coins we can get to make it to the value
 If the number is infinite then return -1
  */

package dynamic_programming;

public class Coin_Change_MinimumCoins {

	public static void main(String[] args) {
		int[]coins = {7,5,1};
		int value = 18;
		int n = coins.length;
		
		int ans = min(coins,n,value);
		System.out.println(ans);
	}
	
	static int min(int[]coins,int n,int value) {
		int[][]dp = new int[n+1][value+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(i == 0) dp[i][j] = 100000;
				if(j == 0) dp[i][j] = 0;
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(coins[i-1] > j ) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
				}
			}
		}
		
		if(dp[n][value] == 100000) return -1;
		return dp[n][value];
	}

}
