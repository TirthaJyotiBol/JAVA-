/*

Given a directed graph : check if the graph is cyclic 

1. Make a node : parent and children  (Contains the element that introduces its children)
2. Add source with parent as -1 (Because souece is introduced by none)
3. If the Neighbouting element != its parent then => true its cyclic

V  Neighbours  parent
-- ----------  -------
0   []          -
1   [2]        -1 (source)
2   [1, 3, 6]   1
3   [2, 4] 		2
4   [3, 5]      3
5   [4, 7, 8]  (4,7)     // here the parent of 5 is (7,4) => neighbour 8 is not included thus its cyclic
6   [2, 7]      2 
7   [6, 5]      6
8   [5]    		5


*/

package graph;
import java.util.*;
public class Detect_Cyclic_UnDirected {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		int v = 8;
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		 add(adj,1,2);
		 add(adj,2,3);
		 add(adj,2,6);
		 add(adj,3,4);
		 add(adj,4,5);
		 add(adj,6,7);
		 add(adj,7,5);
		 add(adj,5,8);
		
		for(int i=0;i<adj.size();i++) {
			System.out.println(i+" "+adj.get(i));
		}
		
		boolean ans = isCyclic(adj,v);
		System.out.println(ans);
		
	}
	
	static void add(ArrayList<ArrayList<Integer>>adj, int source,int destination) {
		adj.get(source).add(destination);
		adj.get(destination).add(source);
	}
	
	static class pair{
		int parent;
		int child;
		pair(int child,int parent){
			this.parent = parent;
			this.child = child;
		}
	}
	
	static boolean isCyclic(ArrayList<ArrayList<Integer>>adj,int v) {
		
		boolean vis[] = new boolean[v+1];
		for(int i=0;i<=v;i++) {
			if(vis[i] == false) {
				boolean isCyclic = isCyclicUtil(adj,i,v,vis);
				if(isCyclic) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	static boolean isCyclicUtil(ArrayList<ArrayList<Integer>>adj,int source,int v,boolean[]vis) {
		Queue<pair>q = new LinkedList<>();
		
		vis[source] = true;
		q.add(new pair(source,-1)); 	// pair of src with parent as -1;
		
		while(!q.isEmpty()) {
			int curr = q.peek().child;
			int prev =  q.peek().parent;
			q.poll();
			
			for(int neighbour:adj.get(curr)) {
				if(vis[neighbour] == false) {
					vis[neighbour] = true;
					q.add(new pair(neighbour,curr));
				}
				else if(neighbour!=prev) {
					return true;
				}
			}
			
		}
		
		return false;
	}

}
