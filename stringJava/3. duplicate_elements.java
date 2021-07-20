package stringJava;

import java.util.*;

public class duplicateElements {
	public static void main(String[]args) {
		String s="Tirtha jyoti bol ";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		/*key -> character ; value -> Integer */
		
  		for(int i=0;i<s.length();i++) {                           //put all the elements into the HashMap
			if(!hm.containsKey(s.charAt(i)))
			{
				/*
				 * if the map does not contains the character then put it into the map with value 1
				 * */
				hm.put(s.charAt(i), 1);
			}
			else {
				/* 
				 * if we didn't have the element then put the next element 
				 * with value = oldvalue + 1 
				 * */
				
				int oldValue = hm.get(s.charAt(i));
				hm.put(s.charAt(i), oldValue+1);	
			}
			
		}  		
  		for(Map.Entry mapElement : hm.entrySet() )
      {
  			char key = (char)mapElement.getKey();
  			int value = (int)mapElement.getValue();
  			
  			if(value>1) {
  				System.out.println(key+"  ");
  			}
  			
  		}
  }		
}


