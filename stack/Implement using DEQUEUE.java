/*
 	  DEQUE is a "Doubly Ended Queue" - 
 	  Here the operations (push , pull , peek) occurs at both side of the Queue
 	  
 	  push -> addFirst()
 	  pop  -> removeFirst()
 	  peek -> peekFirst()
 	  
  */

package stack;
import java.util.*;
public class Implement_using_dequeue {
	public static void main(String[]args) {
		stack s = new stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.peek();   // 3 should be the peek
		s.print();  
		
		s.pull();
		s.peek(); // 2 should be the peek
		s.print();
	}
	
	static class stack{
		Deque<Integer> dq = new LinkedList<>();
		
		// For push insert elements at the beginning
		void push(int x) {
			dq.offerFirst(x);
		}
		
		// For pull perform poll operations in beginning
		int pull() {
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
