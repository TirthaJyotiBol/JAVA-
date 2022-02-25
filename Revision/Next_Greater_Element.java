/* use stack */

package Revision;
import java.util.*;
public class Next_Greater_Element {

	public static void main(String[] args) {
		int[]a = {6,8,0,1,3};
		int ans[] = new int[a.length];
		
		ans = NGE(a);
		
		for(int x:ans) { System.out.print(x+" "); }

	}
	
	static int[] NGE(int[]a) {
		int[]ans = new int[a.length];
		Stack<Integer> s = new Stack<Integer>();
		
		ans[ans.length - 1] = -1;
		
		int i = ans.length-1;
		s.push(a[i]);
		
		while(i>=0) {
			
			if(s.peek() > a[i] ) {
				ans[i] = s.peek();
			}
			
			while(s.peek() < a[i] ) {
				s.pop();
				if(s.size() == 0) {
					ans[i] = -1;
					break;
				}
			}
			
			s.push(a[i]);
			
			i--;
		}
		
		return ans;
	}

}
