// traverse the string and put each 
// character count at a array of size equals to 256(ASCII)
//similarly traverse string 2 and decrement each count  if value matches at the array
// if all the characters of the array comes to be 0 then its a ANaGRAM


package strings;
import java.util.*;
public class String_Anagram {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(Anagram(s1,s2))
		System.out.println("Yes its a anagram");
		else
			System.out.println("Not a anagram");
	}
	
	
	
	public static boolean Anagram(String s1, String s2) {
		boolean isAna = false;
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int []a = new int[256];  // an array is made of the count of all ASCII values
		
		for(int i=0;i<s1.length();i++) {
			a[(int)s1.charAt(i)]++;
			// traverse string 1 and
			// put incerase count in the index equals to  ASCII
		}
		
		
		for(int i=0;i<s1.length();i++) {
				a[(int)s2.charAt(i)]--;
				// similarly for string 2 if element is there then decrease
				// the count on that  position of the array
			
		}
		
		
		
		for(int i=0;i<256;i++) {
			// if  all the elements in the aray is 0 
			// then it should be anagram
			// else not an anagram
			if(a[i]!=0) {
				isAna =false;
				break;
			}
			else {
				isAna = true;
			}
		}
		
		
		
		if(isAna==true)
			return true;
		else
			return false;

	}

}
