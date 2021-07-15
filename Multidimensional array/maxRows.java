package multiDimensionalArray;

public class maxRows {
	public static void main(String[]args) {
		int[][]a =
				{ { 0, 0, 0, 1 },
                    { 0, 1, 1, 1 },
                    { 1, 1, 1, 1 },
                    { 0, 0, 0, 0 } };
		           
		      
		        
		        int col = a[0].length-1;
		        int count=0;
		        int maxRow=-1;
		        for(int i=0;i<a.length;i++){

		            while(col>=0 && a[i][col]==1){
		                col--;
		               maxRow=i;
		            }
		        }
		        System.out.println(maxRow);
		        
	}

}
