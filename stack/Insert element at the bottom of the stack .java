/*
 Q. You are given a stack : Insert an element at the end of the stack
 
 algo : 1. Take a temporary stack
 		2. Empty the original stack and put all the elements in the temp
 		3. Insert the element in the original stack
 		4. Insert all the elements from the temp stack
  */

package stack;
import java.util.*;
public class InsertAtTheEnd {
	public static void main(String[]args) {
		Stack<Integer>stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the new Element to be inserted");
		int ele = scan.nextInt();
		
		
		Stack<Integer> temp = new Stack<>();    // Temp stack to put all the elements
		while(stk.size()>0) {
			temp.push(stk.pop());
		}
		
		stk.push(ele);							// push the new element
		
		while(temp.size()>0) {					// again put all those elements back
			stk.push(temp.pop());
		}
		
		
		
		System.out.println(stk);
	}
}
