package backtracking;
import java.util.*;
public class TopLeft_BottomRight_nBYm_matrix {

	public static void main(String[] args) {

		int[][]a = { {1,2,3},{4,5,6} };
		
		int n = a.length;
		int m = a[0].length;
		
		int vis[][] = new int[n][m];
		String ans = "";
		ArrayList<String>list = new ArrayList<>();
		
		path(a,ans,0,0,n,m,vis,list);
		System.out.println(list);
		
	}
	
	// n for i ; m for j
	static void path(int[][]a,String ans,int i,int j,int n,int m,int[][]vis,ArrayList<String>list) {
		
		if(i == n-1 && j== m-1) {
			list.add(ans);
			return;
		}
		
		if(i>n || j>m) {
			return;
		}
		
		if(i==0 && j==0) 
		{
			ans = ans+a[i][j];
		}
		
		
		// Down
		if(i+1<n && j<m && vis[i+1][j] == 0) {
			vis[i][j] = 1;
			path(a,ans+(a[i+1][j]),i+1,j,n,m,vis,list);
			vis[i][j] = 0;
		}
		
		
		// Right
		if(i<n && j+1<m && vis[i][j+1]==0 ) {
			vis[i][j] = 1;
			path(a,ans+(a[i][j+1]),i,j+1,n,m,vis,list);
			vis[i][j] = 0;
		}
		
	}

}
