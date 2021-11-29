/*
 Q. Find if there exists brackets that are not necessary
    0 1 2 3 4 5 6
    ( ( a + b ) )
    
    here 0,6 are the brackets that are not necessary
    
    return true  -> redundant
    return false -> not redundant
   
    =>
    
    ALGORITHM :
     1. Traverse the whole String
     2. Ignore Alphabets
     3. If operators or opening bracket then push the elements
     4. If closing bracket then :
         a. Check for the operators
         b. POP elements until corresponding opening bracket is found
         c. If in the stack there exists opening bracket without Operator then its a Redundant
    
  */

package stack;
import java.util.Stack;
public class RedundantParenthesis {
	public static void main(String[]args) {
		String s = "((a+b))";
		boolean ans = isRedundant(s);
		System.out.println(ans);
	}
	
	 static boolean isRedundant(String s) {
		 boolean ans = false;
		 Stack<Character>stk = new Stack<>();
		 
		 for(int i=0;i<s.length();i++) {
			 
			 char curr = s.charAt(i);
			 if(curr=='+' || curr=='-' || curr=='*' || curr=='/' || curr=='(' ) {
				 stk.push(curr);
			 }
			 
			 
			 if(curr==')') {
				 if(stk.peek() == '(') {
					 ans = true;
				 }
				 while(stk.peek()=='+' || stk.peek()=='-' || stk.peek() =='*' || stk.peek() =='/') {
					 stk.pop();		
				 }
				 stk.pop();
			 }
		 }	 
		 return ans;
	 }
}
