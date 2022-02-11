/* Count the number of subset sums present in the array */

/* This is similar to Subset sum problem the only differrence is we want count thus we count the valid ones */
package dynamic_programming;
public class count_subset_sum {

	public static void main(String[] args) {
		int[]a = {2,3,5,6,3,10};
		int n = a.length;
		int sum = 10;
		
		int ans = count(a,n,sum);
		System.out.println(ans);
	}

	static int count(int[]a,int n,int sum) {
		
		int[][]dp = new int[n+1][sum+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i == 0)dp[i][j] = 0;
				if(j == 0)dp[i][j] = 1;
			}
		}
		
		for(int i = 1;i<dp.length;i++) {
			for(int j = 1;j<dp[0].length;j++) {
				if(a[i-1] > j ) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i-1][j] + dp[i-1][j - a[i-1]];
				}
			}
		}
		
		return dp[n][sum];
	}
	
}
