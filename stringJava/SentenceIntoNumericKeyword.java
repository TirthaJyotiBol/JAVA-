
// STORE THE keys at a string array
//substract the ascii value of 'A' with each character to get the desired position
//and print the positon of the array 

package strings;
import java.util.Scanner;

public class SentenceIntoNumericKeyword {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(func(s));
	}
	
	public static String func(String s) {
		String ans="";
		String key[]= 
			{
				"2","22","222",
				"3","33","333",
				"4","44","444",
				"5","55","555",
				"6","66","666",
				"7","77","777","7777",
				"8","88","888",
				"9","99","999","9999"
		};
		
		
		for(int i=0;i<s.length();i++) {
			
			// if we get space then print 0
			if(s.charAt(i)==' ') {
				ans =ans + "0";
			}
			
			// if not space then find the difference between ascii of charAt(i) with 'A' 
			// this will give you the position of the array where to print
			else {
				int position = s.charAt(i) - 'A';
				ans = ans + key[position];
			}
		}
		
		return ans;
	}

}
