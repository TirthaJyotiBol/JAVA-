package stack;
import java.util.*;
public class ReverseString {
  
	public static void main(String[]args) throws Exception {
		System.out.println("Enter a String : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String ans = reverse(s);
		System.out.println(ans);
	}
	
	static String reverse(String s) throws Exception {
		StringBuffer res = new StringBuffer();
		Stack<Character>stk = new Stack<>();
		for(int i=0;i<s.length();i++) {
			stk.push(s.charAt(i));
		}
		
		while(stk.isEmpty() == false) {
			char top = stk.peek();
			res.append(top);
			stk.pop();
		}
		
		return res.toString();
	}
}
