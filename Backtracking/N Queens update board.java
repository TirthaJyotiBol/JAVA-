/*
  Q. Given a 2D binary matrix n*n , use backtracking and place n queens in such a way that no queens cut each other
  		
  		e.g. ->
  		      input 
  	
  		 	0 0 0 0 0 
   			0 0 0 0 0 
		  	0 0 0 0 0 
			  0 0 0 0 0 

 			  output
 			  
 			 0 1 0 0 0 
			 1 0 0 0 0 
 			 0 0 0 1 0 
			 0 0 1 0 0  
 */

package backtracking;
public class N_QUEENS {

	public static void main(String[] args) {
		
		int[][]board = { 
				 {0,0,0,0},
				 {0,0,0,0},
				 {0,0,0,0},
				 {0,0,0,0},
				};

		print(board);
		
		boolean ans = n_queen(board,0);			// start from 0th row
		
		if(ans) {
			print(board);
		}else {
			System.out.println("Queen cannot be placed");
		}
	}
	

// Find the ans while moving towards row : can alse be done through column
	public static boolean n_queen(int[][]board,int row) {
		if(row == board.length) return true;
		
		for(int i=0;i<board.length;i++) {		// vary column
			
			// if the place is safe then put the queen in that place
			if(isSafe(board,row,i)) {
				board[row][i] = 1;
			
				if(n_queen(board,row+1)) {
					return true;
				}
					board[row][i] = 0;				// backtrack if the queen is not placed at the perfect place
			}
		}
		
		return false;
	}
	
// function to check if a Queen can be placed at that index [row][col]
	public static boolean isSafe(int[][]board, int row, int col) {
		
		// check for vertical columns
		for(int i=0;i<row;i++) {
			if(board[i][col] ==1) return false;
		}
		
		// Diagonal
		for(int i=0,j=0; i<row && j<col; i++,j++) {
			if(board[i][j] == 1) return false;
		}
		
		
		return true;
	}
	
// print the maze
	public static void print(int[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+"  ");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}

}
