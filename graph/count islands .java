/*
 0 -> Water
 1 -> Land
 
 */

package graph;
public class Count_Islands {

	public static void main(String[] args) {
		int[][] a ={{0,1},{1,0},{1,1},{1,0}};
		int ans = countIslands(a);
		System.out.println(ans);
	}
	
	static int countIslands(int[][]a) {
		int count = 0;
		boolean isVis[][] = new boolean[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(isVis[i][j] == false && a[i][j] == 1 ) {
					countUtil(i,j,a,isVis);
					count++;
				}
			}
		}
		
		return count;
	}
	
	static void countUtil(int i,int j,int[][]a,boolean vis[][]) {
		if(i<0 || j<0 || i>=a.length || j>=a[0].length || a[i][j] == 0 || vis[i][j] == true ) {
			return;
		}
		
		vis[i][j] = true;
		countUtil(i-1,j,a,vis);
		countUtil(i,j-1,a,vis);
		countUtil(i+1,j,a,vis);
		countUtil(i,j+1,a,vis);
		countUtil(i-1,j-1,a,vis);
		countUtil(i+1,j+1,a,vis);
		countUtil(i+1,j-1,a,vis);
		countUtil(i-1,j+1,a,vis);
		
		
	}

}
