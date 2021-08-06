package multiDimensionalArray;
import java.util.*;

public class searchOptimal {
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
		int i=0; int j=a[0].length-1;
		while(i<a.length && j>=0){
			
			if(x==a[i][j]) {
				System.out.println("Element is found at "+i +" "+ j);
				isFound= true;
			}
			
			if(a[i][j]>x) {
				j--;
			}
			else {
				i++;
			}
		}
		
		if(!isFound) {System.out.println("Element is not  found at the matrix ");}
	}

}
