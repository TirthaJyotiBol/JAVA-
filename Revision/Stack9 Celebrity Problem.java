package Revision;

import java.util.Stack;

public class Stack9_Celebrity {

	public static void main(String[] args) {
		int M[][] = {{0 ,1, 0},
		             {0, 0 ,0}, 
		             {0 ,1, 0}};
		int ans = celebrity(M);
		System.out.println(ans);
	}
	
	static int celebrity(int[][]arr) {
		Stack<Integer>stk = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			stk.push(i);
		}
		
		while(stk.size()>1) {
			int i = stk.pop();
			int j = stk.pop();
			if(arr[i][j] == 0) {
				stk.push(i);
			}
			else {
				stk.push(j);
			}
		}
		
		// confirmation
		// if this row knows any other then it could not be a celebrity : return -1
		int possible_row = stk.peek();
		for(int i=0;i<arr[0].length;i++) {
			if(arr[possible_row][i] == 1) return -1;
		}
		
		// if any other column doesnot knows this row then it cannot be a celebrity : return -1
		for(int i=0;i<arr.length;i++) {
			if(i == possible_row) continue;
			if(arr[i][possible_row] == 0) return -1;
		}
		
		return possible_row;
	}

}
