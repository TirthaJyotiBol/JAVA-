package strings;
import java.util.*;
public class Count_number_of_palindrones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int count =0;
		
		boolean dp[][]=new boolean[s.length()][s.length()];  // a boolean grid is made for storage 
		
		/* There are s.length() gaps in the DP  for a certain string */
		
		for(int gap=0; gap<s.length() ;gap++) {
			/*gap 0 -> diagonal 1  gap 1 -> diagonal 2 ....*/
			
			for(int i=0,j=gap ; j<s.length(); j++,i++) {
				// Traversal of a particular diagonal using the inner for loop 
				
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
					if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true ) {
						dp[i][j]=true;
					}
					else {
						dp[i][j]=false;
					}
					
				}
				
				
				if(dp[i][j]) {
					count++;
				}
				
			}
			
			
			
		}
		
		System.out.println(count);

	}

}
