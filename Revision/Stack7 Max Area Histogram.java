package Revision;
import java.util.*;
public class Stack7_PS_NS_index {

	public static void main(String[] args) {
		int[]arr = {4,2,1,5,6,3,2,4,2};
		
		int[]prev = prevSmaller(arr);
		int[]next = nextSmaller(arr);
		
		print(prev);
		print(next);
		
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			int curr_area = (next[i] - prev[i] - 1)*arr[i];
			max = Math.max(max,curr_area);
		}
		System.out.println(max);
	}
	
	static class pair{
		int index;
		int value;

		pair(int index,int value){
			this.value = value;
			this.index = index;
		}
	}
	
	static int[] prevSmaller(int[]arr) {
		Stack<pair> stk = new Stack<>();
		int[]ans = new int[arr.length];
		ans[0] = -1;
		stk.push(new pair(0,arr[0]));
		
		for(int i=1;i<arr.length;i++) {
			while(stk.size()>0  &&  stk.peek().value >= arr[i]) {
				stk.pop();
			}
			
			if(stk.size() <= 0) ans[i] = -1;
			if(stk.size()>0 && stk.peek().value < arr[i] ) {
				ans[i] = stk.peek().index;
			}
			stk.push(new pair(i,arr[i]));
		}

		return ans;
	}
	
	static int[] nextSmaller(int[]arr) {
		Stack<pair> stk = new Stack<>();
		int[]ans = new int[arr.length];
		ans[arr.length-1] = arr.length;
		stk.push(new pair(arr.length-1,arr[arr.length-1]));
		
		for(int i=arr.length-2;i>=0;i--) {
			while(stk.size()>0 && stk.peek().value>=arr[i]) {
				stk.pop();
			}
			if(stk.size() == 0) ans[i] = arr.length;
			
			if(stk.size()>0 && arr[i] >= stk.peek().value ) {
				ans[i] = stk.peek().index;
			}
			stk.push(new pair(i,arr[i]));
		}
		
		return ans;
	}
	
	static void print(int[]arr) {
		for(int x:arr) System.out.print(x+" ");
		System.out.println();
	}

}
