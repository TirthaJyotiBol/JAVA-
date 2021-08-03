/*
 * Take a dataStructure whrere you can keep some words
 * Take a sentence with which we want to compare 
 * Array is taken where we can put the count number of words
 * finally at the last index we can find all the words count in the dictionary that can be made 
 * */

package strings;
import java.util.Scanner;
import java.util.HashSet;

public class wordBreak {
	
	public static void main(String[]args) {
		HashSet<String> dictionary = new HashSet<>();     //Hashset DS is taken where to put elements
		
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();                         //total number of words to be put in the dictionary
		for(int i=0;i<n;i++) {
			dictionary.add(scan.next());
		}
		String sentence = scan.next();                   //The sentence taken where we are to find words
		
		System.out.println(WBP(sentence,dictionary));     //called the function of Word Break
		
	}

	
	
	public  static int WBP(String sentence,HashSet<String>dictionary) {
		int[]dp = new int[sentence.length()];	//array is made of size same as sentence
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<=i;j++) {             //sub array is for checking each sub-array with the sentence
				String word_to_find = sentence.substring(j, i+1);        
				if(dictionary.contains(word_to_find)) {
					// if the sentence contains any subarray
				    // that is present in the dictionary
					//put the index count into the array
					if(j>0) {
						// boundary condition for greater than 1st element
						
					dp[i]+=dp[j-1];
					}
					else {
						// if 1st element is found then put 1 in array
						dp[i]=1;
					}
				}
				
			}
		}
		
		return dp[sentence.length()-1];  // the last index contains the total words present count
	}
	
}

