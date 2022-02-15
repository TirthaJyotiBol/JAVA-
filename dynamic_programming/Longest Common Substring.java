package dynamic_programming;

public class LCSubstring {

	public static void main(String[] args) {

		String x = "abtiry";
		String y = "ablor";
		int m = x.length();
		int n = y.length();
		
		int ans = lcs(x,y,m,n);
		System.out.println(ans);
	}
	
	static int lcs(String x,String y,int m,int n) {
		int[][]dp = new int[m+1][n+1];
		int max = 0;
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				
				else {
					dp[i][j] = 0;
				}
				
				max = Math.max(max, dp[i][j]);
			}
		}
		
		return max;
	}

}
