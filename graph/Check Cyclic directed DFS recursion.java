package graph;
import java.util.*;
public class isCyclic_directed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		System.out.println("Enter Vertices and edges size");
		int v = scan.nextInt();
		int e = scan.nextInt();
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		System.out.println("Enter Source and destination");
		for(int i=1;i<=e;i++) {
			int src = scan.nextInt();
			int des = scan.nextInt();
			add(adj,src,des);
		}
		
		System.out.println(isCyclic(adj,v));
		
	}
	
	static void add(ArrayList<ArrayList<Integer>>adj,int src,int des) {
		adj.get(src).add(des);
	}
	
	static boolean isCyclic(ArrayList<ArrayList<Integer>>adj,int v) {
		boolean isVis[]  = new boolean[v+1];
		boolean dfsVis[] = new boolean[v+1];
		
		for(int i=1;i<=v;i++) {
			if(isVis[i] == false) {
				boolean ans = checkCyclic(adj,i,v,isVis,dfsVis);
				if(ans) return true;
			}
		}
		
		return false;
	}
	
	static boolean checkCyclic(ArrayList<ArrayList<Integer>>adj,int src,int v,boolean[]vis,boolean[]dfsVis) {
		vis[src] = true;
		dfsVis[src] = true;
		
		for(int neighbour:adj.get(src)) {
			if(vis[neighbour] == false) {
					if(checkCyclic(adj,neighbour,v,vis,dfsVis) == true){
						return true;
					}
			
				}
			else if(vis[neighbour] == true && dfsVis[neighbour] == true) {
				return true;
			}
		}
		dfsVis[src] = false;	// backtrack to false if the recursion is over and element not found
		return false;
	}
	
	

}
