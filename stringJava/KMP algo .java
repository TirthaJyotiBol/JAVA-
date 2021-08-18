//Pattern matching algorithm 
/*firstly create a table of the prefix (integers to travel if value found)
 * 	TABLE CREATION -
 *  		1. take two pointers i and index
 *  		2. if  charAt(i) == charAt(index) then  i++ & index++
 *  		3.if it doesnot match then move index to the previous index number from the table
 *  				if index ==0 then put 0
 *  
 *  
 *  	KMP algo 
 *       		1. Take 2 pointers i & j
 *       		2. if charAt(i)==charAt(j) then i++, j++
 *       		3. else move the charAt(j) to the the previous index and check if characters are equal
 *       		4. if j== 0 then  only i++;
 *       		5. it would return true only if the j moves to the last of the array
 *  
 * */

package strings;
public class KMP_algo {
	public static void main(String[]args) {
		String text="abcdefcacg";
		String pattern = "fcacz";
		System.out.println(KMP(text,pattern));
	}
	
	
	//this would return an array of the preffix 
	public static int[] preffixTable(String pat) {
		int []table = new int[pat.length()];
		int index=0;
		for(int i=1;i<pat.length();) {
			if(pat.charAt(i)==pat.charAt(index)) {
				table[i]= index+1;
				i++;
				index++;
			}
			else {
				if(index!=0) {
					index = table[i-1];
				}
				else {
					table[i]=0;
					i++;
				}
			}
		}

		return table;
	}
	
	
	//this is the basic algorithm of KMP
	public static boolean KMP(String text,String pat) {
		int[]preffix = preffixTable(pat);
		int i=0;
		int j=0;
		while(i<text.length() && j<pat.length()) {
			if(text.charAt(i)==pat.charAt(j)) {
				i++;
				j++;
			}
			else {
				if(j!=0) {
					j=preffix[j-1];
				}
				else {
					i++;
				}
			}
		}
		
		
		if(j==pat.length()) return true;
		else return false;
	}
	
}


