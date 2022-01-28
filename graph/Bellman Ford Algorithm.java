/* 
 
 Shortest distance from the source to all nodes 
 Here negative weight can also be present
  
*/

package graph;
import java.util.*;
public class Bellman_Ford {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Node>list = new ArrayList<>();
		
		System.out.println("Enter the Number of Edges and vertices ");
		int e = scan.nextInt();
		int v = scan.nextInt();
		
		System.out.println("Enter source , destination and weight : ");
		for(int i=0;i<e;i++) {
			int src = scan.nextInt();
			int des = scan.nextInt();
			int wt = scan.nextInt();
			list.add(new Node(src,des,wt));
		}
		
		Bellman_Algo(list,v,0);
		
	}
	
	static class Node{
		int u,v,wt;
		Node(int u,int v,int wt){
			this.u = u;
			this.v = v;
			this.wt = wt;
		}
	}
	
	static void Bellman_Algo(ArrayList<Node>adj,int v,int src) {
		int[]dist = new int[v];
		
		for(int i=0;i<dist.length;i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[src] = 0;
		
		for(int i=1; i<=v-1; i++) {
			for(Node x:adj) {
				if(dist[x.u] + x.wt < dist[x.v] ) {
					dist[x.v] = dist[x.u]+ x.wt;
				}
			}
		}
		
		boolean isCyclic = false;
		for(Node x:adj) {
			if(dist[x.u] + x.wt < dist[x.v] ) {
				isCyclic = true;
				break;
			}
		}
		
		
		if(isCyclic) {
			System.out.println("Negative Cycle Exists");
		}
		else {
			for(int i=0;i<dist.length;i++) {
				System.out.print(dist[i]+" ");
			}
		}
		
	}
	

}
