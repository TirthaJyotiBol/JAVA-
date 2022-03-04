package Revision;
import java.util.Stack;

public class Stack5_MergeOverlappingIntervals {

	public static void main(String[] args) {
		pair[]arr = new pair[4];
		arr[0] = new pair(1,2);
		arr[1] = new pair(2,4);
		arr[2] = new pair(6,8);
		arr[3] = new pair(9,10);
		
		merge(arr);
	}
	
	static class pair{
		int start;
		int end;
		pair(int start,int end){
			this.start = start;
			this.end = end;
		}
	}
	
	static void merge(pair[]arr) {
		Stack<pair> stk = new Stack<>();
		stk.push(new pair(arr[0].start,arr[0].end));
		
		for(int i=1;i<arr.length;i++)
		{
			    pair second = arr[i];
				pair first = stk.peek();
				if(second.start <= first.end && second.end >= first.end ) {
					stk.pop();
					stk.push(new pair(first.start,second.end));
				}
				else {
					stk.push(second);
					}
			
		}
		
	// print the stack
		while(stk.size()>0) {
			pair ele = stk.pop();
			System.out.println(ele.start +" "+ ele.end);
		}
	}

}
