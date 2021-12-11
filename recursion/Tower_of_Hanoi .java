
/*
coding ninjas

Move from A to C
A-> source  , B-> Helper , C-> Destination

*/

package Recursion;
import java.util.*;
public class Tower_of_Hanoi {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of disks ");
		int n = scan.nextInt(); 

		
		toh(n,1,2,3);  //  number of towers should always be 3
	}
	
	
	static void toh(int n,int A,int B,int C) {
		   // Move N disc from A to C -> source to destination
		if(n==0)return;
		if(n==1) {
			System.out.println("Move "+n+" disc from "+A+" to "+C);
			return;
		}
		
		toh(n-1,A,B,C);
		System.out.println("Move "+n+" disc from "+A+" to "+C);
		toh(n-1,B,C,A);	
		
	}
	
}
