/*
Q. Find the number of paths to reach the matrix end
 
 
 * if we move to the last row / column then we only have one path
 * Hense for getting total paths we need to move to the last -> which is taken as base case 
 * 
 * thus the equation would be == NOW(row-1,cols)+numOfWays(row,cols-1)
 
    ALGO:
     1. If row = 1 || col = 1 -> return 1
     2. Find for n-1
     3. Increase Row + Increase Column => Total path
  
  */

package Recursion;
public class Paths_matrix_count {
	public static void main(String[]args) {
		int row = 3;
		int col = 3;
		int ans = paths(row,col);
		System.out.println(ans);
	}
	
	static int paths(int row,int col) {
		if(row==1 || col==1) return 1;
		
		return paths(row,col-1)+paths(row-1,col);
	}
}

