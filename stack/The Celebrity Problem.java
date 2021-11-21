/*
There might exist one row in the matrix whon everyone knows and who known no one
i.e if [
        0 0 1 0 
        0 0 1 0
        0 0 0 0 
        0 0 1 0
        ]
        
      * here only row 2 is having all zeroes : i.e. row 2 knows noone and this might be the celebrity
      * now all rows jave column 2 as 1 : i.e. all the persons know 2.
       thus 2 is the celebrity
*/

package stack;
import java.util.Stack;
public class TheCelebrityProblem {
	public static void main(String[] args) {
		int[][]a = {
				{0 , 0 , 1 , 0 },
				{0 , 0 , 1 , 0 },
				{0 , 0 , 0 , 0 },
				{0 , 0 , 1 , 0 }
		  	};
		boolean ans = isCelebrity(a);
		System.out.println(ans);
	}
	
	static boolean isCelebrity(int a[][]) {
		boolean isFound = false;
		Stack<Integer>stk = new Stack<>();
		for(int i =0 ;i<a.length;i++) {
			stk.push(i);
		}
		
		while(stk.size()>1) {
			int i = stk.pop();
			int j = stk.pop();
			if(a[i][j] == 0) {		// that means i doesn't know j -> j cant be celebrity
				stk.push(i);
			}
			else {
				stk.push(j);		// if a[i][j] == 1 that means i knows j and -> i cant be celebrity 
			}
		}
		
		// now we will get the only row that might be the celebrity
		
		int celebrity_index = stk.peek();
		
		for(int i = 0; i<a.length ; i++) {
			if(a[celebrity_index][i] == 0) {			// this row would be 0
				isFound = true;
			}
			else {
				isFound = false;
			}
		}
		
		if(isFound == true) {
			for(int i = 0; i<a.length ; i++) {
				if(i == celebrity_index) {
					continue;
					}
				if(a[i][celebrity_index] == 1) {			// this column would be 1
					isFound = true;
				}
				else {
					isFound = false;
				}
			}
		}
		
		if(isFound) {
			System.out.println(celebrity_index);
		}
		else {
			System.out.println(-1);
		}
		
		
		return isFound;
	}

}
