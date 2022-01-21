/* Find the shortest path of all the nodes from the source  */
package graph;
import java.util.*;

public class Dijkstra_Algorithm {

	// Node used for priority Queue
	static class Node implements Comparator<Node>{
		int data;
		int weight;
		Node(){};
		Node(int data,int weight){
			this.data = data;
			this.weight  = weight;
		}
		
		@Override
		public int compare(Node node1, Node node2) {
			if(node1.weight>node2.weight) {
				return 1;
			}
			if(node1.weight < node2.weight) return -1;
			return 0;
		}
	}
	
  /* Function that finds the shortest path */
	static void findShortestPath(ArrayList<ArrayList<Node>>adj,int v,int src) {
		PriorityQueue<Node> queue = new PriorityQueue<>(v,new Node());
		int[]dist = new int[v+1];
		
		for(int i=0;i<dist.length;i++) dist[i] = Integer.MAX_VALUE;
		
		queue.add(new Node(src,0)); 	// source is having distance 0
		dist[src] = 0;
		
		/* 
		 if parentDistance + childDistance < childDistance => update child distance
		 Neighbour => Child
		 Curr => parent
		  */
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			for(Node neighbour:adj.get(curr.data)) {
				if(neighbour.weight + dist[curr.data] < dist[neighbour.data] ) {
					dist[neighbour.data] = dist[curr.data]+ neighbour.weight;
					queue.add(new Node(neighbour.data,dist[neighbour.data]));
				}
			}
		}
		
		/* Print the distances */
		for(int i=src;i<dist.length;i++) {
			System.out.println(i+" "+dist[i]);
		}
		
	}
	
  
  // Add nodes
	static void add(ArrayList<ArrayList<Node>>adj,int src,int dest,int weight) {		
		adj.get(src).add(new Node(dest,weight));
		adj.get(dest).add(new Node(src,weight));
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Node>>adj = new ArrayList<>();
		
		System.out.println("Enter the Number of Vertices :");
		int v = scan.nextInt();
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Node>());
		}
		
		System.out.println("Enter the number of Edges ");
		int e = scan.nextInt();

		System.out.println("Enter the source , destination and weight : ");
		for(int i=0;i<e;i++) {
			int src = scan.nextInt();
			int dest = scan.nextInt();
			int weight = scan.nextInt();
			add(adj,src,dest,weight);
		}
		
		findShortestPath(adj,v,1);
		
	}

}

