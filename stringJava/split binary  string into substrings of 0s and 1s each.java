package strings;
public class split_binaryString_into_twoSubStrings {
	public static void main(String[]args) {
		String s= "0100110101";
		int c0 =0;
		int c1=0;
		int count =0;
		for(int i=0;i<s.length();i++) {
			
			
			if(s.charAt(i)=='0') {
				c0++;
			}
			
			if(s.charAt(i)=='1') {
				c1++;
			}
			
			if(c0==c1) {
				count++;
			}
			
			/*
			 * since count is used inside for loop that 
			 * means for each word we are checking the 
			 * count of 0s and 1s are equal or not
			 */
			
		}
		
		System.out.println(count);
		
		if(count==0) {
			/*
			 * if there is no element present that is equal then this  
			 */
			
			System.out.println("There is no substring like that is present ");
		}
		
		
		
	}

}
