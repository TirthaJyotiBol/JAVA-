package Queue;
public class ArrayImplementation {
	public static void main(String[]args) {
		Queue que = new Queue(5);
		try {
		que.enqueue(5);
		que.enqueue(10);
		que.enqueue(20);
		que.dequeue();
		que.dequeue();
		
		// peek element
		System.out.println("Front : "+que.getFront());
		
		// size of queue
		System.out.println("size : "+que.size());
		
		// if queue is empty
		System.out.println("Is Empty : "+que.isEmpty());
		
		que.print();
		}
		
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	static class Queue{
		int[]a;
		int capacity;
		int front;
		int rear;
		
		Queue(int capacity){
			this.capacity = capacity;
			a = new int[capacity];
			front = 0;
			rear = -1;
		}
		
		void enqueue(int data)throws Exception {
			if(rear == capacity-1) {
				throw new Exception("Overflow ");
			}
			rear++;
			a[rear] = data;
		}
		
		int dequeue() throws Exception{
			if(rear == -1) {
				throw new Exception("Underflow ");
			}
			int ans = a[0];
			for(int i = 0 ;i<rear;i++) {
				a[i] = a[i+1];
			}
			
			rear--;
			return ans;
		}
		
		void print() throws Exception {
			if(rear == -1) {
				throw new Exception("Null List");
			}
			for(int i=0;i<=rear;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		
		int size() {
			return (rear+1);
		}
		
		boolean isEmpty() {
			if(rear == -1) {
				return true;
			}
			return false;
		}
		
		int getFront() throws Exception {
			if(rear == -1) {
				throw new Exception("Empty list");
			}
			return a[0];
		}
	}

}
