package Revision;
import java.util.Stack;
public class Stack3_ValidParenthesis {

	public static void main(String[] args) {
		String s = "{{][}}";
		boolean ans = isValid(s);
		System.out.println(ans);
	}
	
    static boolean isValid(String x)
    {
        Stack<Character>stk = new Stack<>();
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c=='{' || c=='(' || c=='['){
                stk.push(c);
            }
            
            else{
                if(stk.isEmpty()) return false;				// if we have elements left in string but stack is empty
                else{
                    char top = stk.peek();
                    if(top=='(' && c==')' ) stk.pop();
                    else if(top=='{' && c=='}' ) stk.pop();
                    else if(top=='[' && c==']' ) stk.pop();
                    else return false;
                }
            }
        }
        
       if(stk.size() == 0) return true;
       return false;
    }

}
