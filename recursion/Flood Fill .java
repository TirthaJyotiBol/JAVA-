/*
 Q. Print all the Adjoining Elements related to the current
 
 Example : 
  
  1,1,1
  1,1,0   => ( change (1,1) to 2 )
  1,0,1
  
  2,2,2
  2,2,0   => All the elements related to (1,1) are changed
  2,0,1
  
  */

package Recursion;
public class flood_fill {
	public static void main(String[]args) {
		int[][]image = {
						{1,1,1},
						{1,1,0},
						{1,0,1}
						};
		
		print(image);
		fill(image,1,1,2,1);
		print(image);
	}
	
	static void print(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void fill(int[][]a , int r, int c, int toFill ,int prevFill) {
		int row = a.length;
		int col = a[0].length;
		
		// base condition
		if(r>=row || r<0 || c>=col || c<0) {
			return;
		}
		if(a[r][c] !=prevFill) return;   // If the current element doesnot matches with input parameter then return
		
		a[r][c] = toFill;
		fill(a , r+1, c, toFill , prevFill);
		fill(a , r-1, c, toFill , prevFill);
		fill(a , r, c+1, toFill , prevFill);
		fill(a , r, c-1, toFill , prevFill);
		
	}
}
