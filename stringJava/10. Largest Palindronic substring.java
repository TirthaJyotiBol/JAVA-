package strings;

public class longestPalindromicSubstring {
	
	static int beginIndex;
	static int endIndex;
	
	public static void main(String[]args) {
		
		String s ="abababcb";
		if(s.length()<2) {
			System.out.println(s);
		}
		
		for(int start=0; start<s.length(); start++) {
			
			findSubstring(s,start,start);
			
			findSubstring(s,start,start+1);
		}
		
		System.out.println(s.substring(beginIndex, endIndex+beginIndex));
		
		
	}
  
  
  /*
  The below function is used to find the start and the end index of the palindrone
  */

	static void findSubstring(String s,int begin,int end) {
		
		while((begin>=0 && end<s.length()) && s.charAt(begin) ==s.charAt(end) ){
			begin--;
			end++;
		}
		
		if(endIndex<end-begin-1) {
			endIndex = end-begin-1;
			beginIndex = begin+1;
			
		}
		
}
}
