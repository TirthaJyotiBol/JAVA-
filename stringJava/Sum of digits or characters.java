package strings;

import java.util.Scanner;

public class SumOfDigits_or_Characters {
	public static void main(String[]args) {
		
		
		int digitSum =0;
		
		//take inputs
		Scanner scan =  new Scanner(System.in);
		String input1 = scan.next();
		int input2 = scan.nextInt();
		
		//case 1
		if(input2==0) {
			
			for(int i=0;i<input1.length();i++) {
				char c = input1.charAt(i);
				
				if(Character.isDigit(c)) {   //this method is used to check if character is a digit or not
					digitSum+=Integer.parseInt(Character.toString(c));// if digit then convert it into  string and then cnvert the string into integer
				}
				
			}
			
			System.out.println(digitSum);
	
		}
		
		else if(input2==1) {
			for(int i=0;i<input1.length();i++) {
				char c = input1.charAt(i);
				if(!Character.isDigit(c)) { // print only the values which are not digit
					System.out.print(c);
				}
				
			}
		}
		else {
			System.out.println("Not valid");
		}
	
}

}
