package Heap;
import java.util.*;
public class k_largestElements {

	public static void main(String[] args) {
		int[]a = {11,2,3,4,10,16,0,1,5,7,8,26};
		int k = 2;
		fun(a,k);
	}
	
	static void fun(int[]a,int k) {
		if(k>a.length) {
			System.out.println(-1);
			return;
		}
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		
		for(int i=0;i<k;i++) {
			pq.add(a[i]);
		}
		
		for(int i=k;i<a.length;i++) {
			if(a[i]>pq.peek()) {
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
