package stack_and_queue;
import java.util.*;
public class EvaluateExpressions {

	public static void main(String[] args) {
		ArrayList<String>s = new ArrayList<>();
		s.add("2");
		s.add("1");
		s.add("+");
		s.add("3");
		s.add("*");
		System.out.println(s);
		EvaluateExpressions e = new EvaluateExpressions();
		System.out.println(e.evaluate(s));
		
	}
	
	 int evaluate(ArrayList<String>s) {
		Stack<Integer>stk = new Stack<>();
		int first;
		int second;	
		
		for(String x:s) {
			
			if(equals(x,"+")) {
				first = stk.pop();
				second = stk.pop();
				stk.push(first + second);
			}
			else if(equals(x,"-")) {
				first = stk.pop();
				second = stk.pop();
				stk.push(first - second);
			}
			else if(equals(x,"*")) {
				first = stk.pop();
				second = stk.pop();
				stk.push(first * second);
			}
			else if(equals(x,"/")) {
				first = stk.pop();
				second = stk.pop();
				stk.push(first / second);
			}
			else {
				stk.push(Integer.parseInt(x));
			}
				
		}
		
		return stk.pop();
	}
	
	boolean equals(String s1,String s2) {
		return s1.equalsIgnoreCase(s2);
	}

}
