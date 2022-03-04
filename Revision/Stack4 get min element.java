package Revision;

import java.util.Stack;

public class Stack4_getMin {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(1);
		stk.push(-61);
		stk.push(5);
		stk.push(7);
		stk.push(18);
		stk.push(17);
		
		int min = getMin(stk);
		System.out.println(min);
		System.out.println(stk);
	}
	
	static int getMin(Stack<Integer>stk) {
		int min = Integer.MAX_VALUE;
		Stack<Integer> temp = new Stack<>();
		while(stk.isEmpty() == false) {
			if(min > stk.peek()) {
				min = stk.peek();
			}
			temp.push(stk.pop());
		}
		
		while(temp.isEmpty() == false) {
			stk.push(temp.pop());
		}
		
		return min;
	}

}
