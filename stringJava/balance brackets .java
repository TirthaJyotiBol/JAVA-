package strings;
import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {
	public static void main(String[]args) {
	Stack<Character>stack = new Stack<>();
	Scanner scan = new Scanner(System.in);
	String bra= scan.next();
	boolean isBalanced = false;
	
	for(int i=0;i<bra.length();i++) {
		if(bra.charAt(i)=='(' || bra.charAt(i)=='{' || bra.charAt(i)=='[') {
			//if open parenthesis 
			//then push into stack
			stack.push(bra.charAt(i));
		}
		
		
		/*
		 * if its a closing bracket then
		 * check for the top most element 
		 * and if top == (opposite of charAt(i))  then pop the element 
		 * if not then its not balanced
		 * */
		
		if((bra.charAt(i) ==')' || bra.charAt(i) =='}' || bra.charAt(i) ==']') && stack.size()==0  ) {
			//if opposite parenthesis comes and stack is empty then print no
			isBalanced =false;
			break;
		}
		
		//if opposite found and peek element equals to opposite
		// while stack is nonempty then its balanced
		
		 if(bra.charAt(i)==')') {
			char top = stack.peek();
			if(top=='(' ) {
				isBalanced=true;
			}
			stack.pop();
		}
		if(bra.charAt(i)=='}') {
			char top = stack.peek();
			if(top=='{' ) {
				isBalanced=true;
			}
			stack.pop();

		}
		if(bra.charAt(i)==']') {
			char top = stack.peek();
			if(top=='[' ) {
				isBalanced=true;
			}
			stack.pop();

		}

	}
	
	if(isBalanced==true && stack.empty()==true) {
		System.out.println("Yes");
	}
	if(isBalanced==false || stack.empty()==false) {
		System.out.println("No");
	}


}
}
