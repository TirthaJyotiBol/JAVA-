//Spiral traversal

import java.util.*;
public class spiralTraversal {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns : ");
		
		int rows =scan.nextInt();
		int cols = scan.nextInt();
		int [][]mat = new int[rows][cols];
		
		
		System.out.println("Enter the elements in the matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				mat[i][j]=scan.nextInt();
			}
		}
		
		
		int min_rows = 0;
		int max_rows=mat.length-1;
		int min_cols = 0;
		int max_cols=mat[0].length-1;
		
		
		//for spiral traversing the matrix we need to traverse the whole matrix linearly
		//-> left wall, bottom wall, right wall,top wall
		
		int count =0;
		int total_elements =  rows*cols;
		
		while(count<=total_elements) {
		
// left wall
		for(int i=min_rows,j=min_cols;  i<=max_rows&& count<total_elements  ;i++)
		{
			System.out.print(mat[i][j]+" ");
			
		}
		count++;
		min_cols++;
		
// bottom wall
		
		for(int i=max_rows,j=min_cols;  j<=max_cols && count<total_elements  ;j++) 
		{
			
			System.out.print(mat[i][j]+" ");
		}
		count++;
		max_rows--;
		
		
//right wall
		
		for(int i=max_rows,j=max_cols;i>=min_rows && count<total_elements  ;i--) 
		{
			
			System.out.print(mat[i][j]+" ");
		}
		count++;
		max_cols--;
		

//top wall
		
		for(int i=min_rows,j=max_cols;j>=min_cols &&count<total_elements;j--) {
			
			System.out.print(mat[i][j]+" ");
		}
		count++;
		min_rows++;
		
		
		}
		
		
	}

}