package graph;
import java.util.*;

public class BFS_ConnectedGraph {

	public static void main(String[] args) {
			ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
			int n = 5;
			for(int i=0;i<=n;i++) {
				adj.add(new ArrayList<Integer>());
			}
			
			adj.get(1).add(2);
			adj.get(1).add(4);
			
			adj.get(2).add(1);
			adj.get(2).add(3);
			adj.get(2).add(5);
			
			adj.get(5).add(2);
			adj.get(5).add(3);
			
			adj.get(3).add(4);
			adj.get(3).add(2);
			adj.get(3).add(5);
			
			BFS(adj,1,n);
			
	}
	
	/*
	 Make a boolean array -> visited
	 if the visited array index is false then only add its neighbour into Queue
	 print the Queue using the Level Order Traversal
	  */
  
	public static void BFS(ArrayList<ArrayList<Integer>> adj,int src , int vertex) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] vis = new boolean[vertex+1];
		
		q.add(src);
		vis[src] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr+" ");
			
			for(int neighbour:adj.get(curr)) {			// traverse the whole inside list (Connection) and put visited element as true
				if(vis[neighbour] == false) {
					q.add(neighbour);
					vis[neighbour] = true;
				}
				
			}
			
		}
		
	}

}
