/*
push -> addLast()
poll -> removeFirst()
peek() -> peekFirst()

*/

package Queue;
import java.util.*;
public class Implement_using_DEQUEUE {
	public static void main(String[]args) {
		queue q = new queue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		q.peek();   // peek should be 1
		q.print();  // [1,2,3,4]
		
		q.poll();
		q.peek();  // peek should be 2
		q.print(); // [2,3,4]
	}
	
	static class queue{
		Deque<Integer>dq = new LinkedList<>();
		
		void push(int x) {
			dq.addLast(x);
		}
		
		int poll() {
			if(dq.size()==0) return -1;
			return dq.pollFirst();
		}
		
		void peek() {
			System.out.println(dq.peekFirst());
		}
		
		void print() {
			System.out.println(dq);
		}
		
	}
}
