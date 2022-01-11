package Backtracking;
public class Max_k_swaps {
	public static void main(String[] args) {
		
		String s = "1234567";
		int k = 2;
		max = s;
		max(s,k);
		System.out.println(max);

	}
	

	
	static String max;
	public static void max(String s, int k) {
		
		if(Integer.parseInt(s) > Integer.parseInt(max) ) {
			max = s;
		}
		
		if(k == 0) {
			return;
		}
		
		for(int i=0; i<s.length()-1;i++) {
			for(int j = i+1 ;j<s.length();j++) {
				if(s.charAt(j) > s.charAt(i) ) {
					
					s = swap(s,i,j);
					max(s,k-1);
					s = swap(s,i,j);
					
				}
			}
		}
		
	}
	
	// function to swap characters in a string
	static String swap(String s, int i, int j) {
		char ith = s.charAt(i);
		char jth = s.charAt(j);
		String left = s.substring(0,i);
		String mid = s.substring(i+1,j);
		String right = s.substring(j+1);
		
		return left+jth+mid+ith+right;
	}

}
