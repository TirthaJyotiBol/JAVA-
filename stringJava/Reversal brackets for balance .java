package strings;
import java.util.Scanner;
import java.util.Stack;
public class Reversals_for_making_bracketsBalanced {
	public static void main(String[]args) {
		Stack<Character>st = new Stack<>();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		if(s.length() %2!=0) {
			System.out.println("Invalid");
		}
		else {
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='{') {
				st.push(ch);
			}
			else if(st.size()!=0 && ch=='}') {
				char top = st.peek();
				if(top =='{') {
					st.pop();
				}
				else {
					st.pop();
				}
			}
			else {
				st.push(ch);
			}
		}
		
		 
		int new_len = st.size();  
		int n=0;
		while(st.size()!=0 && st.peek()=='{') {
			st.pop();
			n++;
		}
		
		
		
		int result = new_len/2 + n%2 ;
		
		System.out.println(result);
	}
	}

}
