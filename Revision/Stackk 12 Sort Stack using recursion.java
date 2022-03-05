package Revision;
import java.util.Stack;
public class Stackk12_sort {

	public static void main(String[] args) {
		Stack<Integer>stk = new Stack<>();
		stk.push(1);
		stk.push(15);
		stk.push(21);
		stk.push(19);
		sort(stk);
		System.out.println(stk);
	}
	
	static void sort(Stack<Integer>stk) {
		if(stk.size()>0) {
			int temp = stk.pop();
			sort(stk);
			sortInsert(stk,temp);
		}
	}
	
	// insert at correct position
	static void sortInsert(Stack<Integer>stk,int x) {
		if(stk.isEmpty() || stk.peek()<x ) {
			stk.push(x);
		}
		else {
			int temp = stk.pop();
			sortInsert(stk,x);
			stk.push(temp);
		}
	}

}
