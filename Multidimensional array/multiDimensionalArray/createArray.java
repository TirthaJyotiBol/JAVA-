package multiDimensionalArray;

import java.util.Scanner;
public class createArray {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		
		int[][]a = new int[rows][cols];
		int[][]b= new int [rows][cols];
	    int[][]sum = new int[rows][cols];
		
		//take user input for matrix
	    //input for both matrix a and b is taken
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		
		// matrix addition is done -> 
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		
		//print the matrix after addition
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
