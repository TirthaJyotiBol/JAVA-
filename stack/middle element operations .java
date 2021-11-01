/*
  
  Q. Use push , pop operations in the middle of a stack at O(1) operation
  	
  	1. Use fast and slow pointer to find the middle element
  	2. Again traverse upto mid.next to find the previous element
  	3. push() => 
  	     prevMid.next = newNode
  	     newNode.next = mid;
  	4. pop() =>
  	      prevMid.next = mid.next;  
  
  */

package stack;
public class OperationsInMiddle {
	public static void main(String[]args) throws Exception {
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.pushMiddle(20);
		s.pushMiddle(25);
		s.pushMiddle(68);
		s.popMiddle();
		s.popMiddle();

		s.print();

	}
	
	static class stack{		
		node top;		
		class node{
			node next;
			int data;
			node(int data){
				this.data = data;
			}	
		}
		
		stack(){
			top = null;
		}
		
		void push(int data) {
			node temp = new node(data);
			temp.next = top;
			top = temp;
		}
		
		int pop() throws Exception {
			if(top == null) throw new Exception("Underflow");
			int data = top.data;
			top = top.next;
			return data;
		}
		
		void pushMiddle(int data) {

			node fast = top;
			node slow = top;
			while(fast.next != null && fast!=null && fast.next.next !=null)  {
				fast = fast.next.next;
				slow = slow.next;
			}
			
			node mid = slow;
			node midPrev = top;
			while(midPrev.next!=mid) {
				midPrev = midPrev.next;
			}
			
			node temp = new node(data);
			midPrev.next = temp;
			temp.next = mid;
		}
		
		
		int popMiddle() throws Exception {
			if(top == null) throw new Exception("Underflow");
			
			node fast = top;
			node slow = top;
			while(fast.next != null && fast!=null && fast.next.next!=null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			
			node mid = slow;
			node midPrev = top;
			while(midPrev.next!=mid) {
				midPrev = midPrev.next;
			}
			
			int data = mid.data;
			midPrev.next = mid.next;
			
			return data;
		}
		
		void print() {
			node temp = top;
			while(temp!=null) {
				System.out.print(temp.data+"  ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
