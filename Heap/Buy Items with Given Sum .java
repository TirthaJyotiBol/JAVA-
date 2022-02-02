package Heap;
import java.util.*;
public class Buy_items_with_givenSum {

	public static void main(String[] args) {
		int[]a = {1,12,5,111,200};
		int sum = 10;
		
		int ans = items(a,sum);
		System.out.println(ans);
	}
	
	static int items(int[]a,int sum2) {
		int count = 0;
		int sum = sum2;
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(pq.peek() <= sum ) {
				sum = sum - pq.peek();
				pq.poll();
				count++;
			}
			else {
				break;
			}
			
		}
		
		return count;
	}

}
