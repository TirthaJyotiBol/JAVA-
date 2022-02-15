package dynamic_programming;

public class LCS_recursive {

	public static void main(String[] args) {
		String x = "ABCDGH";
		String y = "AEDFHR";
		int n = x.length();
		int m = y.length();
		
		int ans = lcs(x,y,n,m);
		System.out.println(ans);
	}
	
	static int lcs(String x,String y,int n,int m) {
		if(n == 0) return 0;
		if(m == 0) return 0;
		
		// if matched character then increment count by 1 and decrement size of both
		if(x.charAt(n-1) == y.charAt(m-1)) {
			return 1 + lcs(x,y,n-1,m-1);
		}
		
		// if doesnot matches then donot increment counter but decrease size of any one and take the maximum
		return Math.max(lcs(x,y,n-1,m), lcs(x,y,n,m-1));
	}

}
