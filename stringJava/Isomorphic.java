/*
consider 2 hashmaps -> 1. checking source to target (one to one)  map1-> char,char
                       2. checking target to source (one to one)  map2->char,boolean
                      
 if map1 contains key then check its value -> if matches then "yes" else "no"
 if map1 doesnot contains key then check if the key is already used ( already used keys are made in map2)

*/

package strings;
import java.util.HashMap;
public class Isomrphic_String {

	public static void main(String[] args) {
		String source = "aaabcd";
		String target = "xxxval";
		System.out.println(isIsomorphic(source,target));
	}
	
	public static boolean isIsomorphic(String source,String target) {
		
		//if the size of both of them doesnot matches return false
		if(source.length()!=target.length()) {
			return false;
		}
		else {
			
		/* map1 is because of checking 1 to 1  => source to destination
		 * map 2 is because of 1 to 1 checking => destination to source */
		HashMap <Character,Character> map1 = new HashMap<>(a);
		HashMap<Character,Boolean> map2 = new HashMap<>();
		boolean isIso=true;
		
		for(int i=0;i<source.length();i++) {
			char c1 = source.charAt(i);
			char c2 = target.charAt(i);
			
			// if map1 contains key and its vaue doesnot match
			// then return false (checking source a-> target)
			if(map1.containsKey(c1)==true) {
				if(map1.get(c1)!=c2) {
					isIso = false;
				}
			}
			// if map1 doesnot contains the key then check this in map2 taking c1's value
			// as c2's key
			else {
				if(map2.containsKey(c2)) {
					isIso=false;
				}
				else {
					map1.put(c1,c2);
					map2.put(c2,true);
				}
				
			}
			
		}
		
		
		return isIso;
	}
	}

}
