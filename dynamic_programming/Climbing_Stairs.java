/*
 Given a number N : Find the number of steps that can take place to climb the ladder
 N/B : He can only take 1 or 2 steps
 
 */

package dynamic_programming;
import java.util.Arrays;
public class Climbing_Stairs {

	public static void main(String[] args) {
		int n = 4;
		
		int[]dp = new int[n+1];
		Arrays.fill(dp, -1);
		
		int ans = steps(n,dp);
		System.out.println(ans);
		
	}
	
	static int steps(int n,int[]dp) {
		if(n == 0 || n == 1) return 1;
		
		if(dp[n]!=-1) {
			return dp[n];
		}
		
		int left_count = steps(n-1,dp);
		int right_count = steps(n-2,dp);
		
		
		return dp[n] = left_count + right_count;
	}
	

}
