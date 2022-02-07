package Dynamic_Programming;

public class Knapsack_01 {
	public static void main(String[]args) {
		int w = 50;
		int wt[] = {10,20,30};
		int val[] = {60,100,120};
		int n = val.length;
		
		int ans = knapsack(wt,val,w,n);
		System.out.println(ans);
	}
	
	static int knapsack(int[]wt,int[]val,int w,int n) {
		
		// base condition
		if(n == 0 || w == 0) {
			return 0;
		}
		
		// if item weight is greater than knapsack weight then dont include
		if(wt[n-1] > w ) {
			return knapsack(wt,val,w,n-1);
		}

	   return Math.max((val[n-1]+knapsack(wt,val,w-wt[n-1],n-1) ),knapsack(wt,val,w,n-1));
	}
	
}
