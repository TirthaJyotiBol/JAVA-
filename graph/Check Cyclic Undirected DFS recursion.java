package graph;
import java.util.*;
public class isCyclic_undirected_DFSrec {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		
		int v = 5;
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(2).add(4);
		adj.get(3).add(2);
		adj.get(3).add(5);
		adj.get(5).add(3);
		adj.get(5).add(4);
		adj.get(4).add(2);
		adj.get(4).add(5);
		
		boolean ans = isCyclic(adj,v);
		System.out.println(ans);
		
		
	}
	
	static boolean isCyclic(ArrayList<ArrayList<Integer>>adj,int v) {
		boolean[]vis = new boolean[v+1];
		
		for(int i=1;i<=v;i++) {
			if(vis[i] == false) {
				boolean check = checkCyclic(adj,v,i,-1,vis);
				if(check) return true;
			}
		}
		return false;
	}
	
	static boolean checkCyclic(ArrayList<ArrayList<Integer>>adj,int v,int src,int par,boolean[]vis) {
		vis[src] = true;
		
		for(int neighbour:adj.get(src)) {
			if(vis[neighbour] == false) {
				if(checkCyclic(adj,v,neighbour,src,vis)) {				
					/* if the recursive Leap of Faith returns true :- return true
					   i.e. any of the answer returns true then return true without moving further */
					return true;
				}
			}
			else if(neighbour!=par) {   // if the current element returns true :- return true
				return true;
			}
		}
		
		return false;
	}

}
