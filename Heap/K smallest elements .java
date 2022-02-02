package Heap;
import java.util.*;
public class K_Smallest_Elements {

	public static void main(String[] args) {
		int[]a = {10,16,24,11,8,19};
		int k = 3;
		System.out.println("K small Elements : ");
		fun(a,k);
	}

	static void fun(int[]a,int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<k;i++) {
			pq.add(a[i]);
		}
		
		for(int i=k;i<a.length;i++) {
			if(a[i]<pq.peek()) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		
		while(pq.isEmpty() == false) {
			System.out.println(pq.peek());
			pq.poll();
		}
	}
}
