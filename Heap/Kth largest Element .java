package Heap;
import java.util.*;
public class Kth_largest_Element {

	public static void main(String[] args) {
		int[]a = {20,10,60,30,50,40};
		
		int ans = fun(a,5);
		System.out.println(ans);
	}
	
	static int fun(int[]a,int k) {
		if(k>=a.length) return -1;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	
	// fill the first k elements into Priority Queue
		for(int i=0;i<k;i++) {
			pq.add(a[i]);
		}
	
	// compare each element into the Queue with remaining elements if larger found then remove and put
		for(int i=k;i<a.length;i++) {
			if(a[i] > pq.peek() ) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		
		return pq.peek();
	}

}
