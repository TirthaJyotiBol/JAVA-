package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Factorial_Knapsack {

	public static void main(String[] args) {
		int[] wt = { 10, 40, 20, 30 };
        int[] val = { 60, 40, 100, 120 };
        int capacity = 50;
        
		double ans = maxProfit(val,wt,capacity);
		System.out.println(ans);
		
	}
	
	static double maxProfit(int[]val,int[] wt,int capacity) {
		items[] arr = new items[wt.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new items(wt[i],val[i],i);
		}
		
		
		Arrays.sort(arr, new Comparator<items>() {
			@Override
			public int compare(items i,items j) {
				return j.cost.compareTo(i.cost);
			}
		});
		
		double ans = 0;
		
		for(items i : arr) {
			double currWeight = i.weight;
			double currValue = i.item;
			if(currWeight <= capacity ) {
				ans = ans + currValue;
				capacity = capacity - (int)currWeight;
			}
			else {
				// leftout space = capacity
				double fraction_cba = capacity / currWeight;   // fractional weight that can be added
				double fraction = fraction_cba * currValue;	   // get the fractional answer
				ans = ans + fraction;
				break;
			}
		}
		
		return ans;
	}
	
	static class items{
		double weight;
		double item;
		Double cost;
		int ind;
		
		items(int weight,int item,int index){
			this.weight = weight;
			this.item = item;
			this.ind = index;
			cost = (double)this.item / (double)this.weight;
		}
	}

}
