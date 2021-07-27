package strings;

public class countAndSay {
	public static void main(String[]args) {
		int n=7;
		System.out.println("The value is : "+countAndSays(n));
		
	}
	
	static String countAndSays(int n) {
		if(n==1) {return "1";}
		if(n==2) {return "11";}
		int count =1;
		String prev = countAndSays(n-1); // previous result would give us the current one 
		String ans ="";
		
		StringBuilder result = new StringBuilder();
		
		for(int i=1;i<prev.length() ;i++) {
			
			if(prev.charAt(i)!=prev.charAt(i-1)) {
				result.append(Integer.toString(count) );
				result.append(prev.charAt(i-1));
				count =1;
			}
			
			else {
				count++;
			}
			
			if(i==prev.length()-1) {
				result.append(Integer.toString(count));
				result.append(prev.charAt(i));
			}

		}
		
		ans = result.toString();

		return ans ;
	}

}
