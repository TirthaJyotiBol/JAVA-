/*
 Algorithm :
 1. Make an array Indegree that stores the indegree of each element
 2. Traverse the indegree array and check if there exists any 0 in the array
 		if there exists 0 then add the index to the Queue
 3. While q.isEmpty() == false 
 4. Add the adjoining neighbours of Queue top element into the Queue
 5. If the indegree of any element == 0 then add this element to Answer
  */

package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_sort_kahnAlgo {
	
	static void topo(ArrayList<ArrayList<Integer>>adj,int v,int src) {
		int[]indegree = new int[v];		// array that stores the indegree of each element
		ArrayList<Integer>ans = new ArrayList<>();
		for(int i=0;i<v;i++) {
			for(int x:adj.get(i)) {
				indegree[x] = indegree[x]+1;
			}
		}
		
		Queue<Integer>queue = new LinkedList<>();
		for(int i=0;i<indegree.length;i++) {
			if(indegree[i] == 0) {
				queue.add(i);				/* if there exists 0 indegree in Queue then add this to Queue */
			}
		}
		
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			ans.add(curr);					// as soon as we remove element from queue we store it in answer
			for(int x:adj.get(curr)) {
				indegree[x] = indegree[x]-1;
				if(indegree[x] == 0) {
					queue.add(x);
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		
		int v = 6;
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(5).add(0);
		adj.get(4).add(0);
		adj.get(5).add(2);
		adj.get(4).add(1);
		adj.get(2).add(3);
		adj.get(3).add(1);
		
		topo(adj,v,0);
	}
	

}
