package Revision;

import java.util.Stack;

public class Stackk10_Insert_at_end_rec {

	public static void main(String[] args) {
		Stack<Integer>stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		int x = 10;
		insert(stk,x);
		System.out.println(stk);
		

	}
	
	static void insert(Stack<Integer>stk,int x) {
		if(stk.size() == 0) {
			stk.push(x);
		}	
		else {
		int t = stk.pop();
		insert(stk,x);
		stk.push(t);
		}
	}

}
