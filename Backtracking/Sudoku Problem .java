package backtracking;

public class Sudoku_solver {

	public static void main(String[] args) {
		int grid[][] = { 
				 {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		sudoku(grid, 0, 0);
		

	}
	
	public static void sudoku(int[][]board, int i, int j) {
		if(i == board.length) {
			printBoard(board);
			return;
		}
		int ni = 0;
		int nj = 0;
		
		if( j == board[0].length -1) {
			ni = i+1;
			nj = 0;
		}
		else {
			ni = i;
			nj = j + 1;
		}
		
		
		if(board[i][j] != 0) 
		{
				sudoku(board,ni,nj);
		}
		
		else 
		{
			
		for(int val=1; val<=9; val++) {
			if(isValid(board,i,j,val)) {
				board[i][j] = val;
				sudoku(board,ni,nj);
				board[i][j] = 0;
			}
		}
		
	 }
		
  }
	
	
	public static boolean isValid(int[][]board, int row, int col,int val) {
		
	// check if row having the same value
		for(int i=0;i<board.length;i++) {
			if(board[row][i] == val) {
				return false;
			}
		}
		
		
	// check same col
		for(int i=0;i<board.length;i++) {
			if(board[i][col] == val) {
				return false;
			}
		}
		
		
	// check for sub matrix	
		int smr = row/3 * 3;
		int smc = col/3 * 3;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[smr+i][smc+j] == val) {
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	
	public static void printBoard(int[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" " );
			}
			
			System.out.println();
		}
	}
	

}
