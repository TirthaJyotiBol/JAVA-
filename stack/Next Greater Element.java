/*
 Q. Find the next greater Element Using stack   
   
   =>  1. Traverse the array from backward.
       2. Push each element into the stack from backwards.
       3. if ( a[i] < stack.peek())  => ans = a[i];
          if ( stack.size() == 0 )   => ans = -1;  
          if ( a[i] > stack.peek() ) =>  pop() 
*/

package stackAndQueue;
import java.util.Stack;
public class nextGreaterElement {
public static void main(String[]args) {
	int[]a = {2,4,0,6,8,7};
	int[]ans = new int[a.length];
	nextGreaterElement n  = new nextGreaterElement();
	ans = nextGreaterElement.NGE(a);
	
	for(int x:ans) {
		System.out.print(x+" ");
	}
 }

 static int[] NGE(int[]a) {
	int[]ans = new int[a.length];
	Stack<Integer> s = new Stack<>();
	s.push((a.length-1));
	
	// Loop to traverse to traverse the whole array
	for(int i = a.length-1 ; i>=0 ;  i--) {
		
		while(s.size()>0 && s.peek()<=a[i]) {
			s.pop();
		}
		
		if(s.size() == 0) {
			ans[i] = -1;
		}
		
		else {
			ans[i] = s.peek();
		}
		
		s.push(a[i]);	
	}
	
	// Last element should always be -1 
	ans[a.length-1] = -1;
	return ans;
    }
}
