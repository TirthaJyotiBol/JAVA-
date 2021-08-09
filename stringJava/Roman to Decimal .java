package strings;
import java.util.HashMap;
import java.util.Scanner;
/*
  Put the values at the hashMap with its word in roman
  
 * ALGO->
       if( s[i] > s[i-1] ) {
           res += s[i] - 2 *s[i-1]
       }
       
       else{
           res += s[i] 
       }
       
       
    try catch is used because if we use hashmap then it would give error
    if enyhing other then the key is given
    thus to return invalid we use try catch   
  */



public class RomanToDecimal {
	public static void main(String[]args) {
		HashMap<Character,Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int res=0;
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		try {
			for(int i=0;i<s.length();i++) {
				if( i>0  &&  map.get(s.charAt(i)) > map.get(s.charAt(i-1)) ) {
					res = res+ map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
				}
				else {
					res = res + map.get(s.charAt(i));
				}
			}

			System.out.println(res);
		} 
		
		catch(Exception e) {
			System.out.println("Invalid");
		}
		
	}

}

