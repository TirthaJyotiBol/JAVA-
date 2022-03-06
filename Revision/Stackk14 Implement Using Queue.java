// stack implementation using a single and 2 Queues

package Revision;
import java.util.*;
public class Stackk14_StackUsingQueue {

	public static void main(String[] args) {
		stack s1 = new stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.pop();
		s1.pop();
		s1.print();
		
		stack_1 stk = new stack_1();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.pop();
		stk.print();
		
		stack_1 stack = new stack_1();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.print();
		
		
		
	}

  
// stack using 2 Queues
	static class stack{
		Queue<Integer>q1 = new LinkedList<>();
		Queue<Integer>q2 = new LinkedList<>();
		
		void push(int x) {
			q2.add(x);
			
			while(q1.isEmpty() == false) {
				q2.add(q1.poll());
			}
			
			Queue<Integer>temp = q1;
			q1 = q2;
			q2 = temp;
		}
		
		int pop() {
			if(q1.isEmpty()) {
				System.out.println("Underflow");
				return -1;
			}
			return q1.poll();
		}
		
		int size() {
			return q1.size();
		}
		
		void print() {
			System.out.println(q1);
		}
		
	}

  
  
// Stack Implementation using 1 Queue
	static class stack_1{
		Queue<Integer>q = new LinkedList<>();
		
		void push(int x) {
			q.add(x);
			for(int i=0;i<q.size()-1;i++) {
				q.add(q.poll());
			}
		}
		
		int pop() {
			if(q.isEmpty()) {
				System.out.println("Underflow");
				return -1;
			}
			return q.poll();
		}
		
		int size() {
			return q.size();
		}
		
		void print() {
			System.out.println(q);
		}
		
	}
	
  
  
// stack using Deque
	static class stack_deque{
		Deque<Integer>q = new LinkedList<>();
		
		void push(int x) {
			q.add(x);
		}
		
		int pop() {
			if(q.size() == 0) {
				System.out.println("Underflow");
				return -1;
			}
			
			int removed_element =  q.peekLast();
		    q.pollLast();
		    return removed_element;
		}
		
		void print() {
			System.out.println(q);
		}
		
	}
}
