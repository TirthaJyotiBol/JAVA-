/* 
 Q. Given a stock in arrays , find the maximum profit on buying and selling stock (1 at a time)
 
 */

package Revision;

public class Stock_Problem_1 {

	public static void main(String[] args) {
		int[]a = {100,180,260,310,40,535,695};
		
		int ans =  bruteforce(a);
		System.out.println("Bruteforce : "+ans);
		
		ans = moderate(a);
		System.out.println("Using space : "+ans);
		
		ans = optimized(a);
		System.out.println("Optimized : "+ans);
	}
	
	
	
	/*  BruteForce O(n2) => Traverse all the elements and find possibility of each stock  */
	
	static int bruteforce(int[]a) {
		int maxProfit = 0;
		
		for(int i=0;i<a.length;i++) {
			int buy = a[i];
			for(int j = i+1 ;j<a.length;j++) {
				int sell = a[j];  
				
				int profit = sell - buy;
				if(profit>maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}
	
	
	/* Use space of O(n) to optimize a little bit => make a auxialary array that contains future max */
	
	static int moderate(int[]a) {
		int[]aux = new int[a.length];
		int i = aux.length-2;
		aux[aux.length-1] = a[a.length-1];
		
		while(i>=0) {
			aux[i] = Math.max(aux[i+1], a[i]);
			i--;
		}
		int maxProfit = Integer.MIN_VALUE;
		for(i=0;i<aux.length-1;i++) {
			int profit = aux[i] - a[i];
			if(profit > maxProfit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}
	
	/* 1. Get the min so far  => min = Math.min(min,a[i])
	   2. substract a[i] with min so far => this gives profit
	   3. If profit > maxProfit -> update maxProfit
	*/
	
	static int optimized(int a[]) {
		int min_so_far= a[0];
		int maxProfit = 0;
		
		for(int i=0;i<a.length;i++) {
			min_so_far = Math.min(a[i], min_so_far);
			int profit = a[i] - min_so_far;
			if(profit>maxProfit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}

}












