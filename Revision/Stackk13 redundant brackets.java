// Assume that the string is valid

package Revision;
import java.util.Stack;
public class Stack13_redundant_brackets {

	public static void main(String[] args) {
		String x = "(a+b)";
		boolean ans = red(x);
		System.out.println(ans);
	}
	
	static boolean red(String s) {

		Stack<Character>stk = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='(' || c=='+' || c=='*' || c=='-' || c=='/' ) {
				stk.push(c);
			}
			
		    if(c==')')
			{
				char top = stk.peek();
				if(top == '(') {
					return true;
				}
				
				if( top =='+' || top =='*' || top =='-' || top =='/' ) {
					stk.pop();
				}
				stk.pop(); //
			}
		}	
		
		return false;
	}

}
