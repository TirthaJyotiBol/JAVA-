/*

ALGO :

push() -
  1. Add element to q2
  2. MMove all the elements from Q1 -> Q2
  3. swap Q1,Q2
  
 pop() -
  1. Q1.pop();

*/

package stack;
import java.util.*;
public class ImplementUsing_TWO_qeues {
	public static void main(String[]args) {
		stack s = new stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		
		s.top();
		s.print();
	}
	
	static class stack{
		int size = 0;
		Queue<Integer>q1 = new LinkedList<>();
		Queue<Integer>q2 = new LinkedList<>();
		
		void push(int x) {
			size++;
			
			//add
			q2.add(x);
			
			// Remove all elements from q1 to q2
			while(!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.poll();
			}
			
			// swap q1,q2
			Queue<Integer>temp = new LinkedList<>();
			temp = q1;
			q1 = q2;
			q2 = temp;
		}
		
		
		int pop() {
			size--;
			if(q1.size()==0) return -1;
			return q1.poll();
		}
		
		void top() {
			System.out.println(q1.peek());
		}
		
		void print() {
			System.out.println(q1);
		}
	}
}
