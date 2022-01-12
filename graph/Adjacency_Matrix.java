/*
 Q. Given a graph having edges => [1,2] [1,3] [2,3] 
    Represent using adjacency Matrix
    
    
    [1,2] means 1 connected to 2 and 2 connected to 1
 */

package graph;
public class Adjacency_Matrix {

	public static void main(String[] args) {
		
		int n = 3;  // number of vertices
		int m = 3;  // number of edges
		
		int[][]graph = new int[n+1][n+1];
		
		// 1,2 Link
		graph[1][2] = 1;
		graph[2][1] = 1;
		
		// 2,3 Link
		graph[2][3] = 1;
		graph[3][2] = 1;
		
		// 3,1 Link
		graph[1][3] = 1;
		graph[3][1] = 1;
		
		
		// print the graph
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph.length;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}

}
