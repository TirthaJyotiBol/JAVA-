/* 
  Knight can traverse in 8 directions : 
  go all 8 directions and print the path travelled by knight to adjust to the correct position
 
   */

package backtracking;
public class Knight_Tour {

	public static void main(String[] args) {
		int n = 5;
		int r = 2;
		int c = 2;
		int[][]board = new int[n][n];
		Tour(board,r,c,n,1);
	}
	
	public static void Tour(int[][]board,int i,int j,int n,int move) {
		if(i<0 || i>=n || j>=n || j<0 || board[i][j] > 0 ) {
			return;
		}
		
		else if(move == n*n) {
			board[i][j] = move;
			print(board,n);
			board[i][j] = 0;
			return;
		}
		
		board[i][j] = move;
		Tour(board,i-2 , j+1, n, move+1);
		Tour(board,i-1 , j+2, n, move+1);
		Tour(board,i+1 , j+2, n, move+1);
		Tour(board,i+2 , j+1, n, move+1);
		Tour(board,i+2 , j-1, n, move+1);
		Tour(board,i+1 , j-2, n, move+1);
		Tour(board,i-1 , j-2, n, move+1);
		Tour(board,i-2 , j-1, n, move+1);
		board[i][j] = 0;
	}
  
	
	static void print(int[][]board,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
