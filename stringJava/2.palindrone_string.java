package stringJava;

public class palindrone_string {
	public static void main(String[]args) {
		String s = "kadak";
		String rev ="";
/* Method 1 */
		
		for(int i=s.length()-1;i>=0;i--)  {  rev+=s.charAt(i);  }
		
		if(rev.equals(s)) {System.out.println("Its Plaindrone");}
		else {System.out.println("Not a Plaindrone");}
		
		
		
/* Method 2*/
		
		
		boolean isPalindrone =true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				isPalindrone =false;
			}
		}
		
		if(isPalindrone) {
			System.out.println("Yes its palindrone");
		}
		else {System.out.println("No its not");}
		
		
		
		
	}

}
