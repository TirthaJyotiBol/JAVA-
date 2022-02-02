package Heap;
import java.util.*;

public class min_cost_to_connect_n_ropes {

	public static void main(String[] args) {
		int[]a = {2,5,4,8,6,9};
		int ans = minCost(a);
		System.out.println(ans);
		
	}
	
	static int minCost(int[]a) {
		int cost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		
		while(pq.size()>1) {

			int first  = pq.poll();
			int second = pq.poll();
			
			int sum = first + second;
			cost = cost + sum;
			pq.add(sum);
		}
		
		return cost;
	}

}
