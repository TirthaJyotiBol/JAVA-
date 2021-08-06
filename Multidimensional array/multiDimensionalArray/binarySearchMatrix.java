package multiDimensionalArray;

import java.util.Scanner;

public class binarySearchMatrix {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int x =scan.nextInt();
		boolean isFound = false;
		int [][]a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
				};
		
		int i=a.length; 
		int j=a[0].length;
		
		int low = 0;
		int high = (i*j)-1;      //row*col
	
		while(low<=high) {
			int mid = (low + (high-low)/2);     //high -low -> coz for larger numbers it wont exceed time
			if(a[mid/j][mid%j] == x)
			{
				System.out.println("Element "+ x+ " is found at index "+ mid/j+" "+ mid%j);
			    isFound =true;
			}
			if(a[mid/j][mid%j]<x) { low = mid+1; }
			else { high = mid-1 ; }
		}
		
		if(!isFound) {System.out.println("The element is not in the matrix");}
		
		
		
	}

}
