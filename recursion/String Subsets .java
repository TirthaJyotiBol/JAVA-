/*
Q. Print the powerset -> all the possibilities of a string (Not Consecutive)

Algorithm : 
* If i == s.length()  -> print output
* Once Include the character
* Another time dont include it

*/


package Recursion;
public class subSequence {
	public static void main(String[]args) {
		String s = "abcd";
		printSubsequence(s,0,"");
	}
	
	static void printSubsequence(String s,int i,String output) {
		if(i==s.length()) {
			System.out.print(output+' ');
			return;
		}
		
		printSubsequence(s,i+1,output+s.charAt(i));   //Include character
		printSubsequence(s,i+1,output);				//Dont include character
		
	}
}
