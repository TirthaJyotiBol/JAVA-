/*
 Given N -> Length of the rod
  	   price[] -> Array that stores the price of different lengths of the rod
  	   lengths[] -> Array that store different lengths
  	   
  	   We need to find the maximum price that can be get from the rod such that the length is not to be maximised
  
 */

/* Since here we  can include one piece of rod multiple times thus its similar to Unbounded Knapsack */

package dynamic_programming;
public class Rod_cutting {

	public static void main(String[] args) {
		int[]lengths = {1,2,3,4,5,6,7,8};
		int[]price = {1,5,8,9,10,17,17,20};
		int l = 8;
		int n = lengths.length;

		int ans = max(price,l,lengths,n);
		System.out.println(ans);
	}
	
	static int max(int[]price,int l,int[]lengths,int n) {
		int[][]dp = new int[n+1][l+1];
		
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				
				if(lengths[i-1] > j ) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], price[i-1] + dp[i][j - lengths[i-1] ]);
				}
				
			}
		}
		return dp[n][l];
	}

}
