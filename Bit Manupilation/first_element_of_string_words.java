package trial;

public class first_element_of_string_words {
	public static void main(String[]args) {
		String s ="  Hello this is tjbol ";
		String temp ="";
		                    
		
		// get the first position
		
		String first_element ="";   // 1st letter is taken; 
		
		int is=0;
		
			while(s.charAt(is)!=' ') {
				
				is++;
			}
			first_element = Character.toString(s.charAt(is));
		
		
		
		for(int i=0;i<s.length()-1;i++) {	
			if(s.charAt(i)==' ') {
				temp = temp+ s.charAt(i+1); 
			}
		}
		
		
		System.out.print(first_element+temp);
		
	
	}
	

}
