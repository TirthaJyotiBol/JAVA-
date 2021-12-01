/*
 Algorithm :
  push => add element to stack1
  poll => empty stack1 and put elements to stack2 
          pop the element in stack2
          put all the elements from stack2 to stack1
  peek => This is similar to poll ; except that no popping is done in stack2
          only the topmost element is returned
  */

package Queue;
import java.util.Stack;
public class Implement_using_stack {
	public static void main(String[]args) {
		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		
		q.print();
		System.out.println("Peek : "+ q.peek());
		
		q.pop();
		q.print();
		
	}
	
	static class Queue{
		Stack<Integer>s1 = new Stack<>();
		Stack<Integer>s2 = new Stack<>();
		
		void push(int x) {
			s1.push(x);
		}
		
		int pop() {
			if(s1.empty()) return -1;
			
			while(s1.empty()==false) {
				s2.push(s1.pop());
			}
			
			int ans = s2.pop();
			
			while(s2.empty()==false) {
				s1.push(s2.pop());
			}
			
			return ans;
		}
		
		
		
		void print() {
			System.out.println(s1);
		}
		
		
		
		int peek() {
			
			if(s1.empty()) return -1;
			
			while(s1.empty()==false) {
				s2.push(s1.pop());
			}
			
			int peek = s2.peek();
			
			while(s2.empty()==false) {
				s1.push(s2.pop());
			}
			
			return peek;
			
		}
	}
}
