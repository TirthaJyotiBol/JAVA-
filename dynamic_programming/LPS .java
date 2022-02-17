package dynamic_programming;

public class LPS {

	public static void main(String[] args) {
		String s = "aebcbda";
		int n = s.length();
		System.out.println(lps(s,n));

	}
	
	static int lps(String s,int n) {
		StringBuilder sb = new StringBuilder(s);
		
		String temp = sb.reverse().toString();
		int ans = lcs(s,temp,n,n);
		return ans;
	}
	
	static int lcs(String a,String b,int m,int n) {
	int[][]dp = new int[m+1][n+1];
		
		for(int i=1; i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[m][n];
	}

}
