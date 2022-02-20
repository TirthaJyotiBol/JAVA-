package dynamic_programming;

public class Edit_Distance {

	public static void main(String[] args) {
		String s = "Tirtha";
		String t = "JyotiBol"; 
		int m = s.length();
		int n = t.length();
		int ans = edit(s,t,m,n);
		System.out.println(ans);
	}
	
	static int edit(String a,String b,int m,int n) {
		int[][]dp = new int[m+1][n+1];
		for(int i =0;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(i == 0) dp[i][j] = j;
				if(j == 0) dp[i][j] = i;
			}
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
				}
			}
		}
		return dp[m][n];
	}

}

// replace => dp[i-1][j-1]
// insert => dp[i][j-1]
// delete => dp[i-1][j]
