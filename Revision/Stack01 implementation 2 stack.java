package Revision;
public class Stack_implement_2_stack {

	public static void main(String[] args) {
		stackTwo stk = new stackTwo(100);
		stk.push1(1);
		stk.push1(2);
		stk.push1(3);
		stk.pop1();
		stk.print1();

		stk.push2(2);
		stk.push2(4);
		stk.push2(22);
		stk.push2(23);
		stk.push2(24);
		stk.pop2();

		stk.print2();
	}
	
 static class stackTwo{
		int size1;
		int size2;
		int top1;
		int top2;
		int capacity;
		int[]arr;
		
		stackTwo(int capacity){
			arr = new int[capacity];
			this.capacity = capacity;
			size1 = 0;
			size2 = 0;
			top1 = -1;
			top2 = arr.length;
		}
		
		void push1(int x) {
			if(top1<arr.length/2) {
				top1++;
				arr[top1] = x;
				size1++;
			}
			else {
				System.out.println("Overflow Stack");
			}
		}
		
		void push2(int x) {
			if(top2>arr.length/2) {
				top2--;
				arr[top2] = x;
				size2++;
			}else {
				System.out.println("Stack Underflow");
			}
		}
		
		int pop1() {
			int ele;
			if(top1<0) {
				System.out.println("Underflow");
				return -1;
			}
			else {
				ele = arr[top1];
				top1--;
				size1--;
			}
			return ele;
		}
		
		int pop2() {
			int ele;
			if(top2 >= arr.length) {
				System.out.println("Underflow");
				return -1;
			}else {
				ele = arr[top2];
				top2++;
				size2--;
			}
			return ele;
		}
		
		void print1() {
			for(int i=0;i<size1;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		void print2() {
			int cnt = size2;
			int i = arr.length-1;
			while(cnt>0) {
				System.out.print(arr[i]+" ");
				i--;
				cnt--;
			}
		}
		
	}

}
