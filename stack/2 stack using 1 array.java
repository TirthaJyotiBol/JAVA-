/*
  Q. Implementation of two stacks in one array [make 2 stacks in 1 array]
     
     1. Divide the array into 2 parts 
          => 1st from 0 			 (top1)
          => 2nd from a.length-1;    (top2)
          
     2. Implement push and pop operations in the current array
     
     3. Underflow conditions -
           top0 < 0
           top1 > a.length - 1;
           
      4. Overflow conditions - 
      		top0 >= (a.length / 2)
      		top1 < (a.length / 2)
  
  */

package stack;
public class Implement_two_stack_1Array {
	public static void main(String[] args) throws Exception{		
		stack s = new stack(20);
		s.push1(1);
		s.push1(2);
		s.push1(3);
		s.push1(4);
		s.push2(10);
		s.push2(20);
		
		s.pop1();
		s.pop1();
		s.pop2();
		
		s.print();
	}
	
	static class stack{
		int[]a;
		int top1;
		int top2;
		int capacity;
		
		stack(int capacity){
			this.capacity = capacity;
			a = new int[capacity];
			top1 = -1;
			top2 = a.length;
		}
		
		// Stack 1
		void push1(int data) throws Exception{
			if(top1 >= (a.length)/2) 
				throw new Exception("Overflow Stack 1");
			
			top1++;
			a[top1] = data;
		}
		
		int pop1() throws Exception {
			if(top1<0) throw new Exception("Underflow stack 1");
			int res = a[top1];
			top1--;
			return res;
		}
		
		// Stack 2
		void push2(int data) throws Exception {
			if(top2<=(a.length/2)) throw new Exception("Overflow");
			top2--;
			a[top2] = data;
		}
		
		int pop2()throws Exception {
			if(top2 >= a.length-1) throw new Exception("Underflow");
			int data = a[top2];
			top2++;
			return data;
		}
		
		
		void print() {
			int i = 0;
			int j = a.length -1;
			
			System.out.print("Stack 1 : ");
			for(i = 0; i <= top1; i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			System.out.print("Stack 2 : ");
			
			for(j = a.length-1 ; j>=top2 ; j--) {
				System.out.print(a[j]+ " ");
			}
			
			System.out.println();
		}
	}

}



