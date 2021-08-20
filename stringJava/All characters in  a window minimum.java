/*
 Q. find the length of the minimum window having all the characters
 
 		1. Using HashSet find all the unique characters in the string
 		2. Start acquiring elements into a hashmap until the size of the map and set matches 
 		       							(That means all the unique elements of the strings are acquired)
 		3. As soon as the size is acquired start releasing elements 
 		  								(Because we want minimum size of the window)
 		4. As soon as the size of the map becomes less than the set start acquiring more elements
 		5. if 'i' is acquiring and 'j' is releasing then the minimum would be i-j 
 		6. if its less than min_size then update the min_size
 
 */
package strings;
import java.util.HashSet;
import java.util.HashMap;
public class MinCharactersWindow {
	public static void main(String[]args) {
		String s ="abcbcaacbcccp";
		System.out.println(minSize(s));

	}
	
	public static int minSize(String s) {
		int min = s.length();
		
		// this would get us all the unique elements of the string
		HashSet<Character>set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		HashMap<Character,Integer>map = new HashMap<>();
		int i=0; //acquires
		int j=0; //releases
		
		while(true) {
			// these flags are used to break the loop as soon as we traverse the whole string
			boolean f1= false;
			boolean f2= false;
			
			// acquire until all the unique elements are under the map
			while(i<s.length() && map.size()<set.size()) {
				char c = s.charAt(i);
				map.put(c,map.getOrDefault(c,0)+1);
				i++;
				f1=true;
			}
			
			// start releasing until we find the min length
			while(j<i && map.size()==set.size()) {		
				int currLen = i-j;
				if(currLen<min) {
					min=currLen;
				}
				char c = s.charAt(j);
				if(map.get(c)==1) {    			// if frequency of any character is 1 then remove
					map.remove(c);
				}
				else {
					map.put(c,map.get(c)-1);   // if frequency > 1 then decrement
				}
				j++;
				f2=true;
			}
			
			if(f1==false && f2==false) break;
		}
		
		
		return min;
	}

}
