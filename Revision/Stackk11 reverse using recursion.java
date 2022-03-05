package Revision;
import java.util.Stack;
public class Stackk11_reverse {

	public static void main(String[] args) {
		Stack<Integer>stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		System.out.println(stk);
		reverse(stk);
		System.out.println(stk);
	}
	
	static void reverse(Stack<Integer>stk) {
		if(stk.size()>0) {
			int temp = stk.pop();
			reverse(stk);
			insert_at_buttom(stk,temp);
		}
	}
	
	static void insert_at_buttom(Stack<Integer>stk,int x) {
		if(stk.size() == 0) {
			stk.push(x);
		}	
		else {
		int t = stk.pop();
		insert_at_buttom(stk,x);
		stk.push(t);
		}
	}

}
