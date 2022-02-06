/*
 * in case of recursion same step is repeated multiple times
 * To overcome from this situation we use DP
 * Here the elements are stored in an array 
 * If  repetitions occurs then we simply use that element in the array
 * */


package dynamic_programming;
import java.util.Arrays;

public class fibonacciElement {
	public static void main(String[]args) {
		int n = 5;
		
	// Memorization Solution 
		int[]dp = new int[n+1];
		Arrays.fill(dp, -1);	
		int ans = fib(n,dp);
		System.out.println(ans);
		
	// Tabulation Solution
		int[]dp2 = new int[n+1];
		int ans2 = fibo(n,dp2);
		System.out.println(ans2);
		
	}

	
// using memorization 
	static int fib(int n,int[]dp) {
		// base condition
		if(n == 1 || n == 0) return n;
		
		// if already visited then return from then index
		if(dp[n] != -1) {
			return dp[n];
		}
		
		// if not visited then visit and return ans
		dp[n] = fib(n-1,dp)+fib(n-2,dp);
		return dp[n];
		
	}
	
	
// using Tabulation
	static int fibo(int n,int[]dp) {
		if(n == 0 || n == 1) {
			return n;
		}
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
	
}
