/*
Find the number of times a string 1 is included in string 2
*/

package tirtha.amcat;
import java.util.*;
public class ContainsSubstring {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String parent = scan.next().toLowerCase();
		String sub = scan.next().toLowerCase();
		int count = 0;
		
		int i = 0;
		int j = i+sub.length();
		while(i<parent.length()-sub.length()+1) {
			if(parent.substring(i,j).equals(sub)) {
				count++;
			}
			i++;
			j++;
		}

		System.out.println(count);
  }
}
