/*
 * if we move to the last row / column then we only have one path
 * Hense for getting total paths we need to move to the last -> which is taken as base case 
 * 
 * thus the equation would be == NOW(row-1,cols)+numOfWays(row,cols-1)
 * 
 * */

package recursion;
import java.util.*;
public class numberOfWaysToReachEndOfMatrix {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of rows");
		int row = scan.nextInt();
		System.out.println("Enter the size of columns");
		int cols = scan.nextInt();
		
		int[][]mat = new int[row][cols];
		
		System.out.println("Enter the matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++) {
				mat[i][j]=scan.nextInt();
			}
		}
		
		int ways = numOfWays(row,cols);
		
		System.out.println("There are : "+ways+" ways ");
		
		
		
		
		
	}
	
	
	static int numOfWays(int row,int cols) {
		
		if(row==1 || cols==1) {return 1;}
		
		else return numOfWays(row-1,cols)+numOfWays(row,cols-1);
		
	}

	
	
}
