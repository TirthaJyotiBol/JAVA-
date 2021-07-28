/*
 * in case of recursion same step is repeated multiple times
 * To overcome from this situation we use DP
 * Here the elements are stored in an array 
 * If  repetitions occurs then we simply use that element in the array
 * */


package dynamic_programming;

public class fibonacciElement {
	public static void main(String[]args) {
		int n =9;
		System.out.print("The "+n+"th fibonacci element is : ");
		System.out.println(fib(n,new int[n+1]));
		
	}
	
	
	
	static int fib(int n,int []q) {
		if(n==0 || n==1) {return n;}  //base case 
		
		if(q[n]!=0) {
			// if we have element present at that position then we simply use this
			return q[n];
		}
		
		int fib = fib(n-1,q)+fib(n-2,q);
		
		/* At nth position we put 
		 * the element and if element is
		 *  repeated we use the element */
		
		q[n]=fib;
		return fib;
		
	}

}
