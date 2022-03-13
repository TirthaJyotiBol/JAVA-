package Revision;
import java.util.Stack;
public class Stackk16_PostfixNumerical {

	public static void main(String[] args) {
		String s = "32+7*4-";
		String ans = postfix(s);
		System.out.println(ans);
	}
	
	static String postfix(String s) {
		Stack<Character>stk = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);

			
			if(ch !='*' && ch !='+' && ch !='-' && ch !='/' ) {
				stk.push(ch);		// if integers then push
			}
			
			else {
				if(ch == '*') {
					int ans;
					int p = Character.getNumericValue(stk.pop());  
					int q = Character.getNumericValue(stk.pop()); 
					ans = p * q;
					System.out.println(p+" * "+q+" = "+ans);
					stk.push(String.valueOf(ans).charAt(0));
				}
				else if(ch == '/') {
					int ans;
					int p =Character.getNumericValue(stk.pop()); 
					int q = Character.getNumericValue(stk.pop()); 
					ans = q/p;
					System.out.println(q+" / "+p+" = "+ans);
					stk.push(String.valueOf(ans).charAt(0));
				}
				else if(ch == '+') {
					int p = Character.getNumericValue(stk.pop()); 
					int q = Character.getNumericValue(stk.pop()); 
					int ans = p + q;
					System.out.println(p+" + "+q+" = "+ans);
					stk.push(String.valueOf(ans).charAt(0));
				}
				else {
					int p = Character.getNumericValue(stk.pop()); 
					int q = Character.getNumericValue(stk.pop()); 
					int ans = p-q;
					System.out.println(p+" - "+q+" = "+ans);
					stk.push(String.valueOf(ans).charAt(0));
				}
			}
			
		}
		System.out.println("Polo "+stk);
		
		return stk.peek().toString();
	}

}
