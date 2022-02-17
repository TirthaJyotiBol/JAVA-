package dynamic_programming;
public class Shortest_Common_supersence {

	public static void main(String[] args) {
		String a = "abcd";
		String b = "xycd";
		int m = a.length();
		int n = b.length();
		
		int ans = scs(a,b,m,n);
		System.out.println(ans);
	}
	
	static int scs(String a,String b,int m,int n) {
	
		int lcs = lcs(a,b,m,n);			// total sum of both the strings - the Longest
		return m + n - lcs;
	}

	// LCS 
	static int lcs(String a,String b,int m,int n) {
		int[][]dp = new int[m+1][n+1];
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[m][n];
	}
	

}
