package stack_and_queue;
import java.util.*;
public class CheckParenthesis {

	public static void main(String[] args) {
		String s = "{}{}(({{}}))";
		System.out.println(isValid(s));

	}
	static int isValid(String A) {
        Stack<Character>s = new Stack<>();

        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            if(c=='(' || c=='{' || c=='[' ){
                s.push(c);
            }

            // if we have closing brackets 
            else
            {
            	// if closing bracket is found but no open bracket for that : return 0
                if(s.size() == 0) return 0;
                
                /* if corresponding closing bracket is found
                   for its open bracket then pop elements
                   
                   else -> no corresponding element found => return 0 (false)
                  */
                if(c==')')
                {
                    if(s.size()>0 && s.peek()=='('){
                        s.pop();
                    }
                    else  return 0;
                    
                }

                else if(c=='}')
                {
                    if(s.size()>0 && s.peek()=='{'){
                        s.pop();
                    }
                    else return 0;
                }

                 else if(c==']')
                  {
                    if(s.size()>0 && s.peek()=='['){
                        s.pop();
                    }
                    else return 0;
                }
                
                
            }
            
        }

        if(s.size()>0) return 0;
        return 1;
    }

}
