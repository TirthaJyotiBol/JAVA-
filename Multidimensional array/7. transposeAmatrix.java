package multiDimensionalArray;

public class transposeAmatrix {
	public static void main(String[]args) {
		int[][]a= 
		{
	        {10, 20, 30, 40},
	        {15, 25, 35, 45},
	        {25, 29, 37, 48},
	        {32, 33, 39, 50},
	    };
		

		int rows =a.length;
		int cols = a[0].length;
		
				
//		transpose a matrix
		for(int i=0;i<rows;i++) 
		{
			for(int j=i;j<cols;j++)
			{
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]= temp;
			}
		}
		
		
		System.out.println("transpose of the matrix :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

			
   }
	
	

}
