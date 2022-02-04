package Heap;
import java.util.*;

public class Median_of_streams {

	public static void main(String[] args) {
		int[]a = { 12, 15, 10, 5, 8, 7, 16};
		median(a);
	}
	
	static void median(int[]a) {
		PriorityQueue<Integer>q1 = new PriorityQueue<>(Collections.reverseOrder());  //Max Heap
		PriorityQueue<Integer>q2 = new PriorityQueue<>();  // Min Heap
		
		for(int i=0;i<a.length;i++) {
			
			int num = a[i];
			if(q1.isEmpty() == true || num < q1.peek()) {
				q1.add(num);
			}
			else {
				q2.add(num);
			}
			
// size 
			
			// if size difference is 2
			if(q1.size() > q2.size() + 1 ) {
				q2.add(q1.poll());
			}
			
			else if(q2.size() > q1.size() + 1 ) {
				q1.add(q2.poll());
			}
			
			
// print
			if(q1.size() == q2.size()) {
				System.out.println((double)(q1.peek() + q2.peek())/2);
			}
			else if(q1.size() > q2.size() ) {
				System.out.println((double)q1.peek());
			}
			else {
				System.out.println((double)q2.peek());
			}
			
		}
		
	}

}
