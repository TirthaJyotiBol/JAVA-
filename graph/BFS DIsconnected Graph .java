package graph;
import java.util.*;
public class BFS_disConnected_graph {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		int n = 7;
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(1).add(2);
		adj.get(1).add(3);
		
		adj.get(2).add(1);
		adj.get(2).add(3);
		
		adj.get(3).add(1);
		adj.get(3).add(2);
		
		adj.get(4).add(5);
		
		adj.get(5).add(4);
		adj.get(5).add(6);
		adj.get(5).add(7);
		
		adj.get(6).add(5);
		
		adj.get(7).add(5);
	
		for(int i = 0;i<adj.size();i++) {
			System.out.println(i+" "+adj.get(i));
		}
		
		disconnected_BFS(adj,4,n);

	}
	
	static void disconnected_BFS(ArrayList<ArrayList<Integer>>adj,int src,int vertex) {
		boolean[]vis = new boolean[vertex+1];
		for(int i=1;i<=vertex;i++) {
			if(vis[i] == false) {
				BFS(adj,i,vertex,vis);
			}
		}
		
	}
	
	public static void BFS(ArrayList<ArrayList<Integer>>adj, int src, int vertex,boolean[]vis) {
		Queue<Integer>q = new LinkedList<>();
		
	    q.add(src);
	    vis[src] = true;
	    
	    while(!q.isEmpty()) {
	    	int curr = q.poll();
	    	System.out.print(curr+" ");
	    	
	    	for(int neighbours:adj.get(curr)) {
	    		if(vis[neighbours] == false) {
	    			q.add(neighbours);
	    			vis[neighbours] = true;
	    		}
	    	}
	    	
	    }
	}

}
