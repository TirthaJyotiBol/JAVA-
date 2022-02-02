/* 
 Given a k sorted array , sort the array in less complexity
 
 We firstly store the first K elements into the priority Queue 
 Remove and add into the array to perform this at O(nlogk)
 
 Here only a space of O(K) is used
 
  */

package Heap;
import java.util.*;

public class Sort_k_sorted_array {

	public static void main(String[] args) {
		int[]a = {9,8,7,19,18};
		int k = 3;
		sort(a,k);
	}
	
	static void sort(int[]a,int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		
		for(int i=0;i<=k;i++) {
			pq.add(a[i]);
		}
		int index = 0;
		
		for(int i=k+1; i<a.length; i++) {
			a[index++] = pq.poll();
			pq.add(a[i]);
		}
		
		while(!pq.isEmpty()) {
			a[index++] = pq.poll();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
