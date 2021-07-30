/*
 * fill the 2D array just like the previous one
 * the length of the largest palindronic string would be the 
 * one having the largest gap 
 * and the length would be -> gap+1 
 * */


package strings;
import java.util.*;
public class count_of_longest_palindromic_substring {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		boolean [][]dp = new boolean[s.length()][s.length()];  //boolean array
		int largest_palindronic_length = 0;
		for(int gap=0;gap<s.length();gap++) {
			for(int i=0,j=gap;j<s.length();i++,j++) {
				if(gap==0) {
					dp[i][j]=true;
				}
				
				else if(gap==1) {
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=true;
					}
					else {
						dp[i][j]=false;
					}
				}
				
				else {
					if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true) {
						dp[i][j]=true;
					}
					else {
						dp[i][j]=false;
					}
				}
				if(dp[i][j]) {
					largest_palindronic_length = gap+1;
				}
				
				
			} 
			
		}
		System.out.println(largest_palindronic_length);
		
		
		
	}

}
