package multiDimensionalArray;
import java.util.*;
public class sortMatrix {

	public static void main(String[]args) {
		int[][]Mat = {{1,2,8,9},{1,4,3,2},{9,8,7,5},{0,5,77,89}};
		int []aux = new int[Mat.length* Mat[0].length];
		int k=0;
		
		
		//put the elements in the auxialary array 
		for(int i=0;i<Mat.length;i++) {
			for(int j=0;j<Mat[0].length;j++) {
				aux[k++]=Mat[i][j];
			}
		}
		
		//sort the auxialary array 
		Arrays.sort(aux);
		
		k=0;
		
		//put the elements of the sorted array into the matrix again 
		for(int i=0;i<Mat.length;i++) {
			for(int j=0;j<Mat[0].length;j++) {
				Mat[i][j]=aux[k++];
			}
		}
		
		
		
		for(int i=0;i<Mat.length;i++) {
			for(int j=0;j<Mat[0].length;j++) {
				System.out.print(Mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
