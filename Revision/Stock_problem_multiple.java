/* 
 
 Given a Stock : Here you can buy and sell multiple stocks => return the maximum profit
 
 Algo :
   if(a[i+1] > a[i]) => profit += a[i+1] - a[i]
 
  */

package Revision;
public class Stock_problem_multiple {

	public static void main(String[] args) {
		int[]a = {5,2,6,1,4,7,3,6};
		int ans = fun(a);
		System.out.println(ans);
	}
	

	static int fun(int[]a) {
		int maxProfit = 0;
		int profit = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]>a[i]) {
				 profit = profit + a[i+1]-a[i];
				if(profit>maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

}
