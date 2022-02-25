package Revision;

public class Spiral_traversal_matrix {

	public static void main(String[] args) {
		int[][]a = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		spiralTraversal(a);
		

	}
	
	static void spiralTraversal(int[][]a) {
		int cnt = 0;
		int total = a.length * a[0].length;
		
		int minRow = 0 , minCol = 0;
		int maxRow = a.length-1 ,maxCol = a[0].length-1 ;
		
		while(cnt < total) {
			
			// Left Wall 
			for(int i=minRow,j=minCol ; i<=maxRow && cnt<=total  ; i++) {
				System.out.print(a[i][j]+" ");
				cnt++;
			}
			minCol++;
			
			// Bottom Wall
			for(int i = maxRow,j=minCol; j<=maxCol && cnt<=total ; j++ ) {
				System.out.print(a[i][j]+" ");
				cnt++;
			}
			maxRow--;
			
			//Right Wall
			for(int i = maxRow, j = maxCol; i>=minRow && cnt<total ; i-- ) {
				System.out.print(a[i][j]+" ");
				cnt++;
			}
			maxCol--;
			
			// Top Wall
			for(int i = minRow,j=maxCol;j>=minCol && cnt<total ; j--) {
				System.out.print(a[i][j]+" ");
				cnt++;
			}
			minRow++;
		}
		
	}

}
