package dynamic_programming;

public class MCM {

	public static void main(String[] args) {
		int a[] = {40, 20, 30, 10, 30} ;
		int s = 1;
		int e = a.length;
	
		int[][]dp = new int[2500][2500];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = -1;
			}
		}
		
		int ans = mcm(a,s,e-1,dp);
		System.out.println(ans);
		
	}
	
	static int mcm(int[]a, int i,int j,int[][]dp) {
		if(i>=j) return 0;
		
		int min = Integer.MAX_VALUE;
		
		if(dp[i][j] !=-1) {
			return dp[i][j];
		}
		
		for(int k=i; k<=j-1; k++) {
			int temp = mcm(a,i,k,dp) + mcm(a,k+1,j,dp) + (a[i-1]*a[k]*a[j]);
			if(temp < min) {
				min = temp;
			}
		}
		
		return dp[i][j] = min;
	}

}
