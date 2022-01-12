/*
 Print all paths from top Left to Bottom Right of a (n*n)  matrix
 */

package backtracking;
import java.util.ArrayList;

public class TopLeft_to_BottomRignt_nBYn_matrix {
	public static void main(String[] args) {

		int[][]a =  {{1,2,3},{3,4,7},{8,9,3}};
		int vis [][] = new int[a.length][a.length];
		
		String ans = "";		
		
		ArrayList<String>list = new ArrayList<>();
		
		paths(a,ans,0,0,list,a.length,vis);
		
		System.out.println(list);
		
	}
		
	static void paths(int[][]a,String ans,int i,int j, ArrayList<String>list,int n,int vis[][]) {
		
		if(i == n-1 && j == n-1) {
			list.add(ans);
			return;
		}
		
		if(i==0 && j==0) {			// add the first element into the ans
			ans = ans+a[i][j];
		}
		
		// Down
		if(i+1<n && j<n && vis[i+1][j]==0 ) {
			vis[i][j] = 1;
			paths(a, ans+(a[i+1][j]), i+1, j, list ,n, vis);
			vis[i][j] = 0;
		}
		
		// right
		if(j+1<n && i<n && vis[i][j+1]==0) {
			vis[i][j] = 1;
			paths(a, ans+a[i][j+1] , i,j+1,list,n,vis);
			vis[i][j] = 0;
		}
		
		return;
	}
}
