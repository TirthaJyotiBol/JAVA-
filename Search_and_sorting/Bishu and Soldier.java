/*                      Optimised 		



 		Q Return an array of size 2
 		a[0] => The case ,  for how many person we want to calculate sum   (m)
 		a[1] => sum from 0 -> m

		Q. User Inputs ->
		
		1. Take size of array
		2. Take the elements into the array
		3. Total test cases (Q)
		4. Value m 
		
		
		Output 
		1. Return an array of size 2
		2. a[0] = test case  -> m
		   a[1] = sum of all the elements before m index
		3. If m > a.length , then 
		   a[0] = a.length
		   a[1] = sum of all the elements in the array
		   
		   
		   
	Solution ->
	
	Optimised => Here instead of taking sum each time , make a auxialary array having sum stored
	 			Return from that array

  */


package strings;
import java.util.*;
public class BishuSoldier_optimised {
	public static void main(String args[]) {
		
		int[]ans = new int[2];
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[]a = new int[N];
		for(int i=0;i<N;i++) {
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		
		/* Put the pre sum in the auxialary array to optimize the time complexity */
		int aux[] = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum+=a[i];
			aux[i] = sum;
		}

		int rounds = scan.nextInt();
		while(rounds>0) {
			int Q = scan.nextInt();
			if(Q==0) {
				ans[0]=0;
				ans[1]=0;
				printArray(ans);
			}
			else if(Q>=N) {
				ans[0]=N;
				ans[1]=aux[N-1];
				printArray(ans);
			}
			
			else {
				ans[0]=Q;
				ans[1]=aux[Q-1];
				printArray(ans);
			}
			
			rounds--;
		}
	}
	
	
	// Function to print array
	static void printArray(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}




// Brute force

/* 

		Q. User Inputs ->
		
		1. Take size of array
		2. Take the elements into the array
		3. Total test cases (Q)
		4. Value m 
		
		
		Output 
		1. Return an array of size 2
		2. a[0] = test case  -> m
		   a[1] = sum of all the elements before m index
		3. If m > a.length , then 
		   a[0] = a.length
		   a[1] = sum of all the elements in the array
		   
		   
		   
	Solution ->
	
	Bruteforce => Here take the sum in each case and return the values

  */


package strings;
import java.util.Scanner;
public class BishuSoldier_bruteforce {
	public static void main(String args[]) {
		
	int[]ans = new int[2];
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int[]a = new int[N];
	for(int i=0;i<N;i++) {
		a[i]=scan.nextInt();
	}
	
	int rounds = scan.nextInt();   //test cases
	while(rounds>0) {
		
		int sum =0;
		int m = scan.nextInt();
		if(m>=N) {				
			int i= 0;
			while(i<N) {
			sum+=a[i];
			i++;
			}
			ans[0]=N;
			ans[1]=sum;
			for(int x:ans) {
				System.out.print(x+" ");
			}
			
		}
		
		else {
			sum =0;
			for(int i=0;i<m;i++) {
				sum+=a[i];
			}
			
			ans[0]=m;
			ans[1]=sum;
			for(int x:ans) {
				System.out.print(x+" ");
			}
			
			
		}
					
		
		rounds--;
	}
	
	}
}
