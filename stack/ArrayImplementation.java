package stack;
import java.util.Scanner;
public class ArrayImplementation {
	
	// driver code
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of your stack : ");
		int size = scan.nextInt();
		stack stk = new stack(size);
		try {
	// push
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(3);
		
	//pop
		stk.pop();
		stk.pop();
		
		stk.push(25);

	// size
		System.out.println("Size : "+stk.size());
		
		
	// is empty
		System.out.println(stk.isEmpty());
		
	// peek
		System.out.println("Peek : "+stk.peek());
		
	// search
		System.out.println("Index : "+stk.search(2));
		
   // print
		stk.print();
		
	}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static class stack {
		int a[];
		int capacity;
		int top;
		
		// Declare a stack
		stack(int capacity){
			this.capacity = capacity;
			a = new int[capacity];
			top = -1;
		}
		
		// 1.PUSH
		void push(int element) throws Exception {
			if(top == capacity-1) {
				throw new Exception("Stack Overflow");
			}
			top++;
			a[top] = element;
		}
		
		
		// 2. POP
		int pop() throws Exception {
			if(top == -1) {
				throw new Exception("Underflow Condition");
			}
			int res = a[top];
			top--;
			return res;
			
		}
		
		// 3. PEEK
		int peek() throws Exception {
			if(top == -1) {
				throw new Exception("Underflow Condition");
			}
			return a[top];
		}
		
		
		// 4. is empty	
		boolean isEmpty() {
			if(top !=-1) {
				return false;
			}
			return true;
		}
		
		
		// 5. size
		int size() {
			return top+1;
		}
		
		
		// 6. print
		void print() throws Exception {
			if(top == -1) {
				throw new Exception("Underflow Stack ");
			}
			for(int i=0;i<=top;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		// 7. search
		int search(int element) {
			for(int i=0;i<top;i++) {
				if(a[i] == element) {
					return i;
				}
			}
			return -1;
		}
		
		
	}
}
