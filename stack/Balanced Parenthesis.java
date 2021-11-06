package stack;
import java.util.Scanner;
public class paranthesis {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scan.next();
		
		paranthesis p = new paranthesis();
		boolean isBalanced = p.isBalaced(s);
		if(isBalanced == true) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}
	
    boolean isBalaced(String s) {
    			// Empty string is always unbalanced
    	boolean isBal = false;
    	if(s.length() == 0) return false;
    	
    	stack stk = new stack();
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		if(c=='(' || c=='{' || c=='[' ) {
    			stk.push(c);
    		}
    		
    		if(c==')') {
    			char top = stk.top();
    			if(stk.top !=null) {
    				if(top == '(') {
    				stk.pop();
    				}
    				else {
    					return false;
    				}
    			}
    			else return false;
    		}  	
    		
    		if(c=='}') {
    			char top = stk.top();
    			if(stk.top !=null) {
    				if(top == '{') {
    				stk.pop();
    				}
    				else {
    					return false;
    				}
    			}
    			else return false;
    		} 
    		
    		if(c==']') {
    			char top = stk.top();
    			if(stk.top !=null) {
    				if(top == '[') {
    				stk.pop();
    				}
    				else {
    					return false;
    				}
    			}
    			else return false;
    		} 
    		
    	}
    	
    	if(stk.empty() == true) return true;
    	
    	return false;
    }
	
	static class stack{
		class node{
			node next;
			char data;
			node(char data) {this.data = data;}
		}	
		
		node top = null;
		
		void push(char data) {
			node temp = new node(data);
			temp.next = top;
			top = temp;
		}
		
		void pop() {
			if (top == null) System.out.println("Underflow");
			top = top.next;
		}
		
		char top() {
			if(top == null) return 's';
			return top.data;
		}
		
		boolean empty() {
			if(top == null) return true;
			return false;
		}
		
	}
}
