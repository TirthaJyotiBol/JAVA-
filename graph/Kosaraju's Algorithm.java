/* 
 This algorithm is used to get the Strongly connected graph
 
 * Strongly connected component is one from where all the vertices of the component can be travelled
   Also all the vertices can be travelled from all the vertices
   
  Steps : 
  1. Toposort the Graph
  2. Transpose the Graph and store it in another Graph (say temp)
  3. DFS the temp graph with respect to the stack pop() elements
  
  
 => Transpose the graph :-
    transpose.get(neighbour).add(parent)
   
=>  DFS through stack :-
 
  while(stk.size()>0)
  {
  	int c = stk.pop();
  	if(vis[c] == fasle)
  	{
  		dfs();
  	}
  }
 
 
  */


package graph;
import java.util.*;
public class Kosaraju_Algorithm {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		int v = 5;
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<>());
		}
		
		adj.get(1).add(2);
		adj.get(2).add(3);
		adj.get(3).add(1);
		adj.get(2).add(4);
		adj.get(4).add(5);
		
		kosaraju(adj,1,v);
		
	}
	
	static void kosaraju(ArrayList<ArrayList<Integer>>adj, int src, int v) {
		
// step 1 : Topological sort and store it in a stack
		Stack<Integer>stack = new Stack<>();
		boolean[]vis = new boolean[v+1];
		for(int i=0;i<v;i++) {
			if(vis[i] == false) {
				topo(adj,vis,stack,i);
			}
		}		
		
// step 2 : Transpose the graph
		ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
		transpose(adj,src,v,transpose);
		
		
// step 3 : DFS with respect to the stack by topological sort
		for(int i=0;i<vis.length;i++) {
			vis[i] = false;
		}
		while(stack.size()>0) {
			int curr = stack.peek();
			stack.pop();
			if(vis[curr] == false) {
				System.out.println("SSC");
				dfs(transpose,curr,v,vis);
				System.out.println();
			}
		}
		
		
	}
	
	// step 1
	static void topo(ArrayList<ArrayList<Integer>>adj,boolean[]vis,Stack<Integer>stk,int src) {
		vis[src] = true;
		
		for(int x: adj.get(src)) {
			if(vis[x] == false) {
				topo(adj,vis,stk,x);
			}
		}
		
		stk.push(src);
	}
	
	// step 2
	static void transpose(ArrayList<ArrayList<Integer>>adj,int src,int v,ArrayList<ArrayList<Integer>>trans) {
		
		for(int i=0;i<=v;i++) {
			trans.add(new ArrayList<>());
		}
		
		for(int i=0;i<v;i++) {
			for(int x:adj.get(i)) {
				trans.get(x).add(i);
			}
			
		}
	}
	
	
	// step 3 : dfs according to the stack
	static void dfs(ArrayList<ArrayList<Integer>>trans,int src,int v,boolean[]vis) {
		vis[src] = true;
		System.out.println(src);
		for(int x:trans.get(src)) {
			if(vis[x] == false) {
				dfs(trans,x,v,vis);
			}
		}
	}
	

}
