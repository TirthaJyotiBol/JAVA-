package multiDimensionalArray;

import java.util.*;
public class medianInMatrix 
{
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the size of rows and columns for the matrix");
		int rows= scan.nextInt();
		int cols = scan.nextInt();
		int[][]a=new int[rows][cols];
		
		System.out.println("Enter the elements int the matrix :  ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int count=0;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(a[i][j]==1) {count++;
				if(count>max) {max=count;}
				}
			}
		}
		
		
		
		
	}

}
