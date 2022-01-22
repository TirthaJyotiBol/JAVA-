package graph;

import java.util.ArrayList;
import java.util.Stack;
public class Topological_sort {
	public static void main(String[]args) {
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
		
		topo(adj,0,v);
		
		
	} 
	
	static void topo(ArrayList<ArrayList<Integer>>adj,int src,int v) {
		boolean[]vis = new boolean[v+1];
		Stack<Integer>stk = new Stack<>();
		
		for(int i = src;i<v;i++) {
			if(vis[i]==false) {
				topoUtil(adj,i,v,vis,stk);
			}
		}
		
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
		
	}
	
	static void topoUtil(ArrayList<ArrayList<Integer>>adj,int src,int v,boolean []vis,Stack<Integer>stk) {
		// use recursion dfs call
		vis[src] = true;
		
		for(int x:adj.get(src)) {
			if(vis[x] == false) {
				topoUtil(adj,x,v,vis,stk);
			}
		}
		
		stk.push(src);	
	}
	
}
