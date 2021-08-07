//Total number of operations required to convert string 1
// to string 2 with Insertion and Deletion 

/*
 * Algorithm 
  
  1. find Longest Common Subsequence
  2. Delete count from the original string 1 can be found by   (string1.length-LCS)
  3. Insertion count can be by substracting string 2 with LCS  (string2.length-LCS)
  4. The total is -> (Insertion + Deletion )
 */

package strings;
import java.util.Scanner;

public class EditDistanceWithoutReplace {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	String s1 = scan.nextLine();
	String s2 = scan.nextLine();
	
	//find the lcs
	
	int[][]dp = new int[s1.length()+1][s2.length()+1];
	for(int i=dp.length-2;i>=0;i--) {
		for(int j=dp[0].length-2;j>=0;j--) {
			if(s1.charAt(i)==s2.charAt(j)) {
				dp[i][j]=1+dp[i+1][j+1];
			}
			else {
				dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
			}
		}
	}
	
	int lcs = dp[0][0];
	
	
	//for converting the string 1 into lcs
	int deletion = s1.length()-lcs;
	System.out.println("Total Steps for Deletion :  "+deletion);

	//for insertion
	int insertion = s2.length()-lcs;
	System.out.println("Total Steps for Insertion : "+insertion);
	
	int order = deletion+insertion;
	System.out.println("Total  : "+order);

}
}
