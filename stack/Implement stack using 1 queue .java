/*

push() :

1. Add element
2. while i<size-1 remove elements and again push

*/


package stack;
import java.util.*;
public class ImplementUsingQueue {
	public static void main(String[]args) {                                                             
		Stacks s = new Stacks();
		
		s.push(22);
		s.push(21);
		s.push(2);
		s.print();
		System.out.println("size : "+s.size);
		System.out.println("Top : "+s.top());

	}
	
	 static class Stacks{
		 int size = 0;
		Queue<Integer> q = new LinkedList<>();
		
		void push(int x) {
			size++;
				q.add(x);
			
				// if size is greater then remove elements and push
				for(int i=0;i<q.size()-1;i++) {
					q.add(q.peek());
					q.remove();
			}
		}
		
		int pop() {
			size--;
			return q.poll();
		}
		
		int top() {
			return q.peek();
		}
		
		void print() {
			System.out.println(q);
		}
	}
}
