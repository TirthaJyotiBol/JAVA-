package graph;
import java.util.*;
public class Snake_Ladder_1Darray {

	public static void main(String[] args) {
		int n = 30;
		int[]board = new int[30];
		for(int i=0;i<n;i++) board[i] = -1;
		// Ladders
        board[2] = 21;
        board[4] = 7;
        board[10] = 25;
        board[19] = 28;
 
        // Snakes
        board[26] = 0;
        board[20] = 8;
        board[16] = 3;
        board[18] = 6;
        
        int minMoves = minMoves(board,n);
        System.out.println("The minimum number of moves required is "+minMoves);
	}
	
	static class Qentry{
		int v;
		int dist;
	}
	
	static int minMoves(int[]board,int n) {
		Qentry q = new Qentry();
		Queue<Qentry>queue = new LinkedList<>();
		boolean[]vis = new boolean[n];
		
		q.dist = 0;
		q.v = 0;
		vis[0] = true;
		queue.add(q);
		
		while(!queue.isEmpty()) {
			q = queue.poll();
			int index = q.v;
			
			if(index == n-1) break;
			
			for(int i=index+1 ;i<=index+6 && i<n;i++) {	//dice throw
				
				if(vis[i] == false) {		// if not visited then perform the operations
					Qentry a = new Qentry();
					a.dist = q.dist+1;
					vis[i] = true;
					
					if(board[i] != -1) {
						a.v = board[i];
					}else {
						a.v = i;
					}
					queue.add(a);
				}
				
			}
		}
		
		return q.dist;
	}

}
