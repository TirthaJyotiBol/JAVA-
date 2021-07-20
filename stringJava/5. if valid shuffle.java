/*
 * works for distinct string only ; if characters are repeated then it does not work
 * for this we need to use Dynamic programming  
 */

package stringJava;

public class check_If_valid_Shuffle {

	public static void main(String[]args) {
		String s1 = "abcd";
		String s2 ="2233";
		String res ="a2b2c3dd";
		
		boolean is = false;
		if(res.length() == s1.length()+s2.length()) {
			
			int i=0,       //i-> traversing characters of s1
				j=0,      //j-> traversing characters of s2
				k=0;     // k -.traversing characters of res
			while(k <= res.length()) {

				if(i<s1.length() && (s1.charAt(i)==res.charAt(k))  ) {i++; is=true;}
				
				/*
				 * traverse s1 and checks if element of s1 is present at res 
				 */
				
				else if(j<s2.length() && (s2.charAt(j)==res.charAt(k))) {j++; is=true; }
				/*
				 * traverse s1 and checks if element of s2 is present at res 
				 */
				else {
					break;
				}
				
				k++;
			}
			
			if(i<s1.length() || j<s2.length()) {
				/*
				 * after traversing the whole string if any characters are left or not
				 */
				
				System.out.println("not shuffled");
			}
			
			else if(is) {System.out.println("Shuffled");}
			if(!is){System.out.println("Not shuffled");}
			
		}
		else {
			System.out.println("Not shuffled : length not matching");
		}
	
		
   }
	
}
