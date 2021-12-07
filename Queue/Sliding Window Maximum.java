/*
	Q. Find the Maximum element of each window of size k
	
	Algo ->
		1. Use Doubly Ended Queue (push and pop in both sides)
		2. Push index in deque -> to remove the element as soon as size is achieved
		3. Perform the operation for the first k elements
		    * put the elements in queue
		    * remove elements from back until queue becomes empty of element > peek 
		          (This is done to get the elements which can be maximum)
		4. Perform the operations for the remaining elements
		    * Add the peek element to the list
		    * If the i-k is greater then peek index then remove the first element from queue
		    * Execute step 3 here
		5. After coming out of the loop add the peek() element in the list
				This gives the last maximum index
*/


package deque;
import java.util.*;
public class Sliding_window_maximum {
	public static void main(String[] args) {
		int a[]= { 8 ,5, 10, 7 ,9, 4, 15 ,12, 90, 13};
		int k = 4;
		int n = a.length;
		ArrayList<Integer>ans = new ArrayList<>();
		ans = maxm(a,k,n);
		System.out.println(ans);
	}
	
	
	static ArrayList<Integer> maxm(int[]a,int k,int n){
		ArrayList<Integer> list = new ArrayList<>();
		Deque<Integer> dq = new ArrayDeque<>();
		
		
		// perform the first window
		int i=0;
		for(i=0;i<k;i++) {	
			while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
				dq.removeLast();
			}	
			dq.addLast(i);
		}
		
		
		// handle the conditions for the other elements	
		for(;i<n;i++) {
			list.add(a[dq.peek()]);
			
			// remove the first element from the queue as soon as the size exceeds
			if(!dq.isEmpty() && dq.peek()<=i-k) {
				dq.removeFirst();
			}
			
			// Handle the other elements as done before
			while(!dq.isEmpty() && a[dq.peekLast()]<a[i]) {
				dq.removeLast();
			}
			
			dq.addLast(i);
		}
		
		
		list.add(a[dq.peek()]);
		return list;
	}
}
