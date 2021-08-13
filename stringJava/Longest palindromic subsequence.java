/*
 * LPS is similar to LCS , the only difference is that , here  the second string taken is the
 * reverse of first
 * */

package strings;
import java.util.*;
public class LongestPalindromicSubsequence {
	public static void main(String[]args) {
		// LPS is similar to LCS , the only difference is that the 
		// string 1 is taken as reverse of string 2
		
		String s = "ababa";	
		int LPS = LPS(s);
		System.out.println(LPS);
		
	
	}
	
	public static int LPS(String s1) {
		
		String s2="";
		for(int i =s1.length()-1;i>=0;i--) {
			// made s2 the reverse of s
			s2 =  s2+  s1.charAt(i);
		}
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j]= 1+ dp[i+1][j+1];
				}
				else {
					dp[i][j]= Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		
		
		return dp[0][0];
	}

}
