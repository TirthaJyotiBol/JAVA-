package strings;

public class EditDistance {
	public static void main(String[]args) {
		String s1= "saturday";
		String s2="sunday";
		System.out.println(ED(s1,s2));
	}
	
	public static int min(int x,int y,int z) {
		if(x<y && x<z) {
			return x;
		}
		else if(y<z && y<x) {
			return y;
		}
		else {
			return z;
		}
	}
	
	public static int ED(String s1,String s2) {
		int[][]dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<=s1.length();i++) {
			for(int j=0;j<=s2.length();j++) {
				if(i==0) {
					//put the first row as j -> 0,1,2,3,4,5...
					dp[i][j]=j;
				}
				else if(j==0) {
					//put the first row as i -> 0,1,2,3,4,5...
					dp[i][j]=i;
				}
				
				
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
					//if characters are equal then put the diagonal element 
					
				}
				else {
					 //if characters are not equal 
				     // then put the minimum of Insert,Delete,Replace count order
				     // Insert -> dp[i][j-1]    Delete->dp[i-1][j]   Replace->dp[i-1][j-1]
					dp[i][j]=1+min( dp[i][j-1],dp[i-1][j],dp[i-1][j-1] );
				}
				
			}
			
		}
		return dp[s1.length()][s2.length()]; //this last element gives the count of the minimum of operations
		


}
}
