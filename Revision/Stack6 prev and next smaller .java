package Revision;
import java.util.*;
public class Stack6_PS_NS_Element {

	public static void main(String[] args) {
		int[]arr = {2,3,1,8,7,6,4};
		prevSmaller(arr);
		nextSmaller(arr);
	}
	
	static void prevSmaller(int[]arr) {
		Stack<Integer>stk = new Stack<>();
		int[]ans = new int[arr.length];
		
		ans[0] = -1;
		stk.push(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			while(stk.size()>0 && stk.peek()>arr[i]) {
				stk.pop();
			}
			if(stk.size() == 0) ans[i] = -1;
			
			if(stk.size()>0 && stk.peek()<arr[i]) {
				ans[i] = stk.peek();
			}
			stk.push(arr[i]);
		}
		
		print(ans);
	}
	
	static void nextSmaller(int[]arr) {
		Stack<Integer>stk = new Stack<>();
		int[]ans = new int[arr.length];
		ans[arr.length - 1] = -1;
		stk.push(arr[arr.length-1]);
		
		for(int i=arr.length-2;i>=0;i--) {
			
			while(stk.size()>0 && stk.peek()>arr[i]) {
				stk.pop();
			}
			
			if(stk.size() == 0) ans[i] = -1;
			
			if(stk.size()>0 && stk.peek() < arr[i] ) {
				ans[i] = stk.peek();
			}
			stk.push(arr[i]);
		}
		
		print(ans);
	}
	
	static void print(int[]arr) {
		for(int x:arr) System.out.print(x+" ");
		System.out.println();
	}

}
