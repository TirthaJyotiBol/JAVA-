package multiDimensionalArray;

import java.util.Scanner;

public class searchElement {
	
	public static void main(String[]args) {
		// a check is made to  see if there or not
		boolean isFound = false;
		int temp=0;
		
		
	int[][]a= {{1,2,3,4},{5,6,7,8},{9,89,76,45}};
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter the element you want to search");
    int value = scan.nextInt();
    
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a[0].length;j++)
    	{
    		if(value==a[i][j])
    		{
    			temp = value;
    			isFound =true;
    			break;
    		}
    		
    	}
    }
    
    if(!isFound) {
    	System.out.println("Element not in array");
    }
    if(isFound) {
    	System.out.println(temp+" is found");
    }

}
	
}