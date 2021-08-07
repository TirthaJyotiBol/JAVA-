package trial;

public class kmpAlgo {

	public static void main(String[]args) {
		String text ="aaaaaaaaab";
		String pat = "aab";
		boolean isMatched = false;   // check is made to see if element is not found

		/*this code is used to find the hash code of the pattern
		 * formulae -> pattern sum = (pattern sum)*256 + each Character
		*/
		
		int pat_sum=0;
		for(int i=0;i<pat.length();i++) {
			pat_sum = (pat.charAt(i) + 256*pat_sum) ;
		}
		
		
		int i=0;
		int j=i+pat.length();
		int p=0;                       //p is used for travesing the text string
		
		
		// while traversing the whole text if it finds that the hashcode
		//summation equals to the pattern sum then return the 
		// 1st index
		while(p<=text.length()-pat.length()) {
			if( hashCode(text,i,j) ==pat_sum)
			{
				System.out.println(i);
				isMatched =true;
			}
			
			p++;
			i++;
			j++;
		}
		
		if(!isMatched) {
			System.out.println("Not found");
		}
	
	}
	
	
	//the function below is used for the making of hashCode while traversing through the text
	// formulae is same for the pattern hash
	public static int hashCode(String s,int i,int j) {
		int text_pat_sum=0;
		for(int p=i;p<j;p++) {
			text_pat_sum= (s.charAt(p) + 256*text_pat_sum) ;
		}
		
		return text_pat_sum;
	}
}
