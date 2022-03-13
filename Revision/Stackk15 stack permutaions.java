// check if push and pop are in correct order

package Revision;
import java.util.Stack;
public class Stackk15_stackPermutations {

	public static void main(String[] args) {
		int[]push = {1,2,3};
		int[]pop = {2,3,1};
		boolean isPermut = per(push,pop);
		System.out.println(isPermut);
	}
	
	static boolean per(int[]a,int[]b) {
		if(a.length!=b.length) return false;
		
		Stack<Integer>stk = new Stack<>();
		int i = 0;
		int j = 0;
		while(i<a.length && j<b.length) {
			stk.push(a[i]);
			while(stk.size()>0 && b[j]==stk.peek() && j<b.length ) {
				stk.pop();
				j++;
			}
			i++;
		}
		
		while(j<b.length) {
			if(stk.size()>0 && stk.peek() == b[j]) {
				stk.pop();
			}
			else return false;
			
			j++;
		}
		
		if(stk.isEmpty()) return true;
		return false;
	}

}
