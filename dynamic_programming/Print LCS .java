package dynamic_programming;

public class Print_LCS {

	public static void main(String[] args) {
		String a = "AGGTAB";
		String b = "GXTXAYB";
		int m = a.length();
		int n = b.length();
		String ans = lcs(a,b,m,n);
		System.out.println(ans);

	}
	
	// LCS function 
	static String lcs(String a,String b,int m,int n) {
		int[][]dp = new int[m+1][n+1];
		StringBuilder s = new StringBuilder("");
		
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
	
		// Traverse from the last and if we found equal elements then append 
		// else move to the maximum side
		int i = m;
		int j = n;
		while(i>0 && j>0) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					s.append(a.charAt(i-1));
					i--;
					j--;
				}
				else {
					if(dp[i-1][j] > dp[i][j-1] ) {
						i = i-1;
					}
					else {
						j = j-1;
					}
				}
			}
		
		s = s.reverse();
		return  s.toString();
	}

}
