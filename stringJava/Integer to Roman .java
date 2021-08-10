package strings;
import java.util.Scanner;
//all the values upto thousand category  are stored at string Arrays
// thousand -> num/1000
// hundred ->  (remainder 0f thousand) / 100
// tens ->  (remainder od hundred) / 10
// unit -> (remainder of tens)

// summmasion of all these gives the string value of roman

public class IntegerToRoman {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int num = scan.nextInt();
		    String[]thousand = {"","M","MM","MMM"};
	        String[]hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","DM"};
	        String[]tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	        String[]units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	        
	        String ans="";
	        ans= thousand[(num/1000)] +  hundreds[(num%1000)/100] +  tens[(num%100)/10] +  units[(num%10)];
	        System.out.println(ans);
	}

}
