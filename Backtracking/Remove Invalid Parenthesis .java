package backtracking;

import java.util.HashSet;
import java.util.Stack;

public class invalid_parenthesis {

	public static void main(String[] args) {
		String s = "()())()";
		HashSet<String>set = new HashSet<String>();
		int minRemoval = getMinRemoval(s);
		solution(s, set, minRemoval);
		
		System.out.println(set);
	}

	
	public static void solution(String s,HashSet<String>set,int minRem) {
		
		if(minRem == 0) {
			int currMinRem = getMinRemoval(s);
			
			if(currMinRem == 0) {
				if(!set.contains(s)) {
					set.add(s);
				}
			}
			return;
		}
		

// removes one parenthesis from each iteration
		for(int i=0;i<s.length();i++) {
			String left = s.substring(0,i);
			String right = s.substring(i+1);
			solution(left+right,set,minRem-1);
		}
	}
	
	
	
// function that gives the minimum number of invalid parenthesis in the string	
	public static int getMinRemoval(String s) {
		Stack<Character> stk = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				stk.push(ch);
			}
			
			else if(ch==')')
			{
				if(stk.size() == 0) {
					stk.push(ch);
				}
				else if(stk.peek() == ')') {
					stk.push(ch);
				}
				
				else if(stk.peek() == '(') {
					stk.pop();
				}
			}
		}
		
		return stk.size();
	}
	
	
}
