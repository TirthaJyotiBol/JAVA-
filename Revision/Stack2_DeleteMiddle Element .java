package Revision;
import java.util.Stack;
public class Stack2_MiddleElementDeletion {

	public static void main(String[] args) {
		Stack<Integer>stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		delete(stk);
		System.out.println(stk);
	}
	
	static void delete(Stack<Integer>stk) {
		if(stk.size() == 0) return;
		Stack<Integer>aux = new Stack<>();
		
		int mid = stk.size()/2;
		int cnt = 0;
		while(cnt<mid) {
			aux.push(stk.pop());
			cnt++;
		}
		stk.pop();
		
		while(aux.isEmpty() == false) {
			stk.push(aux.pop());
		}
	}

}
