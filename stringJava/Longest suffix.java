// take s[0] and compare this with others
// if s[0].charAt(p) == s[i].charAt(q) -> count++
// p and q are taken because if we take same then because of different length it will give index out of bound
// print a substring of s[0] from 0-> count




package trial;

public class LongestPrefix {
	public static void main(String[]args) {
		String s[]= {"geeksforgeeks","geeksforges","geekfs","gteekgzer"};
		String ans = Longest(s);
		System.out.println(ans);
		
	}
	
	public static String Longest(String s[]) { 
		int mi =Integer.MAX_VALUE;
		
		if(s.length==0) {  
			return "";
		}
		String c = s[0];
		
		for(int i=1;i<s.length;i++) {
			int j=0;
			int k=0;
			int a=0;
			while(j<c.length() && k<s[i].length() )
			{
				if(c.charAt(j)==s[i].charAt(k)) a++;
				j++;
				k++;
			}
			mi = min(mi,a);
		}
		
		
	return c.substring(0,mi);
	} 
	
	
	
	
	public static int min(int a,int b) {
		if(a>b) {
			return b;
		}
		else
			return a;
	}
	
}
