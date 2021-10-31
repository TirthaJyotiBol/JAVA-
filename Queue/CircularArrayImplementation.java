// Eleminate from front and add from rear

package Queue;
public class CircularArrayImplementation {
	public static void main(String[]args) throws Exception {
		Queue q = new Queue(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.dequeue();
		q.dequeue();

		
		System.out.println("Is Empty : "+q.isEmpty());
		System.out.println("Is Full : "+q.isFull());
		
		
		q.print();
	}
	
	static class Queue{
		int[]a;
		int capacity;
		int front;
		int rear;
		
		Queue(int capacity){
			this.capacity = capacity;
			front = -1;
			rear = -1;
			a = new int[capacity];
		}		
		
		void enqueue(int data)throws Exception {
			
			if(front == (rear+1)%capacity) {
				throw new Exception("Overflow ");
			}
			
			if(front == -1) front = 0;
			rear = (rear+1)%capacity;
			a[rear] = data;	
		}
		
		
		int dequeue() throws Exception {
			if(front == -1) {
				throw new Exception("Underflow");
			}
			int res = a[front];
			// if only 1 element exists in the queue
			if(front == rear) {
				front = -1;
				rear = -1;
			}

			front = (front+1)%capacity;
			
			return res;
		}
		
		
		void print() {
			int i = front;
			while(i!=rear) {
				System.out.print(a[i]+" ");
				i = (i+1)%capacity;
			}
			System.out.println();
		}
		
		
		boolean isEmpty() {
			if(front == -1 ) return true;
			return false;
		}
		
		boolean isFull() {
			if(front == (rear+1)%capacity) {
				return true;
			}
			return false;
		}
		
	}
}
