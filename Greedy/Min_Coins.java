package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Min_Coins {

	public static void main(String[] args) {
		int[]coins = {1,2,5};
		int amount = 11;
		int ans = minCoins(coins,amount);
		System.out.println(ans);
	}
	
	static int minCoins(int[]coins,int amount) {
	
		// sort the array and reverse it
		Arrays.sort(coins);
		int i = 0;
		int j = coins.length-1;
		
		while(i<=j) {
			int temp = coins[i];
			coins[i] = coins[j];
			coins[j] = temp;
			i++;
			j--;
		}
		int ans = 0;
		ArrayList<Integer>list = new ArrayList<>();
		for(i=0;i<coins.length;i++) {
			if(amount <= 0) break;
			if(coins[i] <= amount )
			while(coins[i] <= amount ) {
				ans++;
				list.add(coins[i]);
				amount = amount - coins[i];
			}
		}
		
		System.out.println(list);  // these are the coins being used
		return ans;
		
	}

}
