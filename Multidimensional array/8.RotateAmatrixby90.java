package multiDimensionalArray;

public class rotateMatrixbu90 {
	public static void main(String[]args) {
		
		//original matrix
		
		int[][]a= 
			{
		        {10, 20, 30, 40},
		        {15, 25, 35, 45},
		        {25, 29, 37, 48},
		        {32, 33, 39, 50},
		    };
		
		
		// for rotating a matrix by 90-degree we need 
	   // to first transpose the matrix and reverse each row 
		
		
		//1. Transpose the matrix
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[0].length;j++) {
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		//2. Reverse each row of  the Transposed matrix 
		
		for(int i=0;i<a.length;i++) {                          //traverse each row
			for(int j=0;j<a[0].length/2;j++) {                 //traverse half the column and swap elements
				int temp = a[i][j];
				 a[i][j]=a[i][a[0].length-j-1];
				 a[i][a[0].length-j-1] = temp;
			}
		}
		
		
		
		
		System.out.println("The rotated matrix is : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++){
			     System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
		
		
		
	}

}
