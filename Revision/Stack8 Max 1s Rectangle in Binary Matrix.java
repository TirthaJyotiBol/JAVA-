package Revision;

import java.util.Stack;
public class Stack8_Max_1s_BinaryMatrix {

	public static void main(String[] args) {
		int[][] mat = {
				{0,1,1,1,1,0},
				{1,1,1,1,0,1},
				{1,1,0,1,1,1},
				{1,1,1,1,1,0}
		};
		
		int[]currRow = mat[0];
		int max = maxArea(currRow);
		
		for(int i=1;i<mat.length;i++) {
			for(int j=0;j<currRow.length;j++) {
				
				if(mat[i][j] == 0) {
					currRow[j] = 0;
				}
				else {
					currRow[j] += 1;
				}
			}
			
			int currMax = maxArea(currRow);
			max = Math.max(max, currMax);
		}
	
		System.out.println(max);
	}
	
	
	static int maxArea(int[]arr) {
		int[] prev = prevSmaller(arr);
		int[] next = nextSmaller(arr);
		
		int maxArea = 0;
		for(int i=0;i<arr.length;i++) {
			int area = (next[i] - prev[i] - 1) * arr[i];
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
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
}
