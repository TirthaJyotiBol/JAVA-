package dynamic_programming;

public class Min_ins_del_toConvert_a_to_b {
	public static void main(String[] args) {
		String a = "tirtha";
		String b = "jyoti";
		int m = a.length();
		int n = b.length();
		min(a,b,m,n);

	}
	
	static void min(String a,String b,int m,int n) {
		
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
		
		int lcs = dp[m][n];
		System.out.println("Insertion : "+ Math.abs(n - lcs));
		System.out.println("Deletion : "+ Math.abs(m - lcs));
		
	}
	
}
