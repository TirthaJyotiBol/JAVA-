package Revision;
import java.util.*;
public class Stackk17_Infix_to_posifix {

	public static void main(String[] args) {
		String infix = "a*b/c";
		String postfix = convert(infix);
		System.out.println(postfix);
	}
	
	static String convert(String x) {
		Stack<Character>stk = new Stack<>();
		StringBuilder ans = new StringBuilder("");
		String postfix="";
		
		for(int i=0;i<x.length();i++) {
			char c = x.charAt(i);

			if(Character.isAlphabetic(c)) {
				ans.append(c);
				postfix = postfix +c;
			}
			else if(c=='(') {
				stk.push(c);
			}
			else if(c==')') {
				while(stk.peek() != '(') {
					postfix+= stk.peek();
					ans.append(stk.pop());
				}
				stk.pop();
			}
			else {
				while(stk.isEmpty() == false && prec(stk.peek())>=prec(c) && !(stk.peek()=='(') ) {
					System.out.println(125);
					postfix+=stk.peek();
					ans.append(stk.pop());
					stk.push(c);
				}
			}
			
		}

		while(stk.isEmpty() == false) {
			postfix+=stk.peek();
			ans.append(stk.pop());
		}

		System.out.println("Postfix : "+postfix );
		return ans.toString();
	}
	
	static int prec(char c) {
		if(c=='+' || c=='-') return 1;
		if(c=='*' || c=='/') return 2;
		return 0;
	}

}
