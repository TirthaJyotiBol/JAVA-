/* calculate the minimum distance between source and destination */
package graph;
import java.util.*;
public class CalculateDistance {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		int n = 5;
		for(int i=0;i<=n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(1).add(2);
		adj.get(1).add(4);
		
		adj.get(2).add(3);
		adj.get(2).add(1);
		adj.get(2).add(5);
		
		adj.get(5).add(2);
		adj.get(5).add(3);
		
		adj.get(3).add(4);
		adj.get(3).add(2);
		adj.get(3).add(5);
		
		adj.get(4).add(1);
		adj.get(4).add(3);
		
		int distance = distance(adj,2,4,5);
		System.out.println("Minimum Distance : "+distance);
		
	}
	
	static int distance(ArrayList<ArrayList<Integer>>adj,int source,int destination,int v) {
		int dist = 0;
		Queue<Integer>q = new LinkedList<Integer>();
		boolean[]vis = new boolean[v+1];
		int[]parent = new int[v+1];
		parent[source] = -1;
		q.add(source);
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			for(int neighbour : adj.get(curr)) {
				if(source == destination) break;
				if(vis[neighbour] == false) {
					q.add(neighbour);
					vis[neighbour] = true;
					parent[neighbour] = curr;
				}
				
			}
		}
		
		int curr = destination;
		while(parent[curr]!=-1) {
			dist++;
			curr = parent[curr];
		}
			
		return dist;
	}

}
