package graph;
import java.util.*;
public class Graph {

	private LinkedList<Integer> adj[];          // Array of LinkedList
// Graph Initialization :	
	public Graph(int v) {
		adj = new LinkedList[v+1];
		for(int i=0;i<adj.length;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	// Add Vertex 
	void addVertex(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
// print the graph
	static void print(Graph g) {
		for(int i=0; i<g.adj.length;i++) {
				System.out.println(i+" -> "+g.adj[i]);
		}
	}
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of vertex and edges : ");
		int v = scan.nextInt();
		int e = scan.nextInt();
		Graph g = new Graph(v);
	// connection	
		System.out.println("Enter the source and destination : ");
		for(int i=0;i<e;i++) {
			int src = scan.nextInt();
			int des = scan.nextInt();
			g.addVertex(src, des);
		}
		print(g);
	}

}
