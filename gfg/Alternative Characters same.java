/*

if alternative characters of a string are same then print YES
 else Print NO

*/

package tirtha.amcat;
import java.util.Scanner;
public class Mike_and_ticket {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();		//test cases
		
		while(tc>0) {
			boolean isTrue = false;
			String ticketCode = scan.next().toLowerCase();     // toLowerCase -> because only alphabet needs to be matched
			for(int i=0;i<ticketCode.length()-2;i++) {
				char c = ticketCode.charAt(i);
				char c2 = ticketCode.charAt(i+2);
				if(c == c2) {
					isTrue = true;
					break;
				}
			}
			if(isTrue) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			tc--;
		}
		
	} 
}
