/* Get the shortest distance from points to all the source of a non-weighted graph  */

package graph;
import java.util.*;
public class ShortestPath__allNodesFromSource {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		System.out.println("Enter the Number of vertices :");
		int v = scan.nextInt();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		System.out.println("Enter the number of edges : ");
		int e = scan.nextInt();
		System.out.println("Enter the source and sectination");
		for(int i=0;i<e;i++) {
			int src = scan.nextInt();
			int dest = scan.nextInt();
			add(adj,src,dest);
		}
		findPaths(adj,0,v);
	}
	
	static void add(ArrayList<ArrayList<Integer>>adj,int src,int des) {
		adj.get(des).add(src);
		adj.get(src).add(des);
	}

	static void findPaths(ArrayList<ArrayList<Integer>>adj,int src,int v) {
		Queue<Integer> q = new LinkedList<>();
		int[]distArray = new int[v];
		for(int i=0;i<distArray.length;i++) {
			distArray[i] = 100000;
		}
		q.add(src);
		distArray[src] = 0;
		while(!q.isEmpty()) {
			int curr = q.poll();
			for(int neighbour:adj.get(curr)) {
				if(distArray[curr]+1< distArray[neighbour]) 
				{
					distArray[neighbour] = distArray[curr]+1;
					q.add(neighbour);
				}
			}
		}
		
		for(int i=0;i<distArray.length;i++) {
			System.out.println(i+" "+distArray[i]);
		}
		
	}
}
