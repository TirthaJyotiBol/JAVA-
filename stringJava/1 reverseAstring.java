package stringJava;

public class reverseAstring {
	public static void main(String[]args) {

		String name ="Tirtha";
		
		int i=0;
		int j=name.length();
		
		String rev =" ";
		for(int p=j-1;p>=i;p--) {
		    rev += name.charAt(p);	
		}
		System.out.println(rev);
		
					
}
	
	
}
