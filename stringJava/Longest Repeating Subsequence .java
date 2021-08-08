/*
  same as Longest Consecutive subsequence
  only here find LCS for 1 string
  and the another condition is that 
 									 -> s.charAt(i)==s.charAt(j) && i!=j  */

package strings;
import java.util.Scanner;

public class LongestRepeatingSubsequence {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(LRS(s));
	}
	
	
	public static int LRS(String s) {
		int[][]dp = new int[s.length()+1][s.length()+1];
		
		for(int i=s.length()-2;i>=0;i--) {
			for(int j=s.length()-2;j>=0;j--) {
				if(s.charAt(i)==s.charAt(j) && i!=j ) {
					dp[i][j]= 1+ dp[i+1][j+1];
				}
				
				else {
					 dp[i][j]=Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[0][0];
	}

}
