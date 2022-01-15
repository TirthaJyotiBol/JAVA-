package graph;
import java.util.*;
public class DFS_stack {
	
	public ArrayList<ArrayList<Integer>>list;
	DFS_stack(int v){
		list = new ArrayList<>(v+1);
		for(int i=0;i<=v;i++) {
			list.add(new ArrayList<Integer>());
		}
	}
	
	public void vertex(int source,int destination) {
		list.get(source).add(destination);
		list.get(destination).add(source);
	}

  
/* Code for DFS */
	static void dfs(ArrayList<ArrayList<Integer>>adj,int source,int vertex) {
		Stack<Integer>stk = new Stack<>();
		boolean[]vis = new boolean[vertex+1];
		
		stk.push(source);
		vis[source] = true;
		
		while(!stk.empty()) {
			int curr = stk.pop();
			System.out.print(curr+" ");
			
			for(int neighbour:adj.get(curr)) {
				if(vis[neighbour]==false) {
					vis[neighbour] = true;
					stk.push(neighbour);
				}
			}
		}
  
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of vercices and edges : ");
		int v = scan.nextInt();
		int e = scan.nextInt();
		DFS_stack g = new DFS_stack(v);
		
		System.out.println("Enter source and destination");
		for(int i=0;i<e;i++) {
			int source = scan.nextInt();
			int destination = scan.nextInt();
			g.vertex(source, destination);
		}
		
		System.out.println("Enter Source for DFS : ");
		int source = scan.nextInt();

		dfs(g.list,source,v);
		
	}

		
	}

}
