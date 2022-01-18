package graph;
import java.util.*;
public class DFS_recursive {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		
		int v = 5;
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(1).add(2);
		adj.get(1).add(5);
		adj.get(2).add(4);
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(3).add(2);
		adj.get(3).add(4);
		adj.get(4).add(2);
		adj.get(4).add(5);
		adj.get(4).add(3);
		adj.get(5).add(4);
		adj.get(5).add(1);
		
		dfsAll(adj,v);

	}
	
	// for different components
	
	static void dfsAll(ArrayList<ArrayList<Integer>>adj,int v) {
		boolean[]vis = new boolean[v+1];

		for(int i=1;i<adj.size();i++) {
			if(vis[i] == false) {
				dfs(adj,i,v,vis);
			}
		}
	}
	
	static void dfs(ArrayList<ArrayList<Integer>>adj,int src,int v,boolean[]vis) {
		System.out.println(src);
		vis[src] = true;
		
		for(int neighbours:adj.get(src)) {
			if(vis[neighbours] == false)
			   dfs(adj,neighbours,v,vis);
		}
	}
	

}
