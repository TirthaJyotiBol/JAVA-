// Linked list implementation of Queue
package Queue;
public class LinkedListImplementation {
	public static void main(String[]args) {
		Queue que = new Queue();
		
		try {
			que.enque(25);
			que.enque(23);
			que.enque(22);
			que.enque(21);
			
			que.dequeue();
			
			System.out.println("size : "+ que.size());
			
			System.out.println("Is Empty : "+ que.isEmpty());
		    que.print();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static class Queue{
		node front=null;
		node rear=null;
		
		class node{
			int data;
			node next;
			node(int data){
				this.data = data;
			}
		}
			
		void enque(int data) {
			node newNode = new node(data);
			if(front == null) 
			{
			 front = rear = newNode;
			}	
			rear.next = newNode;
			rear = newNode;
		}
		
		
		int dequeue() throws Exception {
			if(front == null) {
				throw new Exception("Underflow");
			}
			if(front == rear) {
				front = null;
			}
			int res = front.data;
			front = front.next;
			return res;
		}
		
		
		void print() throws Exception {
			System.out.print("Elements : ");
			if(front == null || rear == null) {
				throw new Exception("Underflow");
			}
			if(front == rear) {
				System.out.println(front.data);
			}
			
			if(front != rear) {
			while(front!=null) {
				System.out.print(front.data+" ");
				front = front.next;
			}
			
			System.out.println();
		}
      }
		
		int size() {
			if(front == rear && front!=null) {
				return 1;
			}
			int size = 0;
			node temp = front;
			while(temp!=null) {
				size++;
				temp = temp.next;
			}
			return size;
		}
		
		boolean isEmpty() {
			if(front == null) return true;
			
			return false;
		}
				
		
	}
}
