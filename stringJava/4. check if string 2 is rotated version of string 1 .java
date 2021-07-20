package stringJava;
public class checkifRotatedofFirst {
	public static void main(String[]args) {
		String str1 ="Tirtha";
		String str2 = "TirthaT";
		String temp = str1+str1;
		
   /* 1. Concatinate the two strings
    * 2. check if the string2 is the substring of string 1
    * if yes then its rotated 
    * else not rotated   
    */		
		
		if(temp.contains(str2) && (str1.length() ==str2.length()) )    // edge case-> size of both the strings should be same
		  {
			System.out.println("Yes its rotated");
		     }
		
		else 
		  {
			System.out.println("Not a rotated one ");
			}
	}

}
