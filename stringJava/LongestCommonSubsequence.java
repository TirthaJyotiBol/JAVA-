// formulae for the LCS is ->
//if characters are equal then put dp[i][j] = 1+dp[i+1][j+1];
// else  dp[i][j]=Math.max(dp[i+1][j] , dp[i][j+1]);



package strings;
import java.util.*;
public class LongestCommonSubsequence {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		
		//make a dp of size [s1.length+1][s2.length+1]
		// the last row and column are kept 0
		int dp[][]= new int[s1.length()+1][s2.length()+1];
		
		for(int i=dp.length-2 ; i>=0 ; i--) {
			//dp.length-1 is the last column and this column
			//as well as row is kept 0
			//-> start traversing from the last element and move upwards
			for(int j=dp[0].length-2 ; j>=0 ; j--) {
				//if elements are equal then 
				// put the summasion of the [i+1][j+1]
				if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j]=1+dp[i+1][j+1];
				}
				
				else {
					dp[i][j]=Math.max(dp[i+1][j] , dp[i][j+1]);					
				}
			}
		}
		System.out.println(dp[0][0]);
	}

}
