package dynamic_programming;

import java.util.Arrays;

public class Coin_Change {

	public static void main(String[] args) {
		int[]a = {7,5,1};
		int n = 18;
		int[]dp = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int ans = minCoins(n,a,dp);
		System.out.println(ans);
		
	}
	
	static int minCoins(int n,int[]a,int[]dp) {
		
		if(n == 0) return 0;
		int count = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(n-a[i] >=0) 
			{
			int subAns = 1;
			// ie if visited then take ans from the visited array
			if(dp[n - a[i]] != -1 ) {
				subAns = dp[n-a[i]];
			}
			else {
				subAns = minCoins(n-a[i],a,dp);
			}
			if(subAns+1 < count && subAns != Integer.MAX_VALUE ) {
				count = subAns+1;
			}
			}
		}
		
		dp[n] = count;
		return  count;
		
	}

}
