	  /*
		 * Split the string in terms of "Space" and store this into a array of String type
		 * for getting the number of words we print the size  of the array
		 */

public class countWords {
	public static void main(String[]args) {
		String str = "Hello there this is Tirtha Jyoti Bol";
	
		 String[] temp= str.split(" ");
		 for(int i=0;i<temp.length;i++) {
			 System.out.print(temp[i]+" ");
		 }

	}
}
