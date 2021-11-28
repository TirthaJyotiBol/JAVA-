/* https://www.youtube.com/watch?v=qC5DGX0CPFA */

package stack;
import java.util.*;

public class LongestvalidSubstring {
	public static void main(String[] args) {
		String s = ")()())()";
		LongestvalidSubstring n = new LongestvalidSubstring();
		int ans = n.valid(s);
		System.out.println(ans);
	}
	
	int valid(String s) {
		int ans = 0;
		
		Stack<Integer>index = new Stack<>();
		Stack<Character> ch = new Stack<>();
		
		index.push(-1);
		
		for(int i=0;i<s.length();i++ ) {
			char c = s.charAt(i);
			
			// If  ')' and size is 0 then only push the index
			if(c==')' && ch.size()==0 ) {
				index.push(i);
			}
			
			// If '(' then push index and braces
			if(c=='(') {
				ch.push(c);
				index.push(i);
			}
			
			// If ')' and size!=0 then pop elements 
			// The length would be [currIndex - faultyOne ] 
			  // { faultyOne-> index.peek}
			if(c==')' && ch.size()!=0 ) {
				if(ch.peek()=='(') {
					index.pop();
					ch.pop();
					ans = Math.max(ans, i-index.peek());
				}
			}	
		}
		return ans;
	}

}
