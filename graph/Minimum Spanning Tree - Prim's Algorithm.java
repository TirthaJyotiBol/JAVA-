package graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims_Algorithm_MST {
	static class Node implements Comparator<Node>{

		int data;
		int weight;
		Node(){};
		Node(int data,int weight){
			this.data = data;
			this.weight = weight;
		}
		
		@Override
		public int compare(Node n1,Node n2) 
		{
			if(n1.weight>n2.weight) return 1;
			else if(n1.weight < n2.weight) return -1;
			return 0;
		}
		
	}
	
	static void fun(ArrayList<ArrayList<Node>>adj,int v) {
		int[]weight = new int[v];
		int[]parent = new int[v];
		boolean[]mst = new boolean[v];
		
		// fill all the arrays with its definite value 	
		for(int i=0;i<v;i++) {
			weight[i] = Integer.MAX_VALUE;
			parent[i] = -1;
			mst[i] = false;
		}
		
		
		weight[0] = 0;			// weight array
		
		PriorityQueue<Node>pq = new PriorityQueue<Node>(v,new Node());
		pq.add(new Node(0,weight[0]));
		
	// Traverse upto N-1 : because we need N-1 Nodes to make a Minimum Spanning Tree
		for(int i=0;i<v-1 ;i++) {
			
			int curr = pq.poll().data;
			mst[curr] = true;
			
			for(Node neighbours:adj.get(curr)) {
				if(mst[neighbours.data] == false && neighbours.weight < weight[neighbours.data] ) {
					weight[neighbours.data] = neighbours.weight;
					parent[neighbours.data] = curr;
					pq.add(new Node(neighbours.data,weight[neighbours.data]));
				}
			}
			
			
		}
		
/* Print the tree */
		for(int i=1;i<v;i++) {
			System.out.println(parent[i]+" - "+i);
		}	
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Node>>adj = new ArrayList<>();
		
		int v = 5;
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Node>());
		}
		
		System.out.println("Enter the Edge size ");

		int e = scan.nextInt();
		System.out.println("Enter the source , deestination and its weight : ");
		for(int i=0;i<e;i++) {
			int src = scan.nextInt();
			int des = scan.nextInt();
			int weight = scan.nextInt();
			add(adj,src,des,weight);
		}
		
		fun(adj,v);	
	}
	
	
	static void add(ArrayList<ArrayList<Node>>adj,int src,int des,int weight) {
		adj.get(src).add(new Node(des,weight));
		adj.get(des).add(new Node(src,weight));
	}
	

}
