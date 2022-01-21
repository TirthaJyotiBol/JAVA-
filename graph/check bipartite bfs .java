/* 
 if adjacent nodes having different colors(1,0) ->-1 means no color => Bipartite
 	else => not bipartite
  */

package graph;
import java.util.*;
public class isBipartite_bfs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
		System.out.println("Enter the number of vertices : ");
		int v = scan.nextInt();
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		System.out.println("Enter the number of edges : ");
		int e = scan.nextInt();
		for(int i=0;i<e;i++) {
			int src = scan.nextInt();
			int des = scan.nextInt();
			add(adj,src,des);
		}
		
		boolean ans = isBipartite(adj,v,1);
		System.out.println(ans);
		
	}
	
	static void add(ArrayList<ArrayList<Integer>>adj,int src,int des) {
		adj.get(src).add(des);
		adj.get(des).add(src);
	}

	static boolean isBipartite(ArrayList<ArrayList<Integer>>adj,int v,int src) {
		Queue<Integer>q = new LinkedList<>();
		int []color  = new int[v+1];
	// initialize all the elements of the array as -1
		for(int i=0;i<color.length;i++) {
			color[i] = -1;
		}
		
		q.add(src);
		color[src] = 1;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			for(int child : adj.get(curr)) {
				
				// if parent == 1 -> color child to 0  and vice versa
			if(color[child] == -1)
			{
				if(color[curr] == 0) 
						color[child] = 1;
				
				if(color[curr] == 1) 
						color[child] = 0;
				
				q.add(child);
			}
			
			/* if we find already colouerd element in the graph which equals to parent then we conside this as bipartite  */
			else if(color[child] == color[curr] && color[child]!=-1)
			{
				return false;
			}
		
		}
	}
		
	return true;
	}
	
}
