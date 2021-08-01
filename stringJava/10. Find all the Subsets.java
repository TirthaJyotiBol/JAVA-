package recursion;

public class stringSubsets {
	
	public static void main(String[]args) {
		String s = "abc";
    
  system.out.println("The all  subsets of the string are : ");
	subSets(s,0," ");                                           //initially we consider the current as a empty string
		
		
		/* 0-> 1st index (a)  
		 * increase the index number one by one 
		 * either include the character or do not
		 * to make a recursive tree;
		 */
		
	}
	
	static void subSets(String s,int i,String current) {
		if(i==s.length()) {
			/*
			 * as soon as all the character are reached we print and return 
			 */
			System.out.println(current);
			return;
		}
		
		 subSets(s,i+1, current+s.charAt(i));    //include the character
		 /*
		  *  Either include the character 
		  *  or do not include it,
		  *  thus for this we use the 2 methods ->   subSets(s,i+1, current+s.charAt(i));   &&    subSets(s,i+1, currents);
		  */
		 subSets(s,i+1,current);               //do not include the character
		
		
	}

}
