/* 
In the case of linked list we donot need to decalre size because of Dynamic size
*/

package stack;
public class LinkedListImplementation {
	public static void main(String[]args) {
		stack stk = new stack();
		try {
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		
		stk.pop();
		
		System.out.println("peek : "+stk.peek());
		
		System.out.println("Size : "+stk.size());
		
		System.out.println("Is Empty : "+stk.empty());
		
		stk.print();
		
		}
		catch(Exception e) 
		{
			System.out.print(e);
		}
	}
	
	static class stack{	
		node head;
		int size;
		
		class node{
			node next;
			int data;
			node(int data){
				this.data = data;
			}
		}
		
		 stack() {
			head = null;
			size = 0;
		}
		 
		 void push(int data) {
			 node temp = new node(data);
			 temp.next = head;
			 size++;
			 head = temp;
		 }
		 
		 void pop() throws Exception {
			 if(head == null) {
				 throw new Exception("Underflow Condition");
			 }
			 head = head.next;
			 size--;
		 }
		 
		 int peek()  throws Exception {
			 if(head == null) throw new Exception("Underflow Condition ");
			 return head.data;
		 }
		 
		 int size() {
			 return size;
		 }
		 
		 void print() {
			 node H = head;
			 while(H!=null) {
				 System.out.print(H.data+" ");
				 H = H.next;
			 }
			 System.out.println();
		 }
		 
		 boolean empty() {
			 if(head!=null) return false;
			 return true;
		 }
		
	}

}
