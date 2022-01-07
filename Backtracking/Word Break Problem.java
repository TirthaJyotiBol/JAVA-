/*
  Given a string and a HashSet
  if the string contains substring that are present in the dictionary then form a sentence with that
  
  dic[] = [Microsoft , Hiring , Micro , soft , Hi , ring ]
  string = "MicrosoftHiring"
  
  o/p :
  	Micro soft Hi ring 
	Micro soft Hiring 
	Microsoft Hi ring 
	Microsoft Hiring 
  
  */


package backtracking;
import java.util.*;
public class Word_Break_Problem {

	public static void main(String[] args) {
		
		String str = "MicrosoftHiring";
		HashSet<String> dic = new HashSet<>();
		dic.add("Microsoft");
		dic.add("Hiring");
		dic.add("Micro");
		dic.add("soft");
		dic.add("Hi");
		dic.add("ring");
		
		wbp(str,"",dic);

	}
	
  
	static void wbp(String str,String ans,HashSet<String>dic) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {

			String firstSubstring = str.substring(0, i+1);
			
			if(dic.contains(firstSubstring)) {			
				String secondSubstring = str.substring(i+1);
				wbp(secondSubstring, ans+firstSubstring+" ",dic);
			}
		}
		
	}

}
