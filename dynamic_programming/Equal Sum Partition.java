package dynamic_programming;

public class Equal_sum_partition {

	public static void main(String[] args) {
		int[]a = {2,6,10,6};
		System.out.println(esp(a,a.length));
	}
	
	static boolean esp(int[]a,int n) {
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + a[i];
		}
		
		if(sum%2 == 0) {
			
			return sub(a,n,sum/2);
		}
		
		return false;
	}
	
	static boolean sub(int[]a,int n,int sum) {
		
		boolean[][]dp = new boolean[n+1][sum+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i == 0) dp[i][j] = false;
				if(j == 0) dp[i][j] = true;
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(a[i-1] > j ) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j];
				}
			}
		}

		
		return dp[n][sum];
		
	}

}
