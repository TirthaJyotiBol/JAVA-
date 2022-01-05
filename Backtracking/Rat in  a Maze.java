/*
  Take the visited array to see if the index is visited or not
  if visited then we cannot travel but we only needs to backtrack through this
 * */

package backtracking;
import java.util.*;
public class Rat_in_Maze {

	public static void main(String[] args) {
		
		int[][]maze = 
						{
								{1,0,0,0},
								{1,1,0,1},
								{1,1,0,0},
								{0,1,1,1}
				
						};
		
		ArrayList<String>ans = new ArrayList<>();
		if(maze[0][0] == 1)
			RIAM(maze,maze.length,ans);
		System.out.println(ans);

	}
	
	static ArrayList<String> RIAM(int[][]maze, int n,ArrayList<String>ans) {
		int[][] visited = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				visited[i][j] = 0;
			}
		}
		helper(0,0,maze,visited,"",ans,n);
		
		return ans;
		
	}
	
	// Function to get the answer
	static void helper(int i, int j, int a[][], int vis[][],String move, ArrayList<String>ans, int n) {
		if(i==n-1 && j==n-1) {
			ans.add(move);
		}
		
		
		// Downward 
		if(i+1<n && a[i+1][j]==1 && vis[i+1][j]==0) {
			vis[i][j] = 1;
			helper(i+1,j,a,vis,move+"D",ans,n);
			vis[i][j] = 0;
		}
		
		
		// Left
		if(j-1>=0 && vis[i][j-1]==0 && a[i][j-1] == 1) {
			vis[i][j] = 1;
			helper(i,j-1,a,vis,move+"L",ans,n);
			vis[i][j] = 0;
		}
		
		// Right
		if(j+1<n && vis[i][j+1]==0 && a[i][j+1]==1 ) {
			vis[i][j] = 1;
			helper(i,j+1,a,vis,move+"R",ans,n);
			vis[i][j] = 0;
		}
		
		// Upward
		if(i-1>=0 && a[i-1][j] == 1 && vis[i-1][j] == 0) {
			vis[i][j] = 1;
			helper(i-1,j,a,vis,move+"U",ans,n);
			vis[i][j] = 0;
		}
		
	}

}
